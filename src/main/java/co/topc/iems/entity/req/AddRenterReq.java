package co.topc.iems.entity.req;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author fantao
 * @date 2019/7/31 23:12
 */
public class AddRenterReq implements Serializable {

    /**
     * 租客类型 /个人，公司
     */
    private String renterType;

    /**
     * 姓名或工商注册名
     */
    private String renterName;

    /**
     * 身份证号或社会统一信用编码
     */
    private String renterVerifyId;

    /**
     * 租客联系人
     */
    private String renterContactor;

    /**
     * 租客联系电话
     */
    private String renterContactorTelephone;

    /**
     * 租客财务联系人
     */
    private String renterFinancialContactor;

    /**
     * 租客财务联系人电话/催缴信息默认发送该电话
     */
    private String renterFinancialContactorTelephone;

    /**
     * 账单接收邮箱
     */
    private String renterBillEmail;

    /**
     * 公司法人
     */
    private String renterComMan;

    /**
     * 公司法人电话
     */
    private String renterComManTelephone;

    /**
     * 公司成立日期
     */
    private Date renterComBuiltTime;

    /**
     * 公司类型
     */
    private String renterComType;

    /**
     * 公司注册住所
     */
    private String renterComAddress;

    /**
     * 公司注册资本
     */
    private BigDecimal renterComRegAmount;

    /**
     * 租户ID
     */
    private String lesseeId;

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

    public BigDecimal getRenterComRegAmount() {
        return renterComRegAmount;
    }

    public void setRenterComRegAmount(BigDecimal renterComRegAmount) {
        this.renterComRegAmount = renterComRegAmount;
    }

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }
}
