package co.topc.iems.mapper;

import co.topc.iems.entity.Renter;
import co.topc.iems.entity.RenterExample;
import org.springframework.stereotype.Repository;

/**
 * RenterMapper继承基类
 */
@Repository
public interface RenterMapper extends MyBatisBaseDao<Renter, String, RenterExample> {
}