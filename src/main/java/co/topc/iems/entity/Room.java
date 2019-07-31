package co.topc.iems.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 房间实体类
 *
 * t_iems_room
 * @author
 */
public class Room implements Serializable {
    /**
     * 主键
     */
    private String pkId;

    /**
     * 楼层ID
     */
    private String floorPkId;

    /**
     * 房间号
     */
    private String roomNo;

    /**
     * 房间面积
     */
    private BigDecimal roomArea;

    /**
     * 房间状态
     */
    private String roomStatus;

    /**
     * 备注
     */
    private String roomMark;

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

    public String getFloorPkId() {
        return floorPkId;
    }

    public void setFloorPkId(String floorPkId) {
        this.floorPkId = floorPkId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public BigDecimal getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(BigDecimal roomArea) {
        this.roomArea = roomArea;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomMark() {
        return roomMark;
    }

    public void setRoomMark(String roomMark) {
        this.roomMark = roomMark;
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
        Room other = (Room) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getFloorPkId() == null ? other.getFloorPkId() == null : this.getFloorPkId().equals(other.getFloorPkId()))
            && (this.getRoomNo() == null ? other.getRoomNo() == null : this.getRoomNo().equals(other.getRoomNo()))
            && (this.getRoomArea() == null ? other.getRoomArea() == null : this.getRoomArea().equals(other.getRoomArea()))
            && (this.getRoomStatus() == null ? other.getRoomStatus() == null : this.getRoomStatus().equals(other.getRoomStatus()))
            && (this.getRoomMark() == null ? other.getRoomMark() == null : this.getRoomMark().equals(other.getRoomMark()))
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
        result = prime * result + ((getFloorPkId() == null) ? 0 : getFloorPkId().hashCode());
        result = prime * result + ((getRoomNo() == null) ? 0 : getRoomNo().hashCode());
        result = prime * result + ((getRoomArea() == null) ? 0 : getRoomArea().hashCode());
        result = prime * result + ((getRoomStatus() == null) ? 0 : getRoomStatus().hashCode());
        result = prime * result + ((getRoomMark() == null) ? 0 : getRoomMark().hashCode());
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
        sb.append(", floorPkId=").append(floorPkId);
        sb.append(", roomNo=").append(roomNo);
        sb.append(", roomArea=").append(roomArea);
        sb.append(", roomStatus=").append(roomStatus);
        sb.append(", roomMark=").append(roomMark);
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