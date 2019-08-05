package co.topc.iems.service.impl;

import co.topc.iems.entity.Renter;
import co.topc.iems.entity.RenterExample;
import co.topc.iems.entity.req.AddRenterReq;
import co.topc.iems.entity.req.ListRenterReq;
import co.topc.iems.entity.req.UpdateRenterReq;
import co.topc.iems.mapper.RenterMapper;
import co.topc.iems.service.IRenterService;
import co.topc.web.commons.constants.TopcStringConstant;
import co.topc.web.commons.utils.TopcStringUtils;
import co.topc.web.commons.utils.TopcUUIDUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author fantao
 * @date 2019/7/30 12:34
 */
@Service
@Primary
public class RenterServiceImpl implements IRenterService {

    @Autowired
    private RenterMapper renterMapper;

    @Override
    public Page<Renter> getRenterList(ListRenterReq listRenterReq) {
        RenterExample renterExample = new RenterExample();
        RenterExample.Criteria criteria = renterExample.createCriteria();

        criteria.andLesseeIdEqualTo(listRenterReq.getLesseeId());
        criteria.andIsDeletedEqualTo(TopcStringConstant.N.toUpperCase());
        if (TopcStringUtils.isNotBlank(listRenterReq.getRenterComType())) {
            criteria.andRenterComTypeEqualTo(listRenterReq.getRenterComType());
        }
        if (TopcStringUtils.isNotBlank(listRenterReq.getRenterContactor())) {
            criteria.andRenterContactorEqualTo(listRenterReq.getRenterContactor());
        }
        if (TopcStringUtils.isNotBlank(listRenterReq.getRenterContactorTelephone())) {
            criteria.andRenterContactorTelephoneEqualTo(listRenterReq.getRenterContactorTelephone());
        }
        if (TopcStringUtils.isNotBlank(listRenterReq.getRenterName())) {
            criteria.andRenterNameEqualTo(listRenterReq.getRenterName());
        }
        if (TopcStringUtils.isNotBlank(listRenterReq.getRenterType())) {
            criteria.andRenterTypeEqualTo(listRenterReq.getRenterType());
        }

        Page<Renter> page = PageHelper.startPage(listRenterReq.getPageNum(), listRenterReq.getPageSize(), Boolean.TRUE);
        renterMapper.selectByExample(renterExample);

        return page;
    }

    @Override
    public Renter getRenterDetail(String pkId) {
        return renterMapper.selectByPrimaryKey(pkId);
    }

    @Override
    public void addRenter(AddRenterReq addRenterReq) {
        Renter renter = new Renter();
        BeanUtils.copyProperties(addRenterReq, renter);
        renter.setPkId(TopcUUIDUtils.getUUIDWithoutDash());

        // 暂时这样写,后面可能从session里面取当前登陆用户信息
        renter.setCreateBy("system");
        renter.setUpdateBy("system");
        renter.setCreateTime(new Date());
        renter.setUpdateTime(new Date());

        renterMapper.insertSelective(renter);
    }

    @Override
    public void updateRenter(UpdateRenterReq updateRenterReq) {
        Renter renter = new Renter();
        BeanUtils.copyProperties(updateRenterReq, renter);
        // TODO 后续从session中取值
        renter.setUpdateBy("fan");
        renter.setUpdateTime(new Date());
        renterMapper.updateByPrimaryKeySelective(renter);
    }

    @Override
    public void deleteRenter(String pkId) {
        Renter renter = new Renter();
        renter.setPkId(pkId);
        renter.setIsDeleted(TopcStringConstant.Y.toUpperCase());

        renter.setUpdateBy("fan");
        renter.setUpdateTime(new Date());
        renterMapper.updateByPrimaryKeySelective(renter);
    }
}
