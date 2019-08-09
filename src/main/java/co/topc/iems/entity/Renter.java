package co.topc.iems.entity;

import co.topc.iems.entity.req.PageRequest;
import co.topc.iems.validate.RenterValidateGroup;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.utils.TopcDateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 租客实体类
 *
 * t_iems_renter
 * @author
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Renter extends PageRequest implements Serializable {

    public interface ShowList extends TopcWebResponse.WebResponse {
    }

    /**
     * 主键ID
     */
    @NotBlank(message = "主键Id不能为空", groups = {RenterValidateGroup.Update.class})
    @ApiModelProperty(value = "主键Id", name = "pkId", hidden = true)
    @JsonView(Renter.ShowList.class)
    private String pkId;

    /**
     * 租客类型 /个人，公司
     */
    @NotBlank(message = "租客类型不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "租客类型", name = "renterType", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterType;

    /**
     * 姓名或工商注册名
     */
    @NotBlank(message = "姓名或工商注册名不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "姓名或工商注册名", name = "renterName", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterName;

    /**
     * 身份证号或社会统一信用编码
     */
    @NotBlank(message = "身份证号或社会统一信用编码不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "身份证号或社会统一信用编码", name = "renterVerifyId", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterVerifyId;

    /**
     * 租客联系人
     */
    @NotBlank(message = "租客联系人不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "租客联系人", name = "renterContactor", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterContactor;

    /**
     * 租客联系电话
     */
    @NotBlank(message = "租客联系电话不能为空", groups = {RenterValidateGroup.Insert.class})
    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}", message = "电话号码格式不对", groups = {RenterValidateGroup.Insert.class, RenterValidateGroup.Update.class})
    @ApiModelProperty(value = "租客联系电话", name = "renterContactorTelephone", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterContactorTelephone;

    /**
     * 租客财务联系人
     */
    @NotBlank(message = "租客财务联系人不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "租客财务联系人", name = "renterFinancialContactor", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterFinancialContactor;

    /**
     * 租客财务联系人电话/催缴信息默认发送该电话
     */
    @NotBlank(message = "租客财务联系人电话不能为空", groups = {RenterValidateGroup.Insert.class})
    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}", message = "电话号码格式不对", groups = {RenterValidateGroup.Insert.class, RenterValidateGroup.Update.class})
    @ApiModelProperty(value = "租客财务联系人电话", name = "renterFinancialContactorTelephone", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterFinancialContactorTelephone;

    /**
     * 账单接收邮箱
     */
    @NotBlank(message = "账单接收邮箱不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "账单接收邮箱", name = "renterBillEmail", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterBillEmail;

    /**
     * 公司法人
     */
    @NotBlank(message = "公司法人不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "公司法人", name = "renterComMan", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterComMan;

    /**
     * 公司法人电话
     */
    @NotBlank(message = "公司法人电话不能为空", groups = {RenterValidateGroup.Insert.class})
    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}", message = "电话号码格式不对", groups = {RenterValidateGroup.Insert.class, RenterValidateGroup.Update.class})
    @ApiModelProperty(value = "公司法人电话", name = "renterComManTelephone", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterComManTelephone;

    /**
     * 公司成立日期
     */
    @NotBlank(message = "公司成立日期不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "公司成立日期", name = "renterComBuiltTime", required = true)
    @JsonView(Renter.ShowList.class)
    private Date renterComBuiltTime;

    /**
     * 公司类型
     */
    @NotBlank(message = "公司类型不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "公司类型", name = "renterComType", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterComType;

    /**
     * 公司注册住所
     */
    @NotBlank(message = "公司注册住所不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "公司注册住所", name = "renterComAddress", required = true)
    @JsonView(Renter.ShowList.class)
    private String renterComAddress;

    /**
     * 公司注册资本
     */
    @NotBlank(message = "公司注册资本不能为空", groups = {RenterValidateGroup.Insert.class})
    @ApiModelProperty(value = "公司注册资本", name = "renterComRegAmount", required = true)
    @JsonView(Renter.ShowList.class)
    private Double renterComRegAmount;

    /**
     * 是否删除
     */
    @JsonIgnore
    private String isDeleted;

    /**
     * 创建人
     */
    @JsonView(Renter.ShowList.class)
    private String createBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = TopcDateUtils.DATE_TIME_FORMAT, timezone = "GMT+8")
    @JsonView(Renter.ShowList.class)
    private Date createTime;

    /**
     * 更新人
     */
    @JsonView(Renter.ShowList.class)
    private String updateBy;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = TopcDateUtils.DATE_TIME_FORMAT, timezone = "GMT+8")
    @JsonView(Renter.ShowList.class)
    private Date updateTime;

    /**
     * 租户ID
     */
    @JsonView(Renter.ShowList.class)
    private String lesseeId;

    private static final long serialVersionUID = 1L;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getRenterType() {
        return renterType;
    }

    public void setRenterType(String renterType) {
        this.renterType = renterType;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getRenterVerifyId() {
        return renterVerifyId;
    }

    public void setRenterVerifyId(String renterVerifyId) {
        this.renterVerifyId = renterVerifyId;
    }

    public String getRenterContactor() {
        return renterContactor;
    }

    public void setRenterContactor(String renterContactor) {
        this.renterContactor = renterContactor;
    }

    public String getRenterContactorTelephone() {
        return renterContactorTelephone;
    }

    public void setRenterContactorTelephone(String renterContactorTelephone) {
        this.renterContactorTelephone = renterContactorTelephone;
    }

    public String getRenterFinancialContactor() {
        return renterFinancialContactor;
    }

    public void setRenterFinancialContactor(String renterFinancialContactor) {
        this.renterFinancialContactor = renterFinancialContactor;
    }

    public String getRenterFinancialContactorTelephone() {
        return renterFinancialContactorTelephone;
    }

    public void setRenterFinancialContactorTelephone(String renterFinancialContactorTelephone) {
        this.renterFinancialContactorTelephone = renterFinancialContactorTelephone;
    }

    public String getRenterBillEmail() {
        return renterBillEmail;
    }

    public void setRenterBillEmail(String renterBillEmail) {
        this.renterBillEmail = renterBillEmail;
    }

    public String getRenterComMan() {
        return renterComMan;
    }

    public void setRenterComMan(String renterComMan) {
        this.renterComMan = renterComMan;
    }

    public String getRenterComManTelephone() {
        return renterComManTelephone;
    }

    public void setRenterComManTelephone(String renterComManTelephone) {
        this.renterComManTelephone = renterComManTelephone;
    }

    public Date getRenterComBuiltTime() {
        return renterComBuiltTime;
    }

    public void setRenterComBuiltTime(Date renterComBuiltTime) {
        this.renterComBuiltTime = renterComBuiltTime;
    }

    public String getRenterComType() {
        return renterComType;
    }

    public void setRenterComType(String renterComType) {
        this.renterComType = renterComType;
    }

    public String getRenterComAddress() {
        return renterComAddress;
    }

    public void setRenterComAddress(String renterComAddress) {
        this.renterComAddress = renterComAddress;
    }

    public Double getRenterComRegAmount() {
        return renterComRegAmount;
    }

    public void setRenterComRegAmount(Double renterComRegAmount) {
        this.renterComRegAmount = renterComRegAmount;
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
        Renter other = (Renter) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
                && (this.getRenterType() == null ? other.getRenterType() == null : this.getRenterType().equals(other.getRenterType()))
                && (this.getRenterName() == null ? other.getRenterName() == null : this.getRenterName().equals(other.getRenterName()))
                && (this.getRenterVerifyId() == null ? other.getRenterVerifyId() == null : this.getRenterVerifyId().equals(other.getRenterVerifyId()))
                && (this.getRenterContactor() == null ? other.getRenterContactor() == null : this.getRenterContactor().equals(other.getRenterContactor()))
                && (this.getRenterContactorTelephone() == null ? other.getRenterContactorTelephone() == null : this.getRenterContactorTelephone().equals(other.getRenterContactorTelephone()))
                && (this.getRenterFinancialContactor() == null ? other.getRenterFinancialContactor() == null : this.getRenterFinancialContactor().equals(other.getRenterFinancialContactor()))
                && (this.getRenterFinancialContactorTelephone() == null ? other.getRenterFinancialContactorTelephone() == null : this.getRenterFinancialContactorTelephone().equals(other.getRenterFinancialContactorTelephone()))
                && (this.getRenterBillEmail() == null ? other.getRenterBillEmail() == null : this.getRenterBillEmail().equals(other.getRenterBillEmail()))
                && (this.getRenterComMan() == null ? other.getRenterComMan() == null : this.getRenterComMan().equals(other.getRenterComMan()))
                && (this.getRenterComManTelephone() == null ? other.getRenterComManTelephone() == null : this.getRenterComManTelephone().equals(other.getRenterComManTelephone()))
                && (this.getRenterComBuiltTime() == null ? other.getRenterComBuiltTime() == null : this.getRenterComBuiltTime().equals(other.getRenterComBuiltTime()))
                && (this.getRenterComType() == null ? other.getRenterComType() == null : this.getRenterComType().equals(other.getRenterComType()))
                && (this.getRenterComAddress() == null ? other.getRenterComAddress() == null : this.getRenterComAddress().equals(other.getRenterComAddress()))
                && (this.getRenterComRegAmount() == null ? other.getRenterComRegAmount() == null : this.getRenterComRegAmount().equals(other.getRenterComRegAmount()))
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
        result = prime * result + ((getRenterType() == null) ? 0 : getRenterType().hashCode());
        result = prime * result + ((getRenterName() == null) ? 0 : getRenterName().hashCode());
        result = prime * result + ((getRenterVerifyId() == null) ? 0 : getRenterVerifyId().hashCode());
        result = prime * result + ((getRenterContactor() == null) ? 0 : getRenterContactor().hashCode());
        result = prime * result + ((getRenterContactorTelephone() == null) ? 0 : getRenterContactorTelephone().hashCode());
        result = prime * result + ((getRenterFinancialContactor() == null) ? 0 : getRenterFinancialContactor().hashCode());
        result = prime * result + ((getRenterFinancialContactorTelephone() == null) ? 0 : getRenterFinancialContactorTelephone().hashCode());
        result = prime * result + ((getRenterBillEmail() == null) ? 0 : getRenterBillEmail().hashCode());
        result = prime * result + ((getRenterComMan() == null) ? 0 : getRenterComMan().hashCode());
        result = prime * result + ((getRenterComManTelephone() == null) ? 0 : getRenterComManTelephone().hashCode());
        result = prime * result + ((getRenterComBuiltTime() == null) ? 0 : getRenterComBuiltTime().hashCode());
        result = prime * result + ((getRenterComType() == null) ? 0 : getRenterComType().hashCode());
        result = prime * result + ((getRenterComAddress() == null) ? 0 : getRenterComAddress().hashCode());
        result = prime * result + ((getRenterComRegAmount() == null) ? 0 : getRenterComRegAmount().hashCode());
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
        sb.append(", renterType=").append(renterType);
        sb.append(", renterName=").append(renterName);
        sb.append(", renterVerifyId=").append(renterVerifyId);
        sb.append(", renterContactor=").append(renterContactor);
        sb.append(", renterContactorTelephone=").append(renterContactorTelephone);
        sb.append(", renterFinancialContactor=").append(renterFinancialContactor);
        sb.append(", renterFinancialContactorTelephone=").append(renterFinancialContactorTelephone);
        sb.append(", renterBillEmail=").append(renterBillEmail);
        sb.append(", renterComMan=").append(renterComMan);
        sb.append(", renterComManTelephone=").append(renterComManTelephone);
        sb.append(", renterComBuiltTime=").append(renterComBuiltTime);
        sb.append(", renterComType=").append(renterComType);
        sb.append(", renterComAddress=").append(renterComAddress);
        sb.append(", renterComRegAmount=").append(renterComRegAmount);
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