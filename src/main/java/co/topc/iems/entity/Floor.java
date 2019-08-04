package co.topc.iems.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * t_iems_floor
 * @author 
 */
public class Floor implements Serializable {
    /**
     * 主键ID
     */
    private String pkId;

    /**
     * 楼宇ID
     */
    private String buildingPkId;

    /**
     * 楼层
     */
    private Integer floorNo;

    private Double floorArea;

    private String floorManager;

    /**
     * 负责人电话
     */
    private String floorManagerTelephone;

    /**
     * 楼层状态
     */
    private String floorStatus;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 	创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    private Date updateTime;

    /**
     * 租户ID
     */
    private String lesseeId;

    private static final long serialVersionUID = 1L;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getBuildingPkId() {
        return buildingPkId;
    }

    public void setBuildingPkId(String buildingPkId) {
        this.buildingPkId = buildingPkId;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public Double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Double floorArea) {
        this.floorArea = floorArea;
    }

    public String getFloorManager() {
        return floorManager;
    }

    public void setFloorManager(String floorManager) {
        this.floorManager = floorManager;
    }

    public String getFloorManagerTelephone() {
        return floorManagerTelephone;
    }

    public void setFloorManagerTelephone(String floorManagerTelephone) {
        this.floorManagerTelephone = floorManagerTelephone;
    }

    public String getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(String floorStatus) {
        this.floorStatus = floorStatus;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Floor other = (Floor) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getBuildingPkId() == null ? other.getBuildingPkId() == null : this.getBuildingPkId().equals(other.getBuildingPkId()))
            && (this.getFloorNo() == null ? other.getFloorNo() == null : this.getFloorNo().equals(other.getFloorNo()))
            && (this.getFloorArea() == null ? other.getFloorArea() == null : this.getFloorArea().equals(other.getFloorArea()))
            && (this.getFloorManager() == null ? other.getFloorManager() == null : this.getFloorManager().equals(other.getFloorManager()))
            && (this.getFloorManagerTelephone() == null ? other.getFloorManagerTelephone() == null : this.getFloorManagerTelephone().equals(other.getFloorManagerTelephone()))
            && (this.getFloorStatus() == null ? other.getFloorStatus() == null : this.getFloorStatus().equals(other.getFloorStatus()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLesseeId() == null ? other.getLesseeId() == null : this.getLesseeId().equals(other.getLesseeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getBuildingPkId() == null) ? 0 : getBuildingPkId().hashCode());
        result = prime * result + ((getFloorNo() == null) ? 0 : getFloorNo().hashCode());
        result = prime * result + ((getFloorArea() == null) ? 0 : getFloorArea().hashCode());
        result = prime * result + ((getFloorManager() == null) ? 0 : getFloorManager().hashCode());
        result = prime * result + ((getFloorManagerTelephone() == null) ? 0 : getFloorManagerTelephone().hashCode());
        result = prime * result + ((getFloorStatus() == null) ? 0 : getFloorStatus().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLesseeId() == null) ? 0 : getLesseeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", buildingPkId=").append(buildingPkId);
        sb.append(", floorNo=").append(floorNo);
        sb.append(", floorArea=").append(floorArea);
        sb.append(", floorManager=").append(floorManager);
        sb.append(", floorManagerTelephone=").append(floorManagerTelephone);
        sb.append(", floorStatus=").append(floorStatus);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", lesseeId=").append(lesseeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}