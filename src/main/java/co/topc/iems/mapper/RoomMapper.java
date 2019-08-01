package co.topc.iems.mapper;

import co.topc.base.auth.mapper.MyBatisBaseDao;
import co.topc.iems.entity.Room;
import co.topc.iems.entity.RoomExample;
import org.springframework.stereotype.Repository;

/**
 * RoomMapper继承基类
 */
@Repository
public interface RoomMapper extends MyBatisBaseDao<Room, String, RoomExample> {
}