package co.topc.iems.entity.req;

import java.io.Serializable;

/**
 * 分页参数实体
 *
 * @author fantao
 * @date 2019/7/30 12:22
 */
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -4869594085374385813L;

    private int pageSize;
    private int pageNum;

    private String sortField;
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
