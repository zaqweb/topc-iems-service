package co.topc.iems.service.impl;

import co.topc.iems.common.util.Constant;
import co.topc.iems.entity.Floor;
import co.topc.iems.entity.FloorExample;
import co.topc.iems.entity.req.ListFloorReq;
import co.topc.iems.mapper.FloorMapper;
import co.topc.iems.service.IFloorService;
import co.topc.web.commons.utils.TopcStringUtils;
import co.topc.web.commons.utils.TopcUUIDUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/3 19:39
 */
@Service
@Primary
public class FloorServiceImpl implements IFloorService {
    @Autowired
    private FloorMapper floorMapper;

    @Override
    public Page<Floor> getFloorList(ListFloorReq floor) {
        FloorExample example = new FloorExample();
        FloorExample.Criteria criteria = example.createCriteria();
        if (TopcStringUtils.isNotBlank(floor.getFloorStatus())) {
            criteria.andFloorStatusEqualTo(floor.getFloorStatus());
        }
        criteria.andIsDeletedEqualTo(Constant.STIRNG_N);
        Page<Floor> page = PageHelper.startPage(floor.getPageNum(), floor.getPageSize(), Boolean.TRUE);
        floorMapper.selectByExample(example);
        return page;
    }

    @Override
    public Floor getFloorDetail(String pkId) {
        return floorMapper.selectByPrimaryKey(pkId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addFloor(Floor floor) {
        floor.setPkId(TopcUUIDUtils.getUUIDWithoutDash());
        floor.setIsDeleted(Constant.STIRNG_N);
        floor.setCreateBy("System");
        floor.setUpdateBy("System");
        floor.setCreateTime(new Date());
        floor.setUpdateTime(new Date());
        floor.setLesseeId("IEMS001");
        return floorMapper.insert(floor);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateFloor(Floor floor) {
        floor.setUpdateBy("System");
        floor.setUpdateTime(new Date());
        return floorMapper.updateByPrimaryKey(floor);
    }
}
