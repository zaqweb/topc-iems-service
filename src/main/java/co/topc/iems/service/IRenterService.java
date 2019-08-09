package co.topc.iems.service;

import co.topc.iems.entity.Renter;
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
     * @param renter 查询条件封装
     * @return
     */
    Page<Renter> getRenterList(Renter renter);

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
     * @param renter 新增Renter请求封装
     */
    void addRenter(Renter renter);

    /**
     * 修改Renter
     *
     * @param renter 修改Renter请求封装
     */
    void updateRenter(Renter renter);

    /**
     * 删除Renter
     *
     * @param pkId Renter主键id
     */
    void deleteRenter(String pkId);
}
