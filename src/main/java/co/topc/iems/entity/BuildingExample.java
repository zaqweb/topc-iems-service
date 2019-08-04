package co.topc.iems.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BuildingExample() {
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
            addCriterion("t_iems_building.pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("t_iems_building.pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(String value) {
            addCriterion("t_iems_building.pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(String value) {
            addCriterion("t_iems_building.pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(String value) {
            addCriterion("t_iems_building.pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(String value) {
            addCriterion("t_iems_building.pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLike(String value) {
            addCriterion("t_iems_building.pk_id like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotLike(String value) {
            addCriterion("t_iems_building.pk_id not like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<String> values) {
            addCriterion("t_iems_building.pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<String> values) {
            addCriterion("t_iems_building.pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(String value1, String value2) {
            addCriterion("t_iems_building.pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("t_iems_building.building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("t_iems_building.building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("t_iems_building.building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("t_iems_building.building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("t_iems_building.building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("t_iems_building.building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("t_iems_building.building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("t_iems_building.building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("t_iems_building.building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("t_iems_building.building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingPicIsNull() {
            addCriterion("t_iems_building.building_pic is null");
            return (Criteria) this;
        }

        public Criteria andBuildingPicIsNotNull() {
            addCriterion("t_iems_building.building_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingPicEqualTo(String value) {
            addCriterion("t_iems_building.building_pic =", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicNotEqualTo(String value) {
            addCriterion("t_iems_building.building_pic <>", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicGreaterThan(String value) {
            addCriterion("t_iems_building.building_pic >", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_pic >=", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicLessThan(String value) {
            addCriterion("t_iems_building.building_pic <", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_pic <=", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicLike(String value) {
            addCriterion("t_iems_building.building_pic like", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicNotLike(String value) {
            addCriterion("t_iems_building.building_pic not like", value, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicIn(List<String> values) {
            addCriterion("t_iems_building.building_pic in", values, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicNotIn(List<String> values) {
            addCriterion("t_iems_building.building_pic not in", values, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_pic between", value1, value2, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_pic not between", value1, value2, "buildingPic");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallIsNull() {
            addCriterion("t_iems_building.building_pic_small is null");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallIsNotNull() {
            addCriterion("t_iems_building.building_pic_small is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallEqualTo(String value) {
            addCriterion("t_iems_building.building_pic_small =", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallNotEqualTo(String value) {
            addCriterion("t_iems_building.building_pic_small <>", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallGreaterThan(String value) {
            addCriterion("t_iems_building.building_pic_small >", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_pic_small >=", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallLessThan(String value) {
            addCriterion("t_iems_building.building_pic_small <", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_pic_small <=", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallLike(String value) {
            addCriterion("t_iems_building.building_pic_small like", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallNotLike(String value) {
            addCriterion("t_iems_building.building_pic_small not like", value, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallIn(List<String> values) {
            addCriterion("t_iems_building.building_pic_small in", values, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallNotIn(List<String> values) {
            addCriterion("t_iems_building.building_pic_small not in", values, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_pic_small between", value1, value2, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingPicSmallNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_pic_small not between", value1, value2, "buildingPicSmall");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsIsNull() {
            addCriterion("t_iems_building.building_floors is null");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsIsNotNull() {
            addCriterion("t_iems_building.building_floors is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsEqualTo(Integer value) {
            addCriterion("t_iems_building.building_floors =", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsNotEqualTo(Integer value) {
            addCriterion("t_iems_building.building_floors <>", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsGreaterThan(Integer value) {
            addCriterion("t_iems_building.building_floors >", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_iems_building.building_floors >=", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsLessThan(Integer value) {
            addCriterion("t_iems_building.building_floors <", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsLessThanOrEqualTo(Integer value) {
            addCriterion("t_iems_building.building_floors <=", value, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsIn(List<Integer> values) {
            addCriterion("t_iems_building.building_floors in", values, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsNotIn(List<Integer> values) {
            addCriterion("t_iems_building.building_floors not in", values, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsBetween(Integer value1, Integer value2) {
            addCriterion("t_iems_building.building_floors between", value1, value2, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingFloorsNotBetween(Integer value1, Integer value2) {
            addCriterion("t_iems_building.building_floors not between", value1, value2, "buildingFloors");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNull() {
            addCriterion("t_iems_building.building_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNotNull() {
            addCriterion("t_iems_building.building_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaEqualTo(BigDecimal value) {
            addCriterion("t_iems_building.building_area =", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotEqualTo(BigDecimal value) {
            addCriterion("t_iems_building.building_area <>", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThan(BigDecimal value) {
            addCriterion("t_iems_building.building_area >", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_iems_building.building_area >=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThan(BigDecimal value) {
            addCriterion("t_iems_building.building_area <", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_iems_building.building_area <=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIn(List<BigDecimal> values) {
            addCriterion("t_iems_building.building_area in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotIn(List<BigDecimal> values) {
            addCriterion("t_iems_building.building_area not in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_iems_building.building_area between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_iems_building.building_area not between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceIsNull() {
            addCriterion("t_iems_building.building_location_province is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceIsNotNull() {
            addCriterion("t_iems_building.building_location_province is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceEqualTo(String value) {
            addCriterion("t_iems_building.building_location_province =", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceNotEqualTo(String value) {
            addCriterion("t_iems_building.building_location_province <>", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceGreaterThan(String value) {
            addCriterion("t_iems_building.building_location_province >", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_province >=", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceLessThan(String value) {
            addCriterion("t_iems_building.building_location_province <", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_province <=", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceLike(String value) {
            addCriterion("t_iems_building.building_location_province like", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceNotLike(String value) {
            addCriterion("t_iems_building.building_location_province not like", value, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceIn(List<String> values) {
            addCriterion("t_iems_building.building_location_province in", values, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceNotIn(List<String> values) {
            addCriterion("t_iems_building.building_location_province not in", values, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_province between", value1, value2, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationProvinceNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_province not between", value1, value2, "buildingLocationProvince");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityIsNull() {
            addCriterion("t_iems_building.building_location_city is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityIsNotNull() {
            addCriterion("t_iems_building.building_location_city is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityEqualTo(String value) {
            addCriterion("t_iems_building.building_location_city =", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityNotEqualTo(String value) {
            addCriterion("t_iems_building.building_location_city <>", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityGreaterThan(String value) {
            addCriterion("t_iems_building.building_location_city >", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_city >=", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityLessThan(String value) {
            addCriterion("t_iems_building.building_location_city <", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_city <=", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityLike(String value) {
            addCriterion("t_iems_building.building_location_city like", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityNotLike(String value) {
            addCriterion("t_iems_building.building_location_city not like", value, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityIn(List<String> values) {
            addCriterion("t_iems_building.building_location_city in", values, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityNotIn(List<String> values) {
            addCriterion("t_iems_building.building_location_city not in", values, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_city between", value1, value2, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationCityNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_city not between", value1, value2, "buildingLocationCity");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictIsNull() {
            addCriterion("t_iems_building.building_location_district is null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictIsNotNull() {
            addCriterion("t_iems_building.building_location_district is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictEqualTo(String value) {
            addCriterion("t_iems_building.building_location_district =", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictNotEqualTo(String value) {
            addCriterion("t_iems_building.building_location_district <>", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictGreaterThan(String value) {
            addCriterion("t_iems_building.building_location_district >", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_district >=", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictLessThan(String value) {
            addCriterion("t_iems_building.building_location_district <", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_location_district <=", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictLike(String value) {
            addCriterion("t_iems_building.building_location_district like", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictNotLike(String value) {
            addCriterion("t_iems_building.building_location_district not like", value, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictIn(List<String> values) {
            addCriterion("t_iems_building.building_location_district in", values, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictNotIn(List<String> values) {
            addCriterion("t_iems_building.building_location_district not in", values, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_district between", value1, value2, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingLocationDistrictNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_location_district not between", value1, value2, "buildingLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresIsNull() {
            addCriterion("t_iems_building.building_addres is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresIsNotNull() {
            addCriterion("t_iems_building.building_addres is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresEqualTo(String value) {
            addCriterion("t_iems_building.building_addres =", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresNotEqualTo(String value) {
            addCriterion("t_iems_building.building_addres <>", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresGreaterThan(String value) {
            addCriterion("t_iems_building.building_addres >", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_addres >=", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresLessThan(String value) {
            addCriterion("t_iems_building.building_addres <", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_addres <=", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresLike(String value) {
            addCriterion("t_iems_building.building_addres like", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresNotLike(String value) {
            addCriterion("t_iems_building.building_addres not like", value, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresIn(List<String> values) {
            addCriterion("t_iems_building.building_addres in", values, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresNotIn(List<String> values) {
            addCriterion("t_iems_building.building_addres not in", values, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_addres between", value1, value2, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingAddresNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_addres not between", value1, value2, "buildingAddres");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerIsNull() {
            addCriterion("t_iems_building.building_manager is null");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerIsNotNull() {
            addCriterion("t_iems_building.building_manager is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerEqualTo(String value) {
            addCriterion("t_iems_building.building_manager =", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerNotEqualTo(String value) {
            addCriterion("t_iems_building.building_manager <>", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerGreaterThan(String value) {
            addCriterion("t_iems_building.building_manager >", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_manager >=", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerLessThan(String value) {
            addCriterion("t_iems_building.building_manager <", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_manager <=", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerLike(String value) {
            addCriterion("t_iems_building.building_manager like", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerNotLike(String value) {
            addCriterion("t_iems_building.building_manager not like", value, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerIn(List<String> values) {
            addCriterion("t_iems_building.building_manager in", values, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerNotIn(List<String> values) {
            addCriterion("t_iems_building.building_manager not in", values, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_manager between", value1, value2, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_manager not between", value1, value2, "buildingManager");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneIsNull() {
            addCriterion("t_iems_building.building_manager_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneIsNotNull() {
            addCriterion("t_iems_building.building_manager_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneEqualTo(String value) {
            addCriterion("t_iems_building.building_manager_telephone =", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneNotEqualTo(String value) {
            addCriterion("t_iems_building.building_manager_telephone <>", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneGreaterThan(String value) {
            addCriterion("t_iems_building.building_manager_telephone >", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_manager_telephone >=", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneLessThan(String value) {
            addCriterion("t_iems_building.building_manager_telephone <", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_manager_telephone <=", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneLike(String value) {
            addCriterion("t_iems_building.building_manager_telephone like", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneNotLike(String value) {
            addCriterion("t_iems_building.building_manager_telephone not like", value, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneIn(List<String> values) {
            addCriterion("t_iems_building.building_manager_telephone in", values, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneNotIn(List<String> values) {
            addCriterion("t_iems_building.building_manager_telephone not in", values, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_manager_telephone between", value1, value2, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingManagerTelephoneNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_manager_telephone not between", value1, value2, "buildingManagerTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneIsNull() {
            addCriterion("t_iems_building.building_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneIsNotNull() {
            addCriterion("t_iems_building.building_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneEqualTo(String value) {
            addCriterion("t_iems_building.building_telephone =", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneNotEqualTo(String value) {
            addCriterion("t_iems_building.building_telephone <>", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneGreaterThan(String value) {
            addCriterion("t_iems_building.building_telephone >", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_telephone >=", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneLessThan(String value) {
            addCriterion("t_iems_building.building_telephone <", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_telephone <=", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneLike(String value) {
            addCriterion("t_iems_building.building_telephone like", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneNotLike(String value) {
            addCriterion("t_iems_building.building_telephone not like", value, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneIn(List<String> values) {
            addCriterion("t_iems_building.building_telephone in", values, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneNotIn(List<String> values) {
            addCriterion("t_iems_building.building_telephone not in", values, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_telephone between", value1, value2, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingTelephoneNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_telephone not between", value1, value2, "buildingTelephone");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIsNull() {
            addCriterion("t_iems_building.building_status is null");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIsNotNull() {
            addCriterion("t_iems_building.building_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusEqualTo(String value) {
            addCriterion("t_iems_building.building_status =", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotEqualTo(String value) {
            addCriterion("t_iems_building.building_status <>", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusGreaterThan(String value) {
            addCriterion("t_iems_building.building_status >", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_status >=", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusLessThan(String value) {
            addCriterion("t_iems_building.building_status <", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.building_status <=", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusLike(String value) {
            addCriterion("t_iems_building.building_status like", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotLike(String value) {
            addCriterion("t_iems_building.building_status not like", value, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusIn(List<String> values) {
            addCriterion("t_iems_building.building_status in", values, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotIn(List<String> values) {
            addCriterion("t_iems_building.building_status not in", values, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_status between", value1, value2, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andBuildingStatusNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.building_status not between", value1, value2, "buildingStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("t_iems_building.is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("t_iems_building.is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("t_iems_building.is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("t_iems_building.is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("t_iems_building.is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("t_iems_building.is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("t_iems_building.is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("t_iems_building.is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("t_iems_building.is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("t_iems_building.is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("t_iems_building.is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("t_iems_building.create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("t_iems_building.create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("t_iems_building.create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("t_iems_building.create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("t_iems_building.create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("t_iems_building.create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("t_iems_building.create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("t_iems_building.create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("t_iems_building.create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("t_iems_building.create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("t_iems_building.create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("t_iems_building.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("t_iems_building.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("t_iems_building.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("t_iems_building.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("t_iems_building.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_iems_building.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("t_iems_building.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_iems_building.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("t_iems_building.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("t_iems_building.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("t_iems_building.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_iems_building.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("t_iems_building.update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("t_iems_building.update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("t_iems_building.update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("t_iems_building.update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("t_iems_building.update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("t_iems_building.update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("t_iems_building.update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("t_iems_building.update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("t_iems_building.update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("t_iems_building.update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("t_iems_building.update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("t_iems_building.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("t_iems_building.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("t_iems_building.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("t_iems_building.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("t_iems_building.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_iems_building.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("t_iems_building.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_iems_building.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("t_iems_building.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("t_iems_building.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("t_iems_building.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_iems_building.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNull() {
            addCriterion("t_iems_building.lessee_id is null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNotNull() {
            addCriterion("t_iems_building.lessee_id is not null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdEqualTo(String value) {
            addCriterion("t_iems_building.lessee_id =", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotEqualTo(String value) {
            addCriterion("t_iems_building.lessee_id <>", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThan(String value) {
            addCriterion("t_iems_building.lessee_id >", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_iems_building.lessee_id >=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThan(String value) {
            addCriterion("t_iems_building.lessee_id <", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThanOrEqualTo(String value) {
            addCriterion("t_iems_building.lessee_id <=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLike(String value) {
            addCriterion("t_iems_building.lessee_id like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotLike(String value) {
            addCriterion("t_iems_building.lessee_id not like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIn(List<String> values) {
            addCriterion("t_iems_building.lessee_id in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotIn(List<String> values) {
            addCriterion("t_iems_building.lessee_id not in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdBetween(String value1, String value2) {
            addCriterion("t_iems_building.lessee_id between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotBetween(String value1, String value2) {
            addCriterion("t_iems_building.lessee_id not between", value1, value2, "lesseeId");
            return (Criteria) this;
        }
    }

    /**
     *
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