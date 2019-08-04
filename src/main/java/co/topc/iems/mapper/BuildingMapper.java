package co.topc.iems.mapper;

import co.topc.iems.entity.Building;
import co.topc.iems.entity.BuildingExample;
import org.springframework.stereotype.Repository;

/**
 * BuildingMapper继承基类
 */
@Repository
public interface BuildingMapper extends MyBatisBaseDao<Building, String, BuildingExample> {
}