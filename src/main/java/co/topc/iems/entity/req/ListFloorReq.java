package co.topc.iems.entity.req;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/6 0:38
 */
public class ListFloorReq extends PageRequest implements Serializable {

    /**
     * 楼宇ID
     */
    @ApiModelProperty(value = "楼宇ID", name = "buildingPkId", hidden = true)
    private String buildingPkId;

    /**
     * 楼层
     */
    @ApiModelProperty(value = "楼层", name = "floorNo")
    private Integer floorNo;
    /**
     * 楼层面积
     */
    @ApiModelProperty(value = "楼层面积", name = "floorNo")
    private Double floorArea;
    /**
     * 楼宇负责人
     */
    @ApiModelProperty(value = "楼宇负责人", name = "floorManager")
    private String floorManager;

    /**
     * 负责人电话
     */
    @ApiModelProperty(value = "负责人电话", name = "floorManagerTelephone")
    private String floorManagerTelephone;

    /**
     * 楼层状态
     */
    @ApiModelProperty(value = "楼层状态", name = "floorStatus")
    private String floorStatus;

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
}
