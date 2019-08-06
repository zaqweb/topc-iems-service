package co.topc.iems.service;

import co.topc.iems.entity.Floor;
import co.topc.iems.entity.req.ListFloorReq;
import com.github.pagehelper.Page;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/3 19:35
 */
public interface IFloorService {

    /**
     * 分页查询楼层列表
     *
     * @param floor 查询条件封装
     * @return Floor集合
     */
    Page<Floor> getFloorList(ListFloorReq floor);

    /**
     * 根据Floor主键id查询Floor详情
     *
     * @param pkId Floor主键id
     * @return Floor
     */
    Floor getFloorDetail(String pkId);

    /**
     * 新增Floor
     *
     * @param floor 新增Floor请求封装
     * @return 记录数
     */
    int addFloor(Floor floor);

    /**
     * 修改Floor
     *
     * @param floor 修改Floor请求封装
     * @return 记录数
     */
    int updateFloor(Floor floor);
}
