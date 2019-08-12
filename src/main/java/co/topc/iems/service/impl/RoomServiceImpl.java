package co.topc.iems.service.impl;

import co.topc.iems.entity.Room;
import co.topc.iems.entity.RoomExample;
import co.topc.iems.entity.req.ListRoomReq;
import co.topc.iems.mapper.RoomMapper;
import co.topc.iems.service.IRoomService;
import co.topc.web.commons.constants.TopcStringConstant;
import co.topc.web.commons.utils.TopcStringUtils;
import co.topc.web.commons.utils.TopcUUIDUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
    public Page<Room> getRoomList(ListRoomReq listRoomReq) {
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andLesseeIdEqualTo(listRoomReq.getLesseeId());
        criteria.andIsDeletedEqualTo(TopcStringConstant.N.toUpperCase());
        if (TopcStringUtils.isNotBlank(listRoomReq.getRoomNo())) {
            criteria.andRoomNoEqualTo(listRoomReq.getRoomNo());
        }
        if (TopcStringUtils.isNotBlank(listRoomReq.getRoomStatus())) {
            criteria.andRoomStatusEqualTo(listRoomReq.getRoomStatus());
        }
        if (null != listRoomReq.getRoomArea()) {
            // 房间面积使用between查询
            criteria.andRoomAreaBetween(listRoomReq.getRoomArea(), listRoomReq.getRoomArea());
        }
        Page<Room> page = PageHelper.startPage(listRoomReq.getPageNum(), listRoomReq.getPageSize(), Boolean.TRUE);
        roomMapper.selectByExample(roomExample);

        return page;
    }

    @Override
    public Room getRoomDetail(String pkId) {
        return roomMapper.selectByPrimaryKey(pkId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addRoom(Room roomParam) {
        Room room = new Room();
        room.setPkId(TopcUUIDUtils.getUUIDWithoutDash());
        room.setFloorPkId(roomParam.getFloorPkId());
        room.setLesseeId(roomParam.getLesseeId());
        room.setRoomArea(roomParam.getRoomArea());
        room.setRoomNo(roomParam.getRoomNo());
        room.setRoomMark(roomParam.getRoomMark());
        room.setRoomStatus(roomParam.getRoomStatus());

        // 暂时这样写,后面可能从session里面取当前登陆用户信息
        room.setCreateBy(roomParam.getCreateBy());
        room.setUpdateBy(roomParam.getUpdateBy());
        room.setCreateTime(new Date());
        room.setUpdateTime(new Date());
        roomMapper.insertSelective(room);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateRoom(Room roomParam) {
        Room room = new Room();
        BeanUtils.copyProperties(roomParam, room);
        // TODO 后续从session中取值
        room.setUpdateBy("fan");
        room.setUpdateTime(new Date());
        roomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteRoom(String pkId) {
        Room room = new Room();
        room.setPkId(pkId);
        room.setIsDeleted(TopcStringConstant.Y.toUpperCase());

        room.setUpdateBy("fan");
        room.setUpdateTime(new Date());
        roomMapper.updateByPrimaryKeySelective(room);
    }
}
