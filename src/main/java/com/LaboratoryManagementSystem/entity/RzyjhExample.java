package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

public class RzyjhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RzyjhExample() {
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

        public Criteria andRzyjhIdIsNull() {
            addCriterion("rzyjh_ID is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdIsNotNull() {
            addCriterion("rzyjh_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdEqualTo(String value) {
            addCriterion("rzyjh_ID =", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdNotEqualTo(String value) {
            addCriterion("rzyjh_ID <>", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdGreaterThan(String value) {
            addCriterion("rzyjh_ID >", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_ID >=", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdLessThan(String value) {
            addCriterion("rzyjh_ID <", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_ID <=", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdLike(String value) {
            addCriterion("rzyjh_ID like", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdNotLike(String value) {
            addCriterion("rzyjh_ID not like", value, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdIn(List<String> values) {
            addCriterion("rzyjh_ID in", values, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdNotIn(List<String> values) {
            addCriterion("rzyjh_ID not in", values, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdBetween(String value1, String value2) {
            addCriterion("rzyjh_ID between", value1, value2, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhIdNotBetween(String value1, String value2) {
            addCriterion("rzyjh_ID not between", value1, value2, "rzyjhId");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearIsNull() {
            addCriterion("rzyjh_Year is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearIsNotNull() {
            addCriterion("rzyjh_Year is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearEqualTo(String value) {
            addCriterion("rzyjh_Year =", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearNotEqualTo(String value) {
            addCriterion("rzyjh_Year <>", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearGreaterThan(String value) {
            addCriterion("rzyjh_Year >", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_Year >=", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearLessThan(String value) {
            addCriterion("rzyjh_Year <", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_Year <=", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearLike(String value) {
            addCriterion("rzyjh_Year like", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearNotLike(String value) {
            addCriterion("rzyjh_Year not like", value, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearIn(List<String> values) {
            addCriterion("rzyjh_Year in", values, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearNotIn(List<String> values) {
            addCriterion("rzyjh_Year not in", values, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearBetween(String value1, String value2) {
            addCriterion("rzyjh_Year between", value1, value2, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhYearNotBetween(String value1, String value2) {
            addCriterion("rzyjh_Year not between", value1, value2, "rzyjhYear");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthIsNull() {
            addCriterion("rzyjh_Month is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthIsNotNull() {
            addCriterion("rzyjh_Month is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthEqualTo(String value) {
            addCriterion("rzyjh_Month =", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthNotEqualTo(String value) {
            addCriterion("rzyjh_Month <>", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthGreaterThan(String value) {
            addCriterion("rzyjh_Month >", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_Month >=", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthLessThan(String value) {
            addCriterion("rzyjh_Month <", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_Month <=", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthLike(String value) {
            addCriterion("rzyjh_Month like", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthNotLike(String value) {
            addCriterion("rzyjh_Month not like", value, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthIn(List<String> values) {
            addCriterion("rzyjh_Month in", values, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthNotIn(List<String> values) {
            addCriterion("rzyjh_Month not in", values, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthBetween(String value1, String value2) {
            addCriterion("rzyjh_Month between", value1, value2, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhMonthNotBetween(String value1, String value2) {
            addCriterion("rzyjh_Month not between", value1, value2, "rzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayIsNull() {
            addCriterion("rzyjh_Day is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayIsNotNull() {
            addCriterion("rzyjh_Day is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayEqualTo(String value) {
            addCriterion("rzyjh_Day =", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayNotEqualTo(String value) {
            addCriterion("rzyjh_Day <>", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayGreaterThan(String value) {
            addCriterion("rzyjh_Day >", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_Day >=", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayLessThan(String value) {
            addCriterion("rzyjh_Day <", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_Day <=", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayLike(String value) {
            addCriterion("rzyjh_Day like", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayNotLike(String value) {
            addCriterion("rzyjh_Day not like", value, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayIn(List<String> values) {
            addCriterion("rzyjh_Day in", values, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayNotIn(List<String> values) {
            addCriterion("rzyjh_Day not in", values, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayBetween(String value1, String value2) {
            addCriterion("rzyjh_Day between", value1, value2, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhDayNotBetween(String value1, String value2) {
            addCriterion("rzyjh_Day not between", value1, value2, "rzyjhDay");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidIsNull() {
            addCriterion("rzyjh_XmlbId is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidIsNotNull() {
            addCriterion("rzyjh_XmlbId is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidEqualTo(String value) {
            addCriterion("rzyjh_XmlbId =", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidNotEqualTo(String value) {
            addCriterion("rzyjh_XmlbId <>", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidGreaterThan(String value) {
            addCriterion("rzyjh_XmlbId >", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_XmlbId >=", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidLessThan(String value) {
            addCriterion("rzyjh_XmlbId <", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_XmlbId <=", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidLike(String value) {
            addCriterion("rzyjh_XmlbId like", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidNotLike(String value) {
            addCriterion("rzyjh_XmlbId not like", value, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidIn(List<String> values) {
            addCriterion("rzyjh_XmlbId in", values, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidNotIn(List<String> values) {
            addCriterion("rzyjh_XmlbId not in", values, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidBetween(String value1, String value2) {
            addCriterion("rzyjh_XmlbId between", value1, value2, "rzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andRzyjhXmlbidNotBetween(String value1, String value2) {
            addCriterion("rzyjh_XmlbId not between", value1, value2, "rzyjhXmlbid");
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

        public Criteria andRzyjhTeacheridIsNull() {
            addCriterion("rzyjh_TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridIsNotNull() {
            addCriterion("rzyjh_TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridEqualTo(String value) {
            addCriterion("rzyjh_TeacherID =", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridNotEqualTo(String value) {
            addCriterion("rzyjh_TeacherID <>", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridGreaterThan(String value) {
            addCriterion("rzyjh_TeacherID >", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("rzyjh_TeacherID >=", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridLessThan(String value) {
            addCriterion("rzyjh_TeacherID <", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridLessThanOrEqualTo(String value) {
            addCriterion("rzyjh_TeacherID <=", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridLike(String value) {
            addCriterion("rzyjh_TeacherID like", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridNotLike(String value) {
            addCriterion("rzyjh_TeacherID not like", value, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridIn(List<String> values) {
            addCriterion("rzyjh_TeacherID in", values, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridNotIn(List<String> values) {
            addCriterion("rzyjh_TeacherID not in", values, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridBetween(String value1, String value2) {
            addCriterion("rzyjh_TeacherID between", value1, value2, "rzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andRzyjhTeacheridNotBetween(String value1, String value2) {
            addCriterion("rzyjh_TeacherID not between", value1, value2, "rzyjhTeacherid");
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