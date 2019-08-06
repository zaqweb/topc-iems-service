package co.topc.iems.service.impl;

import co.topc.iems.common.util.Constant;
import co.topc.iems.entity.Building;
import co.topc.iems.entity.BuildingExample;
import co.topc.iems.entity.req.ListBuildingReq;
import co.topc.iems.mapper.BuildingMapper;
import co.topc.iems.service.IBuildingService;
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
 * @date 2019/7/31 23:19
 */
@Service
@Primary
public class BuildingServiceImpl implements IBuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    public Page<Building> getBuildingList(ListBuildingReq building) {
        BuildingExample example = new BuildingExample();
        BuildingExample.Criteria criteria = example.createCriteria();
        if (TopcStringUtils.isNotBlank(building.getBuildingName())) {
            criteria.andBuildingNameLike(building.getBuildingName());
        }
        criteria.andIsDeletedEqualTo(Constant.STIRNG_N);
        Page<Building> page = PageHelper.startPage(building.getPageNum(), building.getPageSize(), Boolean.TRUE);
        buildingMapper.selectByExample(example);
        return page;
    }

    @Override
    public Building getBuildingDetail(String pkId) {
        return buildingMapper.selectByPrimaryKey(pkId);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateBuilding(Building building) {
        building.setUpdateBy("System");
        building.setUpdateTime(new Date());
        return buildingMapper.updateByPrimaryKey(building);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addBuilding(Building building) {
        building.setPkId(TopcUUIDUtils.getUUIDWithoutDash());
        building.setIsDeleted(Constant.STIRNG_N);
        building.setCreateBy("System");
        building.setUpdateBy("System");
        building.setCreateTime(new Date());
        building.setUpdateTime(new Date());
        building.setLesseeId("IEMS001");
        return buildingMapper.insert(building);
    }
}
