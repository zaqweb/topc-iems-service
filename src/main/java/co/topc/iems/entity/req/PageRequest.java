package co.topc.iems.entity.req;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;

/**
 * 分页参数实体
 *
 * @author fantao
 * @date 2019/7/30 12:22
 */
public class PageRequest  {

    @Min(value = 1,message = "pageSize不能小于1")
    private int pageSize;
    private int pageNum;
    /**
     * 排序属性
     */
    @ApiModelProperty(value="排序属性",name="sortField",hidden = true)
    private String sortField;
    /**
     * 排序字段
     */
    @ApiModelProperty(value="排序字段",name="sortOrder",hidden = true)
    private String sortOrder;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
