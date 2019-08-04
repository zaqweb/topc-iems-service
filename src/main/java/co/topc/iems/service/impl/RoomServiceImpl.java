package co.topc.iems.service.impl;

import co.topc.iems.entity.Room;
import co.topc.iems.entity.RoomExample;
import co.topc.iems.entity.req.AddRoomReq;
import co.topc.iems.entity.req.RoomListReq;
import co.topc.iems.entity.req.UpdateRoomReq;
import co.topc.iems.mapper.RoomMapper;
import co.topc.iems.service.IRoomService;
import co.topc.web.commons.utils.TopcStringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author fantao
 * @date 2019/7/30 12:32
 */
@Service
@Primary
public class RoomServiceImpl implements IRoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Page<Room> getRoomList(RoomListReq roomListReq) {
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        if (TopcStringUtils.isNotBlank(roomListReq.getRoomNo())) {
            criteria.andRoomNoEqualTo(roomListReq.getRoomNo());
        }
        if (TopcStringUtils.isNotBlank(roomListReq.getRoomStatus())) {
            criteria.andRoomStatusEqualTo(roomListReq.getRoomStatus());
        }
        if (null != roomListReq.getRoomArea()) {
            // 房间面积使用between查询
            criteria.andRoomAreaBetween(roomListReq.getRoomArea(), roomListReq.getRoomArea());
        }
        Page<Room> page = PageHelper.startPage(roomListReq.getPageNum(), roomListReq.getPageSize(), Boolean.TRUE);
        roomMapper.selectByExample(roomExample);

        return page;
    }

    @Override
    public Room getRoomDetail(String pkId) {
        return null;
    }

    @Override
    public void addRoom(AddRoomReq addRoomReq) {

    }

    @Override
    public void updateRoom(UpdateRoomReq updateRoomReq) {

    }

    @Override
    public void deleteRoom(String pkId) {

    }
}
