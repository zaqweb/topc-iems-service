package co.topc.iems.entity.req;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 分页查询房间列表请求实体
 *
 * @author fantao
 * @date 2019/7/30 12:22
 */
public class RoomListReq extends PageRequest implements Serializable {

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
}
