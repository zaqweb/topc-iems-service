package co.topc.iems.validate;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/1 22:19
 */
public class BuildingValidateGroup {
    /**
     * Building新增校验
     */
    public interface Insert{}

    /**
     * Building修改校验
     */
    public interface Update{}

    /**
     * Building删除校验
     */
    public interface Delete{}
    /**
     * Building列表查询校验
     */
    public interface List{}
    /**
     * Building详情查询校验
     */
    public interface Detail{}
}
