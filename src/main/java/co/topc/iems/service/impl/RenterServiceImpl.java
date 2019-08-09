package co.topc.iems.service.impl;

import co.topc.iems.entity.Renter;
import co.topc.iems.entity.RenterExample;
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
    public Page<Renter> getRenterList(Renter renter) {
        RenterExample renterExample = new RenterExample();
        RenterExample.Criteria criteria = renterExample.createCriteria();

        criteria.andLesseeIdEqualTo(renter.getLesseeId());
        criteria.andIsDeletedEqualTo(TopcStringConstant.N.toUpperCase());
        if (TopcStringUtils.isNotBlank(renter.getRenterComType())) {
            criteria.andRenterComTypeEqualTo(renter.getRenterComType());
        }
        if (TopcStringUtils.isNotBlank(renter.getRenterContactor())) {
            criteria.andRenterContactorEqualTo(renter.getRenterContactor());
        }
        if (TopcStringUtils.isNotBlank(renter.getRenterContactorTelephone())) {
            criteria.andRenterContactorTelephoneEqualTo(renter.getRenterContactorTelephone());
        }
        if (TopcStringUtils.isNotBlank(renter.getRenterName())) {
            criteria.andRenterNameEqualTo(renter.getRenterName());
        }
        if (TopcStringUtils.isNotBlank(renter.getRenterType())) {
            criteria.andRenterTypeEqualTo(renter.getRenterType());
        }

        Page<Renter> page = PageHelper.startPage(renter.getPageNum(), renter.getPageSize(), Boolean.TRUE);
        renterMapper.selectByExample(renterExample);

        return page;
    }

    @Override
    public Renter getRenterDetail(String pkId) {
        return renterMapper.selectByPrimaryKey(pkId);
    }

    @Override
    public void addRenter(Renter renterParam) {
        Renter renter = new Renter();
        BeanUtils.copyProperties(renterParam, renter);
        renter.setPkId(TopcUUIDUtils.getUUIDWithoutDash());

        // 暂时这样写,后面可能从session里面取当前登陆用户信息
        renter.setCreateBy("system");
        renter.setUpdateBy("system");
        renter.setCreateTime(new Date());
        renter.setUpdateTime(new Date());

        renterMapper.insertSelective(renter);
    }

    @Override
    public void updateRenter(Renter renterParam) {
        Renter renter = new Renter();
        BeanUtils.copyProperties(renterParam, renter);
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
