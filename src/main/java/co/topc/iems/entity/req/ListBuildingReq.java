package co.topc.iems.entity.req;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/6 0:23
 */
public class ListBuildingReq extends PageRequest implements Serializable {

    /**
     * 楼宇名称
     */
    @ApiModelProperty(value = "楼宇名称", name = "buildingName")
    private String buildingName;

    /**
     * 楼层数
     */
    @ApiModelProperty(value = "楼层数", name = "buildingFloors")
    private Integer buildingFloors;

    /**
     * 面积
     */
    @ApiModelProperty(value = "楼宇面积", name = "buildingArea")
    private Double buildingArea;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "楼宇详细地址", name = "buildingAddress")
    private String buildingAddress;

    /**
     * 楼宇状态
     */
    @ApiModelProperty(value = "楼宇状态", name = "buildingStatus")
    private String buildingStatus;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getBuildingFloors() {
        return buildingFloors;
    }

    public void setBuildingFloors(Integer buildingFloors) {
        this.buildingFloors = buildingFloors;
    }

    public Double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Double buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getBuildingStatus() {
        return buildingStatus;
    }

    public void setBuildingStatus(String buildingStatus) {
        this.buildingStatus = buildingStatus;
    }
}
