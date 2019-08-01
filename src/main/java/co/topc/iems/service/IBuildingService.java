package co.topc.iems.service;

import co.topc.iems.entity.Building;
import com.github.pagehelper.Page;

/**
 * @author RuntimeExcepti0n
 * @date 2019/7/31 23:11
 */
public interface IBuildingService {

    /**
     * 分页查询楼宇列表
     *
     * @param building 查询条件封装
     * @return Building集合
     */
    Page<Building> getBuildingList(Building building);

    /**
     * 根据Building主键id查询Building详情
     *
     * @param pkId Building主键id
     * @return Building
     */
    Building getBuildingDetail(String pkId);

    /**
     * 新增Building
     *
     * @param building 新增Building请求封装
     * @return 记录数
     */
    int addBuilding(Building building);

    /**
     * 修改Building
     *
     * @param building 修改Building请求封装
     * @return 记录数
     */
    int updateBuilding(Building building);

}
