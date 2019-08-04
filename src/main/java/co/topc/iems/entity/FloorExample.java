package co.topc.iems.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FloorExample() {
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
            addCriterion("t_iems_floor.pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("t_iems_floor.pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(String value) {
            addCriterion("t_iems_floor.pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(String value) {
            addCriterion("t_iems_floor.pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(String value) {
            addCriterion("t_iems_floor.pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(String value) {
            addCriterion("t_iems_floor.pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLike(String value) {
            addCriterion("t_iems_floor.pk_id like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotLike(String value) {
            addCriterion("t_iems_floor.pk_id not like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<String> values) {
            addCriterion("t_iems_floor.pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<String> values) {
            addCriterion("t_iems_floor.pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(String value1, String value2) {
            addCriterion("t_iems_floor.pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdIsNull() {
            addCriterion("t_iems_floor.building_pk_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdIsNotNull() {
            addCriterion("t_iems_floor.building_pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdEqualTo(String value) {
            addCriterion("t_iems_floor.building_pk_id =", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdNotEqualTo(String value) {
            addCriterion("t_iems_floor.building_pk_id <>", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdGreaterThan(String value) {
            addCriterion("t_iems_floor.building_pk_id >", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.building_pk_id >=", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdLessThan(String value) {
            addCriterion("t_iems_floor.building_pk_id <", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.building_pk_id <=", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdLike(String value) {
            addCriterion("t_iems_floor.building_pk_id like", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdNotLike(String value) {
            addCriterion("t_iems_floor.building_pk_id not like", value, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdIn(List<String> values) {
            addCriterion("t_iems_floor.building_pk_id in", values, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdNotIn(List<String> values) {
            addCriterion("t_iems_floor.building_pk_id not in", values, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdBetween(String value1, String value2) {
            addCriterion("t_iems_floor.building_pk_id between", value1, value2, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andBuildingPkIdNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.building_pk_id not between", value1, value2, "buildingPkId");
            return (Criteria) this;
        }

        public Criteria andFloorNoIsNull() {
            addCriterion("t_iems_floor.floor_no is null");
            return (Criteria) this;
        }

        public Criteria andFloorNoIsNotNull() {
            addCriterion("t_iems_floor.floor_no is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNoEqualTo(Integer value) {
            addCriterion("t_iems_floor.floor_no =", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoNotEqualTo(Integer value) {
            addCriterion("t_iems_floor.floor_no <>", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoGreaterThan(Integer value) {
            addCriterion("t_iems_floor.floor_no >", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_iems_floor.floor_no >=", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoLessThan(Integer value) {
            addCriterion("t_iems_floor.floor_no <", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoLessThanOrEqualTo(Integer value) {
            addCriterion("t_iems_floor.floor_no <=", value, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoIn(List<Integer> values) {
            addCriterion("t_iems_floor.floor_no in", values, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoNotIn(List<Integer> values) {
            addCriterion("t_iems_floor.floor_no not in", values, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoBetween(Integer value1, Integer value2) {
            addCriterion("t_iems_floor.floor_no between", value1, value2, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("t_iems_floor.floor_no not between", value1, value2, "floorNo");
            return (Criteria) this;
        }

        public Criteria andFloorAreaIsNull() {
            addCriterion("t_iems_floor.floor_area is null");
            return (Criteria) this;
        }

        public Criteria andFloorAreaIsNotNull() {
            addCriterion("t_iems_floor.floor_area is not null");
            return (Criteria) this;
        }

        public Criteria andFloorAreaEqualTo(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area =", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaNotEqualTo(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area <>", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaGreaterThan(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area >", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area >=", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaLessThan(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area <", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_iems_floor.floor_area <=", value, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaIn(List<BigDecimal> values) {
            addCriterion("t_iems_floor.floor_area in", values, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaNotIn(List<BigDecimal> values) {
            addCriterion("t_iems_floor.floor_area not in", values, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_iems_floor.floor_area between", value1, value2, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_iems_floor.floor_area not between", value1, value2, "floorArea");
            return (Criteria) this;
        }

        public Criteria andFloorManagerIsNull() {
            addCriterion("t_iems_floor.floor_manager is null");
            return (Criteria) this;
        }

        public Criteria andFloorManagerIsNotNull() {
            addCriterion("t_iems_floor.floor_manager is not null");
            return (Criteria) this;
        }

        public Criteria andFloorManagerEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager =", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerNotEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager <>", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerGreaterThan(String value) {
            addCriterion("t_iems_floor.floor_manager >", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager >=", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerLessThan(String value) {
            addCriterion("t_iems_floor.floor_manager <", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager <=", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerLike(String value) {
            addCriterion("t_iems_floor.floor_manager like", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerNotLike(String value) {
            addCriterion("t_iems_floor.floor_manager not like", value, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerIn(List<String> values) {
            addCriterion("t_iems_floor.floor_manager in", values, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerNotIn(List<String> values) {
            addCriterion("t_iems_floor.floor_manager not in", values, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_manager between", value1, value2, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_manager not between", value1, value2, "floorManager");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneIsNull() {
            addCriterion("t_iems_floor.floor_manager_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneIsNotNull() {
            addCriterion("t_iems_floor.floor_manager_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone =", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneNotEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone <>", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneGreaterThan(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone >", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone >=", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneLessThan(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone <", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone <=", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneLike(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone like", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneNotLike(String value) {
            addCriterion("t_iems_floor.floor_manager_telephone not like", value, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneIn(List<String> values) {
            addCriterion("t_iems_floor.floor_manager_telephone in", values, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneNotIn(List<String> values) {
            addCriterion("t_iems_floor.floor_manager_telephone not in", values, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_manager_telephone between", value1, value2, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorManagerTelephoneNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_manager_telephone not between", value1, value2, "floorManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIsNull() {
            addCriterion("t_iems_floor.floor_status is null");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIsNotNull() {
            addCriterion("t_iems_floor.floor_status is not null");
            return (Criteria) this;
        }

        public Criteria andFloorStatusEqualTo(String value) {
            addCriterion("t_iems_floor.floor_status =", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotEqualTo(String value) {
            addCriterion("t_iems_floor.floor_status <>", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusGreaterThan(String value) {
            addCriterion("t_iems_floor.floor_status >", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_status >=", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusLessThan(String value) {
            addCriterion("t_iems_floor.floor_status <", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.floor_status <=", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusLike(String value) {
            addCriterion("t_iems_floor.floor_status like", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotLike(String value) {
            addCriterion("t_iems_floor.floor_status not like", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIn(List<String> values) {
            addCriterion("t_iems_floor.floor_status in", values, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotIn(List<String> values) {
            addCriterion("t_iems_floor.floor_status not in", values, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_status between", value1, value2, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.floor_status not between", value1, value2, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("t_iems_floor.is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("t_iems_floor.is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("t_iems_floor.is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("t_iems_floor.is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("t_iems_floor.is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("t_iems_floor.is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("t_iems_floor.is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("t_iems_floor.is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("t_iems_floor.is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("t_iems_floor.is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("t_iems_floor.is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("t_iems_floor.create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("t_iems_floor.create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("t_iems_floor.create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("t_iems_floor.create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("t_iems_floor.create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("t_iems_floor.create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("t_iems_floor.create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("t_iems_floor.create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("t_iems_floor.create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("t_iems_floor.create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("t_iems_floor.create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("t_iems_floor.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("t_iems_floor.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("t_iems_floor.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("t_iems_floor.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("t_iems_floor.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_iems_floor.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("t_iems_floor.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_iems_floor.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("t_iems_floor.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("t_iems_floor.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("t_iems_floor.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_iems_floor.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("t_iems_floor.update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("t_iems_floor.update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("t_iems_floor.update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("t_iems_floor.update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("t_iems_floor.update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("t_iems_floor.update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("t_iems_floor.update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("t_iems_floor.update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("t_iems_floor.update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("t_iems_floor.update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("t_iems_floor.update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("t_iems_floor.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("t_iems_floor.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("t_iems_floor.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("t_iems_floor.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("t_iems_floor.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_iems_floor.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("t_iems_floor.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_iems_floor.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("t_iems_floor.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("t_iems_floor.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("t_iems_floor.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_iems_floor.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNull() {
            addCriterion("t_iems_floor.lessee_id is null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNotNull() {
            addCriterion("t_iems_floor.lessee_id is not null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdEqualTo(String value) {
            addCriterion("t_iems_floor.lessee_id =", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotEqualTo(String value) {
            addCriterion("t_iems_floor.lessee_id <>", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThan(String value) {
            addCriterion("t_iems_floor.lessee_id >", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.lessee_id >=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThan(String value) {
            addCriterion("t_iems_floor.lessee_id <", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThanOrEqualTo(String value) {
            addCriterion("t_iems_floor.lessee_id <=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLike(String value) {
            addCriterion("t_iems_floor.lessee_id like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotLike(String value) {
            addCriterion("t_iems_floor.lessee_id not like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIn(List<String> values) {
            addCriterion("t_iems_floor.lessee_id in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotIn(List<String> values) {
            addCriterion("t_iems_floor.lessee_id not in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdBetween(String value1, String value2) {
            addCriterion("t_iems_floor.lessee_id between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotBetween(String value1, String value2) {
            addCriterion("t_iems_floor.lessee_id not between", value1, value2, "lesseeId");
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