package co.topc.iems.service;

import co.topc.iems.entity.Renter;
import co.topc.iems.entity.req.AddRenterReq;
import co.topc.iems.entity.req.ListRenterReq;
import co.topc.iems.entity.req.UpdateRenterReq;
import com.github.pagehelper.Page;

/**
 * 租客相关service
 *
 * @author fantao
 * @date 2019/7/30 12:32
 */
public interface IRenterService {

    /**
     * 分页查询租客列表
     *
     * @param listRenterReq 查询条件封装
     * @return
     */
    Page<Renter> getRenterList(ListRenterReq listRenterReq);

    /**
     * 根据Renter主键id查询Renter详情
     *
     * @param pkId Renter主键id
     * @return
     */
    Renter getRenterDetail(String pkId);

    /**
     * 新增Renter
     *
     * @param addRenterReq 新增Renter请求封装
     */
    void addRenter(AddRenterReq addRenterReq);

    /**
     * 修改Renter
     *
     * @param updateRenterReq 修改Renter请求封装
     */
    void updateRenter(UpdateRenterReq updateRenterReq);

    /**
     * 删除Renter
     *
     * @param pkId Renter主键id
     */
    void deleteRenter(String pkId);
}
