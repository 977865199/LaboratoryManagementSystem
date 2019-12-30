package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ZzyjhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZzyjhExample() {
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

        public Criteria andZzyjhIdIsNull() {
            addCriterion("zzyjh_ID is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdIsNotNull() {
            addCriterion("zzyjh_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdEqualTo(String value) {
            addCriterion("zzyjh_ID =", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdNotEqualTo(String value) {
            addCriterion("zzyjh_ID <>", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdGreaterThan(String value) {
            addCriterion("zzyjh_ID >", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_ID >=", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdLessThan(String value) {
            addCriterion("zzyjh_ID <", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_ID <=", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdLike(String value) {
            addCriterion("zzyjh_ID like", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdNotLike(String value) {
            addCriterion("zzyjh_ID not like", value, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdIn(List<String> values) {
            addCriterion("zzyjh_ID in", values, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdNotIn(List<String> values) {
            addCriterion("zzyjh_ID not in", values, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdBetween(String value1, String value2) {
            addCriterion("zzyjh_ID between", value1, value2, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhIdNotBetween(String value1, String value2) {
            addCriterion("zzyjh_ID not between", value1, value2, "zzyjhId");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearIsNull() {
            addCriterion("zzyjh_Year is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearIsNotNull() {
            addCriterion("zzyjh_Year is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearEqualTo(String value) {
            addCriterion("zzyjh_Year =", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearNotEqualTo(String value) {
            addCriterion("zzyjh_Year <>", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearGreaterThan(String value) {
            addCriterion("zzyjh_Year >", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_Year >=", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearLessThan(String value) {
            addCriterion("zzyjh_Year <", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_Year <=", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearLike(String value) {
            addCriterion("zzyjh_Year like", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearNotLike(String value) {
            addCriterion("zzyjh_Year not like", value, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearIn(List<String> values) {
            addCriterion("zzyjh_Year in", values, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearNotIn(List<String> values) {
            addCriterion("zzyjh_Year not in", values, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearBetween(String value1, String value2) {
            addCriterion("zzyjh_Year between", value1, value2, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhYearNotBetween(String value1, String value2) {
            addCriterion("zzyjh_Year not between", value1, value2, "zzyjhYear");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthIsNull() {
            addCriterion("zzyjh_Month is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthIsNotNull() {
            addCriterion("zzyjh_Month is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthEqualTo(String value) {
            addCriterion("zzyjh_Month =", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthNotEqualTo(String value) {
            addCriterion("zzyjh_Month <>", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthGreaterThan(String value) {
            addCriterion("zzyjh_Month >", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_Month >=", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthLessThan(String value) {
            addCriterion("zzyjh_Month <", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_Month <=", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthLike(String value) {
            addCriterion("zzyjh_Month like", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthNotLike(String value) {
            addCriterion("zzyjh_Month not like", value, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthIn(List<String> values) {
            addCriterion("zzyjh_Month in", values, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthNotIn(List<String> values) {
            addCriterion("zzyjh_Month not in", values, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthBetween(String value1, String value2) {
            addCriterion("zzyjh_Month between", value1, value2, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhMonthNotBetween(String value1, String value2) {
            addCriterion("zzyjh_Month not between", value1, value2, "zzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekIsNull() {
            addCriterion("zzyjh_Week is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekIsNotNull() {
            addCriterion("zzyjh_Week is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekEqualTo(String value) {
            addCriterion("zzyjh_Week =", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekNotEqualTo(String value) {
            addCriterion("zzyjh_Week <>", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekGreaterThan(String value) {
            addCriterion("zzyjh_Week >", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_Week >=", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekLessThan(String value) {
            addCriterion("zzyjh_Week <", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_Week <=", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekLike(String value) {
            addCriterion("zzyjh_Week like", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekNotLike(String value) {
            addCriterion("zzyjh_Week not like", value, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekIn(List<String> values) {
            addCriterion("zzyjh_Week in", values, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekNotIn(List<String> values) {
            addCriterion("zzyjh_Week not in", values, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekBetween(String value1, String value2) {
            addCriterion("zzyjh_Week between", value1, value2, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhWeekNotBetween(String value1, String value2) {
            addCriterion("zzyjh_Week not between", value1, value2, "zzyjhWeek");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidIsNull() {
            addCriterion("zzyjh_XmlbId is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidIsNotNull() {
            addCriterion("zzyjh_XmlbId is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidEqualTo(String value) {
            addCriterion("zzyjh_XmlbId =", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidNotEqualTo(String value) {
            addCriterion("zzyjh_XmlbId <>", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidGreaterThan(String value) {
            addCriterion("zzyjh_XmlbId >", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_XmlbId >=", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidLessThan(String value) {
            addCriterion("zzyjh_XmlbId <", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_XmlbId <=", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidLike(String value) {
            addCriterion("zzyjh_XmlbId like", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidNotLike(String value) {
            addCriterion("zzyjh_XmlbId not like", value, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidIn(List<String> values) {
            addCriterion("zzyjh_XmlbId in", values, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidNotIn(List<String> values) {
            addCriterion("zzyjh_XmlbId not in", values, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidBetween(String value1, String value2) {
            addCriterion("zzyjh_XmlbId between", value1, value2, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhXmlbidNotBetween(String value1, String value2) {
            addCriterion("zzyjh_XmlbId not between", value1, value2, "zzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusIsNull() {
            addCriterion("zzyjh_Status is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusIsNotNull() {
            addCriterion("zzyjh_Status is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusEqualTo(String value) {
            addCriterion("zzyjh_Status =", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusNotEqualTo(String value) {
            addCriterion("zzyjh_Status <>", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusGreaterThan(String value) {
            addCriterion("zzyjh_Status >", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_Status >=", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusLessThan(String value) {
            addCriterion("zzyjh_Status <", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_Status <=", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusLike(String value) {
            addCriterion("zzyjh_Status like", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusNotLike(String value) {
            addCriterion("zzyjh_Status not like", value, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusIn(List<String> values) {
            addCriterion("zzyjh_Status in", values, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusNotIn(List<String> values) {
            addCriterion("zzyjh_Status not in", values, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusBetween(String value1, String value2) {
            addCriterion("zzyjh_Status between", value1, value2, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhStatusNotBetween(String value1, String value2) {
            addCriterion("zzyjh_Status not between", value1, value2, "zzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridIsNull() {
            addCriterion("zzyjh_TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridIsNotNull() {
            addCriterion("zzyjh_TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridEqualTo(String value) {
            addCriterion("zzyjh_TeacherID =", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridNotEqualTo(String value) {
            addCriterion("zzyjh_TeacherID <>", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridGreaterThan(String value) {
            addCriterion("zzyjh_TeacherID >", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("zzyjh_TeacherID >=", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridLessThan(String value) {
            addCriterion("zzyjh_TeacherID <", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridLessThanOrEqualTo(String value) {
            addCriterion("zzyjh_TeacherID <=", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridLike(String value) {
            addCriterion("zzyjh_TeacherID like", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridNotLike(String value) {
            addCriterion("zzyjh_TeacherID not like", value, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridIn(List<String> values) {
            addCriterion("zzyjh_TeacherID in", values, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridNotIn(List<String> values) {
            addCriterion("zzyjh_TeacherID not in", values, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridBetween(String value1, String value2) {
            addCriterion("zzyjh_TeacherID between", value1, value2, "zzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andZzyjhTeacheridNotBetween(String value1, String value2) {
            addCriterion("zzyjh_TeacherID not between", value1, value2, "zzyjhTeacherid");
            return (Criteria) this;
        }
    }

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