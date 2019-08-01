package co.topc.iems.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RenterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RenterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(String value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(String value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(String value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(String value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(String value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLike(String value) {
            addCriterion("pk_id like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotLike(String value) {
            addCriterion("pk_id not like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<String> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<String> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(String value1, String value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(String value1, String value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andRenterTypeIsNull() {
            addCriterion("renter_type is null");
            return (Criteria) this;
        }

        public Criteria andRenterTypeIsNotNull() {
            addCriterion("renter_type is not null");
            return (Criteria) this;
        }

        public Criteria andRenterTypeEqualTo(String value) {
            addCriterion("renter_type =", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeNotEqualTo(String value) {
            addCriterion("renter_type <>", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeGreaterThan(String value) {
            addCriterion("renter_type >", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("renter_type >=", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeLessThan(String value) {
            addCriterion("renter_type <", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeLessThanOrEqualTo(String value) {
            addCriterion("renter_type <=", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeLike(String value) {
            addCriterion("renter_type like", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeNotLike(String value) {
            addCriterion("renter_type not like", value, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeIn(List<String> values) {
            addCriterion("renter_type in", values, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeNotIn(List<String> values) {
            addCriterion("renter_type not in", values, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeBetween(String value1, String value2) {
            addCriterion("renter_type between", value1, value2, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterTypeNotBetween(String value1, String value2) {
            addCriterion("renter_type not between", value1, value2, "renterType");
            return (Criteria) this;
        }

        public Criteria andRenterNameIsNull() {
            addCriterion("renter_name is null");
            return (Criteria) this;
        }

        public Criteria andRenterNameIsNotNull() {
            addCriterion("renter_name is not null");
            return (Criteria) this;
        }

        public Criteria andRenterNameEqualTo(String value) {
            addCriterion("renter_name =", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameNotEqualTo(String value) {
            addCriterion("renter_name <>", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameGreaterThan(String value) {
            addCriterion("renter_name >", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("renter_name >=", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameLessThan(String value) {
            addCriterion("renter_name <", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameLessThanOrEqualTo(String value) {
            addCriterion("renter_name <=", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameLike(String value) {
            addCriterion("renter_name like", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameNotLike(String value) {
            addCriterion("renter_name not like", value, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameIn(List<String> values) {
            addCriterion("renter_name in", values, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameNotIn(List<String> values) {
            addCriterion("renter_name not in", values, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameBetween(String value1, String value2) {
            addCriterion("renter_name between", value1, value2, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterNameNotBetween(String value1, String value2) {
            addCriterion("renter_name not between", value1, value2, "renterName");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdIsNull() {
            addCriterion("renter_verify_id is null");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdIsNotNull() {
            addCriterion("renter_verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdEqualTo(String value) {
            addCriterion("renter_verify_id =", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdNotEqualTo(String value) {
            addCriterion("renter_verify_id <>", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdGreaterThan(String value) {
            addCriterion("renter_verify_id >", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("renter_verify_id >=", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdLessThan(String value) {
            addCriterion("renter_verify_id <", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdLessThanOrEqualTo(String value) {
            addCriterion("renter_verify_id <=", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdLike(String value) {
            addCriterion("renter_verify_id like", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdNotLike(String value) {
            addCriterion("renter_verify_id not like", value, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdIn(List<String> values) {
            addCriterion("renter_verify_id in", values, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdNotIn(List<String> values) {
            addCriterion("renter_verify_id not in", values, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdBetween(String value1, String value2) {
            addCriterion("renter_verify_id between", value1, value2, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterVerifyIdNotBetween(String value1, String value2) {
            addCriterion("renter_verify_id not between", value1, value2, "renterVerifyId");
            return (Criteria) this;
        }

        public Criteria andRenterContactorIsNull() {
            addCriterion("renter_contactor is null");
            return (Criteria) this;
        }

        public Criteria andRenterContactorIsNotNull() {
            addCriterion("renter_contactor is not null");
            return (Criteria) this;
        }

        public Criteria andRenterContactorEqualTo(String value) {
            addCriterion("renter_contactor =", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorNotEqualTo(String value) {
            addCriterion("renter_contactor <>", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorGreaterThan(String value) {
            addCriterion("renter_contactor >", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorGreaterThanOrEqualTo(String value) {
            addCriterion("renter_contactor >=", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorLessThan(String value) {
            addCriterion("renter_contactor <", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorLessThanOrEqualTo(String value) {
            addCriterion("renter_contactor <=", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorLike(String value) {
            addCriterion("renter_contactor like", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorNotLike(String value) {
            addCriterion("renter_contactor not like", value, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorIn(List<String> values) {
            addCriterion("renter_contactor in", values, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorNotIn(List<String> values) {
            addCriterion("renter_contactor not in", values, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorBetween(String value1, String value2) {
            addCriterion("renter_contactor between", value1, value2, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorNotBetween(String value1, String value2) {
            addCriterion("renter_contactor not between", value1, value2, "renterContactor");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneIsNull() {
            addCriterion("renter_contactor_telephone is null");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneIsNotNull() {
            addCriterion("renter_contactor_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneEqualTo(String value) {
            addCriterion("renter_contactor_telephone =", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneNotEqualTo(String value) {
            addCriterion("renter_contactor_telephone <>", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneGreaterThan(String value) {
            addCriterion("renter_contactor_telephone >", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("renter_contactor_telephone >=", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneLessThan(String value) {
            addCriterion("renter_contactor_telephone <", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneLessThanOrEqualTo(String value) {
            addCriterion("renter_contactor_telephone <=", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneLike(String value) {
            addCriterion("renter_contactor_telephone like", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneNotLike(String value) {
            addCriterion("renter_contactor_telephone not like", value, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneIn(List<String> values) {
            addCriterion("renter_contactor_telephone in", values, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneNotIn(List<String> values) {
            addCriterion("renter_contactor_telephone not in", values, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneBetween(String value1, String value2) {
            addCriterion("renter_contactor_telephone between", value1, value2, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterContactorTelephoneNotBetween(String value1, String value2) {
            addCriterion("renter_contactor_telephone not between", value1, value2, "renterContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorIsNull() {
            addCriterion("renter_financial_contactor is null");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorIsNotNull() {
            addCriterion("renter_financial_contactor is not null");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorEqualTo(String value) {
            addCriterion("renter_financial_contactor =", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorNotEqualTo(String value) {
            addCriterion("renter_financial_contactor <>", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorGreaterThan(String value) {
            addCriterion("renter_financial_contactor >", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorGreaterThanOrEqualTo(String value) {
            addCriterion("renter_financial_contactor >=", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorLessThan(String value) {
            addCriterion("renter_financial_contactor <", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorLessThanOrEqualTo(String value) {
            addCriterion("renter_financial_contactor <=", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorLike(String value) {
            addCriterion("renter_financial_contactor like", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorNotLike(String value) {
            addCriterion("renter_financial_contactor not like", value, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorIn(List<String> values) {
            addCriterion("renter_financial_contactor in", values, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorNotIn(List<String> values) {
            addCriterion("renter_financial_contactor not in", values, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorBetween(String value1, String value2) {
            addCriterion("renter_financial_contactor between", value1, value2, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorNotBetween(String value1, String value2) {
            addCriterion("renter_financial_contactor not between", value1, value2, "renterFinancialContactor");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneIsNull() {
            addCriterion("renter_financial_contactor_telephone is null");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneIsNotNull() {
            addCriterion("renter_financial_contactor_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneEqualTo(String value) {
            addCriterion("renter_financial_contactor_telephone =", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneNotEqualTo(String value) {
            addCriterion("renter_financial_contactor_telephone <>", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneGreaterThan(String value) {
            addCriterion("renter_financial_contactor_telephone >", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("renter_financial_contactor_telephone >=", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneLessThan(String value) {
            addCriterion("renter_financial_contactor_telephone <", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneLessThanOrEqualTo(String value) {
            addCriterion("renter_financial_contactor_telephone <=", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneLike(String value) {
            addCriterion("renter_financial_contactor_telephone like", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneNotLike(String value) {
            addCriterion("renter_financial_contactor_telephone not like", value, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneIn(List<String> values) {
            addCriterion("renter_financial_contactor_telephone in", values, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneNotIn(List<String> values) {
            addCriterion("renter_financial_contactor_telephone not in", values, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneBetween(String value1, String value2) {
            addCriterion("renter_financial_contactor_telephone between", value1, value2, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterFinancialContactorTelephoneNotBetween(String value1, String value2) {
            addCriterion("renter_financial_contactor_telephone not between", value1, value2, "renterFinancialContactorTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailIsNull() {
            addCriterion("renter_bill_email is null");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailIsNotNull() {
            addCriterion("renter_bill_email is not null");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailEqualTo(String value) {
            addCriterion("renter_bill_email =", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailNotEqualTo(String value) {
            addCriterion("renter_bill_email <>", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailGreaterThan(String value) {
            addCriterion("renter_bill_email >", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailGreaterThanOrEqualTo(String value) {
            addCriterion("renter_bill_email >=", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailLessThan(String value) {
            addCriterion("renter_bill_email <", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailLessThanOrEqualTo(String value) {
            addCriterion("renter_bill_email <=", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailLike(String value) {
            addCriterion("renter_bill_email like", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailNotLike(String value) {
            addCriterion("renter_bill_email not like", value, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailIn(List<String> values) {
            addCriterion("renter_bill_email in", values, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailNotIn(List<String> values) {
            addCriterion("renter_bill_email not in", values, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailBetween(String value1, String value2) {
            addCriterion("renter_bill_email between", value1, value2, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterBillEmailNotBetween(String value1, String value2) {
            addCriterion("renter_bill_email not between", value1, value2, "renterBillEmail");
            return (Criteria) this;
        }

        public Criteria andRenterComManIsNull() {
            addCriterion("renter_com_man is null");
            return (Criteria) this;
        }

        public Criteria andRenterComManIsNotNull() {
            addCriterion("renter_com_man is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComManEqualTo(String value) {
            addCriterion("renter_com_man =", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManNotEqualTo(String value) {
            addCriterion("renter_com_man <>", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManGreaterThan(String value) {
            addCriterion("renter_com_man >", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManGreaterThanOrEqualTo(String value) {
            addCriterion("renter_com_man >=", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManLessThan(String value) {
            addCriterion("renter_com_man <", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManLessThanOrEqualTo(String value) {
            addCriterion("renter_com_man <=", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManLike(String value) {
            addCriterion("renter_com_man like", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManNotLike(String value) {
            addCriterion("renter_com_man not like", value, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManIn(List<String> values) {
            addCriterion("renter_com_man in", values, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManNotIn(List<String> values) {
            addCriterion("renter_com_man not in", values, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManBetween(String value1, String value2) {
            addCriterion("renter_com_man between", value1, value2, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManNotBetween(String value1, String value2) {
            addCriterion("renter_com_man not between", value1, value2, "renterComMan");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneIsNull() {
            addCriterion("renter_com_man_telephone is null");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneIsNotNull() {
            addCriterion("renter_com_man_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneEqualTo(String value) {
            addCriterion("renter_com_man_telephone =", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneNotEqualTo(String value) {
            addCriterion("renter_com_man_telephone <>", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneGreaterThan(String value) {
            addCriterion("renter_com_man_telephone >", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("renter_com_man_telephone >=", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneLessThan(String value) {
            addCriterion("renter_com_man_telephone <", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneLessThanOrEqualTo(String value) {
            addCriterion("renter_com_man_telephone <=", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneLike(String value) {
            addCriterion("renter_com_man_telephone like", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneNotLike(String value) {
            addCriterion("renter_com_man_telephone not like", value, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneIn(List<String> values) {
            addCriterion("renter_com_man_telephone in", values, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneNotIn(List<String> values) {
            addCriterion("renter_com_man_telephone not in", values, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneBetween(String value1, String value2) {
            addCriterion("renter_com_man_telephone between", value1, value2, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComManTelephoneNotBetween(String value1, String value2) {
            addCriterion("renter_com_man_telephone not between", value1, value2, "renterComManTelephone");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeIsNull() {
            addCriterion("renter_com_built_time is null");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeIsNotNull() {
            addCriterion("renter_com_built_time is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeEqualTo(Date value) {
            addCriterion("renter_com_built_time =", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeNotEqualTo(Date value) {
            addCriterion("renter_com_built_time <>", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeGreaterThan(Date value) {
            addCriterion("renter_com_built_time >", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("renter_com_built_time >=", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeLessThan(Date value) {
            addCriterion("renter_com_built_time <", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeLessThanOrEqualTo(Date value) {
            addCriterion("renter_com_built_time <=", value, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeIn(List<Date> values) {
            addCriterion("renter_com_built_time in", values, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeNotIn(List<Date> values) {
            addCriterion("renter_com_built_time not in", values, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeBetween(Date value1, Date value2) {
            addCriterion("renter_com_built_time between", value1, value2, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComBuiltTimeNotBetween(Date value1, Date value2) {
            addCriterion("renter_com_built_time not between", value1, value2, "renterComBuiltTime");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeIsNull() {
            addCriterion("renter_com_type is null");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeIsNotNull() {
            addCriterion("renter_com_type is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeEqualTo(String value) {
            addCriterion("renter_com_type =", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeNotEqualTo(String value) {
            addCriterion("renter_com_type <>", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeGreaterThan(String value) {
            addCriterion("renter_com_type >", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeGreaterThanOrEqualTo(String value) {
            addCriterion("renter_com_type >=", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeLessThan(String value) {
            addCriterion("renter_com_type <", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeLessThanOrEqualTo(String value) {
            addCriterion("renter_com_type <=", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeLike(String value) {
            addCriterion("renter_com_type like", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeNotLike(String value) {
            addCriterion("renter_com_type not like", value, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeIn(List<String> values) {
            addCriterion("renter_com_type in", values, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeNotIn(List<String> values) {
            addCriterion("renter_com_type not in", values, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeBetween(String value1, String value2) {
            addCriterion("renter_com_type between", value1, value2, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComTypeNotBetween(String value1, String value2) {
            addCriterion("renter_com_type not between", value1, value2, "renterComType");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressIsNull() {
            addCriterion("renter_com_address is null");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressIsNotNull() {
            addCriterion("renter_com_address is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressEqualTo(String value) {
            addCriterion("renter_com_address =", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressNotEqualTo(String value) {
            addCriterion("renter_com_address <>", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressGreaterThan(String value) {
            addCriterion("renter_com_address >", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressGreaterThanOrEqualTo(String value) {
            addCriterion("renter_com_address >=", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressLessThan(String value) {
            addCriterion("renter_com_address <", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressLessThanOrEqualTo(String value) {
            addCriterion("renter_com_address <=", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressLike(String value) {
            addCriterion("renter_com_address like", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressNotLike(String value) {
            addCriterion("renter_com_address not like", value, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressIn(List<String> values) {
            addCriterion("renter_com_address in", values, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressNotIn(List<String> values) {
            addCriterion("renter_com_address not in", values, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressBetween(String value1, String value2) {
            addCriterion("renter_com_address between", value1, value2, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComAddressNotBetween(String value1, String value2) {
            addCriterion("renter_com_address not between", value1, value2, "renterComAddress");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountIsNull() {
            addCriterion("renter_com_reg_amount is null");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountIsNotNull() {
            addCriterion("renter_com_reg_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountEqualTo(BigDecimal value) {
            addCriterion("renter_com_reg_amount =", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountNotEqualTo(BigDecimal value) {
            addCriterion("renter_com_reg_amount <>", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountGreaterThan(BigDecimal value) {
            addCriterion("renter_com_reg_amount >", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renter_com_reg_amount >=", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountLessThan(BigDecimal value) {
            addCriterion("renter_com_reg_amount <", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renter_com_reg_amount <=", value, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountIn(List<BigDecimal> values) {
            addCriterion("renter_com_reg_amount in", values, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountNotIn(List<BigDecimal> values) {
            addCriterion("renter_com_reg_amount not in", values, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renter_com_reg_amount between", value1, value2, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andRenterComRegAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renter_com_reg_amount not between", value1, value2, "renterComRegAmount");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNull() {
            addCriterion("lessee_id is null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNotNull() {
            addCriterion("lessee_id is not null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdEqualTo(String value) {
            addCriterion("lessee_id =", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotEqualTo(String value) {
            addCriterion("lessee_id <>", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThan(String value) {
            addCriterion("lessee_id >", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThanOrEqualTo(String value) {
            addCriterion("lessee_id >=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThan(String value) {
            addCriterion("lessee_id <", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThanOrEqualTo(String value) {
            addCriterion("lessee_id <=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLike(String value) {
            addCriterion("lessee_id like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotLike(String value) {
            addCriterion("lessee_id not like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIn(List<String> values) {
            addCriterion("lessee_id in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotIn(List<String> values) {
            addCriterion("lessee_id not in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdBetween(String value1, String value2) {
            addCriterion("lessee_id between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotBetween(String value1, String value2) {
            addCriterion("lessee_id not between", value1, value2, "lesseeId");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}