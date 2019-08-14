package co.topc.iems.entity.req;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author fantao
 * @date 2019/7/31 23:09
 */
public class ListRenterReq extends PageRequest implements Serializable {

    /**
     * 租户ID
     */
    @ApiModelProperty(value = "租户ID", name = "lesseeId")
    private String lesseeId;

    /**
     * 租客类型 /个人，公司
     */
    @ApiModelProperty(value = "租客类型", name = "renterType")
    private String renterType;

    /**
     * 姓名或工商注册名
     */
    @ApiModelProperty(value = "姓名或工商注册名", name = "renterName")
    private String renterName;

    /**
     * 租客联系人
     */
    @ApiModelProperty(value = "租客联系人", name = "renterContactor")
    private String renterContactor;

    /**
     * 租客联系电话
     */
    @ApiModelProperty(value = "租客联系电话", name = "renterContactorTelephone")
    private String renterContactorTelephone;

    /**
     * 公司类型
     */
    @ApiModelProperty(value = "公司类型", name = "renterComType")
    private String renterComType;

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
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

    public String getRenterComType() {
        return renterComType;
    }

    public void setRenterComType(String renterComType) {
        this.renterComType = renterComType;
    }
}
