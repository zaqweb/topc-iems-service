package co.topc.iems.mapper;

import co.topc.iems.entity.Floor;
import co.topc.iems.entity.FloorExample;
import org.springframework.stereotype.Repository;

/**
 * FloorMapper继承基类
 */
@Repository
public interface FloorMapper extends MyBatisBaseDao<Floor, String, FloorExample> {
}