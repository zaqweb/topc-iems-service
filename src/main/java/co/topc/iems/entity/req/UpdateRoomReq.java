package co.topc.iems.entity.req;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 修改房间请求实体
 *
 * @author fantao
 * @date 2019/7/30 12:48
 */
public class UpdateRoomReq implements Serializable {

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
     * 租户ID
     */
    private String lesseeId;

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

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }
}
