package co.topc.iems.entity;

import co.topc.iems.entity.req.PageRequest;
import co.topc.iems.validate.BuildingValidateGroup;
import co.topc.web.commons.TopcWebResponse;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * t_iems_building
 *
 * @author
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Building extends PageRequest implements Serializable {

    public interface ShowList extends TopcWebResponse.WebResponse {
    }

    /**
     * 主键ID
     */
    @NotBlank(message = "主键Id不能为空", groups = {BuildingValidateGroup.Update.class})
    @ApiModelProperty(value = "主键Id", name = "pkId", hidden = true)
    private String pkId;

    /**
     * 楼宇名称
     */
    @NotBlank(message = "楼宇名称不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 100, message = "楼宇名称不能超过100个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇名称", name = "buildingName", required = true)
    @JsonView(Building.ShowList.class)
    private String buildingName;

    /**
     * 图片
     */
    @NotBlank(message = "楼宇图片URL不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 200, message = "楼宇图片URL不能超过200个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "图片URL", name = "buildingPic", required = true)
    private String buildingPic;

    /**
     * 图片缩略图
     */
    private String buildingPicSmall;

    /**
     * 楼层数
     */
    @NotNull(message = "楼层数不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Min(value = 1, message = "楼层数不能小于1", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼层数", name = "buildingFloors", required = true)
    private Integer buildingFloors;

    /**
     * 面积
     */
    @NotNull(message = "楼宇面积不能为空", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇面积", name = "buildingArea", required = true)
    @JsonView(Building.ShowList.class)
    private Double buildingArea;

    /**
     * 省份
     */
    @NotBlank(message = "楼宇省份不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 20, message = "楼宇省份不能超过20个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇省份", name = "buildingLocationProvince", required = true)
    private String buildingLocationProvince;

    /**
     * 城市
     */
    @NotBlank(message = "楼宇城市不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 20, message = "楼宇城市不能超过20个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇城市", name = "buildingLocationCity", required = true)
    private String buildingLocationCity;

    /**
     * 区/县
     */
    @NotBlank(message = "楼宇区/县不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 20, message = "楼宇区/县不能超过20个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇区/县", name = "buildingLocationDistrict", required = true)
    private String buildingLocationDistrict;

    /**
     * 详细地址
     */
    @JsonView(Building.ShowList.class)
    @NotBlank(message = "楼宇详细地址不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 20, message = "楼宇详细地址不能超过20个字符", groups = {BuildingValidateGroup.Insert.class})
    @ApiModelProperty(value = "楼宇详细地址", name = "buildingAddress", required = true)
    private String buildingAddress;

    /**
     * 主管
     */
    @ApiModelProperty(value = "楼宇主管", name = "buildingManager")
    private String buildingManager;

    /**
     * 主管电话
     */
    @ApiModelProperty(value = "楼宇主管电话", name = "buildingManagerTelephone")
    private String buildingManagerTelephone;

    /**
     * 楼宇电话
     */
    @ApiModelProperty(value = "楼宇电话", name = "buildingTelephone")
    private String buildingTelephone;

    /**
     * 楼宇状态
     */
    @NotBlank(message = "楼宇状态不能为空", groups = {BuildingValidateGroup.Insert.class})
    @Length(max = 2, message = "楼宇状态不能超过2个字符", groups = {BuildingValidateGroup.Insert.class})
    @JsonView(Building.ShowList.class)
    @ApiModelProperty(value = "楼宇状态", name = "buildingStatus", required = true)
    private String buildingStatus;

    /**
     * 是否删除
     */
    @JsonIgnore
    @ApiModelProperty(value = "是否删除", name = "isDeleted", hidden = true)
    private String isDeleted;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人", name = "createBy", hidden = true)
    private String createBy;

    /**
     * 创建时间
     */
    @JsonIgnore
    @ApiModelProperty(value = "创建时间", name = "createBy", hidden = true)
    private Date createTime;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人", name = "updateBy", hidden = true)
    private String updateBy;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间", name = "updateTime", hidden = true)
    private Date updateTime;

    /**
     * 租户ID
     */
    @JsonIgnore
    @ApiModelProperty(value = "租户ID", name = "lesseeId", hidden = true)
    private String lesseeId;

    private static final long serialVersionUID = 1L;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingPic() {
        return buildingPic;
    }

    public void setBuildingPic(String buildingPic) {
        this.buildingPic = buildingPic;
    }

    public String getBuildingPicSmall() {
        return buildingPicSmall;
    }

    public void setBuildingPicSmall(String buildingPicSmall) {
        this.buildingPicSmall = buildingPicSmall;
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

    public String getBuildingLocationProvince() {
        return buildingLocationProvince;
    }

    public void setBuildingLocationProvince(String buildingLocationProvince) {
        this.buildingLocationProvince = buildingLocationProvince;
    }

    public String getBuildingLocationCity() {
        return buildingLocationCity;
    }

    public void setBuildingLocationCity(String buildingLocationCity) {
        this.buildingLocationCity = buildingLocationCity;
    }

    public String getBuildingLocationDistrict() {
        return buildingLocationDistrict;
    }

    public void setBuildingLocationDistrict(String buildingLocationDistrict) {
        this.buildingLocationDistrict = buildingLocationDistrict;
    }

    public String getbuildingAddress() {
        return buildingAddress;
    }

    public void setbuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getBuildingManager() {
        return buildingManager;
    }

    public void setBuildingManager(String buildingManager) {
        this.buildingManager = buildingManager;
    }

    public String getBuildingManagerTelephone() {
        return buildingManagerTelephone;
    }

    public void setBuildingManagerTelephone(String buildingManagerTelephone) {
        this.buildingManagerTelephone = buildingManagerTelephone;
    }

    public String getBuildingTelephone() {
        return buildingTelephone;
    }

    public void setBuildingTelephone(String buildingTelephone) {
        this.buildingTelephone = buildingTelephone;
    }

    public String getBuildingStatus() {
        return buildingStatus;
    }

    public void setBuildingStatus(String buildingStatus) {
        this.buildingStatus = buildingStatus;
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
        Building other = (Building) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
                && (this.getBuildingName() == null ? other.getBuildingName() == null : this.getBuildingName().equals(other.getBuildingName()))
                && (this.getBuildingPic() == null ? other.getBuildingPic() == null : this.getBuildingPic().equals(other.getBuildingPic()))
                && (this.getBuildingPicSmall() == null ? other.getBuildingPicSmall() == null : this.getBuildingPicSmall().equals(other.getBuildingPicSmall()))
                && (this.getBuildingFloors() == null ? other.getBuildingFloors() == null : this.getBuildingFloors().equals(other.getBuildingFloors()))
                && (this.getBuildingArea() == null ? other.getBuildingArea() == null : this.getBuildingArea().equals(other.getBuildingArea()))
                && (this.getBuildingLocationProvince() == null ? other.getBuildingLocationProvince() == null : this.getBuildingLocationProvince().equals(other.getBuildingLocationProvince()))
                && (this.getBuildingLocationCity() == null ? other.getBuildingLocationCity() == null : this.getBuildingLocationCity().equals(other.getBuildingLocationCity()))
                && (this.getBuildingLocationDistrict() == null ? other.getBuildingLocationDistrict() == null : this.getBuildingLocationDistrict().equals(other.getBuildingLocationDistrict()))
                && (this.getbuildingAddress() == null ? other.getbuildingAddress() == null : this.getbuildingAddress().equals(other.getbuildingAddress()))
                && (this.getBuildingManager() == null ? other.getBuildingManager() == null : this.getBuildingManager().equals(other.getBuildingManager()))
                && (this.getBuildingManagerTelephone() == null ? other.getBuildingManagerTelephone() == null : this.getBuildingManagerTelephone().equals(other.getBuildingManagerTelephone()))
                && (this.getBuildingTelephone() == null ? other.getBuildingTelephone() == null : this.getBuildingTelephone().equals(other.getBuildingTelephone()))
                && (this.getBuildingStatus() == null ? other.getBuildingStatus() == null : this.getBuildingStatus().equals(other.getBuildingStatus()))
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
        result = prime * result + ((getBuildingName() == null) ? 0 : getBuildingName().hashCode());
        result = prime * result + ((getBuildingPic() == null) ? 0 : getBuildingPic().hashCode());
        result = prime * result + ((getBuildingPicSmall() == null) ? 0 : getBuildingPicSmall().hashCode());
        result = prime * result + ((getBuildingFloors() == null) ? 0 : getBuildingFloors().hashCode());
        result = prime * result + ((getBuildingArea() == null) ? 0 : getBuildingArea().hashCode());
        result = prime * result + ((getBuildingLocationProvince() == null) ? 0 : getBuildingLocationProvince().hashCode());
        result = prime * result + ((getBuildingLocationCity() == null) ? 0 : getBuildingLocationCity().hashCode());
        result = prime * result + ((getBuildingLocationDistrict() == null) ? 0 : getBuildingLocationDistrict().hashCode());
        result = prime * result + ((getbuildingAddress() == null) ? 0 : getbuildingAddress().hashCode());
        result = prime * result + ((getBuildingManager() == null) ? 0 : getBuildingManager().hashCode());
        result = prime * result + ((getBuildingManagerTelephone() == null) ? 0 : getBuildingManagerTelephone().hashCode());
        result = prime * result + ((getBuildingTelephone() == null) ? 0 : getBuildingTelephone().hashCode());
        result = prime * result + ((getBuildingStatus() == null) ? 0 : getBuildingStatus().hashCode());
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
        sb.append(", buildingName=").append(buildingName);
        sb.append(", buildingPic=").append(buildingPic);
        sb.append(", buildingPicSmall=").append(buildingPicSmall);
        sb.append(", buildingFloors=").append(buildingFloors);
        sb.append(", buildingArea=").append(buildingArea);
        sb.append(", buildingLocationProvince=").append(buildingLocationProvince);
        sb.append(", buildingLocationCity=").append(buildingLocationCity);
        sb.append(", buildingLocationDistrict=").append(buildingLocationDistrict);
        sb.append(", buildingAddress=").append(buildingAddress);
        sb.append(", buildingManager=").append(buildingManager);
        sb.append(", buildingManagerTelephone=").append(buildingManagerTelephone);
        sb.append(", buildingTelephone=").append(buildingTelephone);
        sb.append(", buildingStatus=").append(buildingStatus);
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