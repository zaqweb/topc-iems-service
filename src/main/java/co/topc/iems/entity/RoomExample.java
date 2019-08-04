package co.topc.iems.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RoomExample() {
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

        public Criteria andFloorPkIdIsNull() {
            addCriterion("floor_pk_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdIsNotNull() {
            addCriterion("floor_pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdEqualTo(String value) {
            addCriterion("floor_pk_id =", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdNotEqualTo(String value) {
            addCriterion("floor_pk_id <>", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdGreaterThan(String value) {
            addCriterion("floor_pk_id >", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("floor_pk_id >=", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdLessThan(String value) {
            addCriterion("floor_pk_id <", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdLessThanOrEqualTo(String value) {
            addCriterion("floor_pk_id <=", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdLike(String value) {
            addCriterion("floor_pk_id like", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdNotLike(String value) {
            addCriterion("floor_pk_id not like", value, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdIn(List<String> values) {
            addCriterion("floor_pk_id in", values, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdNotIn(List<String> values) {
            addCriterion("floor_pk_id not in", values, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdBetween(String value1, String value2) {
            addCriterion("floor_pk_id between", value1, value2, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andFloorPkIdNotBetween(String value1, String value2) {
            addCriterion("floor_pk_id not between", value1, value2, "floorPkId");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNull() {
            addCriterion("room_no is null");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNotNull() {
            addCriterion("room_no is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNoEqualTo(String value) {
            addCriterion("room_no =", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotEqualTo(String value) {
            addCriterion("room_no <>", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThan(String value) {
            addCriterion("room_no >", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThanOrEqualTo(String value) {
            addCriterion("room_no >=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThan(String value) {
            addCriterion("room_no <", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThanOrEqualTo(String value) {
            addCriterion("room_no <=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLike(String value) {
            addCriterion("room_no like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotLike(String value) {
            addCriterion("room_no not like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoIn(List<String> values) {
            addCriterion("room_no in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotIn(List<String> values) {
            addCriterion("room_no not in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoBetween(String value1, String value2) {
            addCriterion("room_no between", value1, value2, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotBetween(String value1, String value2) {
            addCriterion("room_no not between", value1, value2, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNull() {
            addCriterion("room_area is null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIsNotNull() {
            addCriterion("room_area is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAreaEqualTo(BigDecimal value) {
            addCriterion("room_area =", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotEqualTo(BigDecimal value) {
            addCriterion("room_area <>", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThan(BigDecimal value) {
            addCriterion("room_area >", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("room_area >=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThan(BigDecimal value) {
            addCriterion("room_area <", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("room_area <=", value, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaIn(List<BigDecimal> values) {
            addCriterion("room_area in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotIn(List<BigDecimal> values) {
            addCriterion("room_area not in", values, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("room_area between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("room_area not between", value1, value2, "roomArea");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNull() {
            addCriterion("room_status is null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNotNull() {
            addCriterion("room_status is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusEqualTo(String value) {
            addCriterion("room_status =", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotEqualTo(String value) {
            addCriterion("room_status <>", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThan(String value) {
            addCriterion("room_status >", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThanOrEqualTo(String value) {
            addCriterion("room_status >=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThan(String value) {
            addCriterion("room_status <", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThanOrEqualTo(String value) {
            addCriterion("room_status <=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLike(String value) {
            addCriterion("room_status like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotLike(String value) {
            addCriterion("room_status not like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIn(List<String> values) {
            addCriterion("room_status in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotIn(List<String> values) {
            addCriterion("room_status not in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusBetween(String value1, String value2) {
            addCriterion("room_status between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotBetween(String value1, String value2) {
            addCriterion("room_status not between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomMarkIsNull() {
            addCriterion("room_mark is null");
            return (Criteria) this;
        }

        public Criteria andRoomMarkIsNotNull() {
            addCriterion("room_mark is not null");
            return (Criteria) this;
        }

        public Criteria andRoomMarkEqualTo(String value) {
            addCriterion("room_mark =", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkNotEqualTo(String value) {
            addCriterion("room_mark <>", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkGreaterThan(String value) {
            addCriterion("room_mark >", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkGreaterThanOrEqualTo(String value) {
            addCriterion("room_mark >=", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkLessThan(String value) {
            addCriterion("room_mark <", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkLessThanOrEqualTo(String value) {
            addCriterion("room_mark <=", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkLike(String value) {
            addCriterion("room_mark like", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkNotLike(String value) {
            addCriterion("room_mark not like", value, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkIn(List<String> values) {
            addCriterion("room_mark in", values, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkNotIn(List<String> values) {
            addCriterion("room_mark not in", values, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkBetween(String value1, String value2) {
            addCriterion("room_mark between", value1, value2, "roomMark");
            return (Criteria) this;
        }

        public Criteria andRoomMarkNotBetween(String value1, String value2) {
            addCriterion("room_mark not between", value1, value2, "roomMark");
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