package co.topc.iems.service;

import co.topc.iems.entity.Room;
import co.topc.iems.entity.req.AddRoomReq;
import co.topc.iems.entity.req.RoomListReq;
import co.topc.iems.entity.req.UpdateRoomReq;
import com.github.pagehelper.Page;

/**
 * @author fantao
 * @date 2019/7/30 12:32
 */
public interface IRoomService {

    /**
     * 分页查询房间列表
     *
     * @param roomListReq 查询条件封装
     * @return
     */
    Page<Room> getRoomList(RoomListReq roomListReq);

    /**
     * 根据room主键id查询room详情
     *
     * @param pkId room主键id
     * @return
     */
    Room getRoomDetail(String pkId);

    /**
     * 新增room
     *
     * @param addRoomReq 新增room请求封装
     */
    void addRoom(AddRoomReq addRoomReq);

    /**
     * 修改room
     *
     * @param updateRoomReq 修改room请求封装
     */
    void updateRoom(UpdateRoomReq updateRoomReq);

    /**
     * 删除room
     *
     * @param pkId room主键id
     */
    void deleteRoom(String pkId);

}
