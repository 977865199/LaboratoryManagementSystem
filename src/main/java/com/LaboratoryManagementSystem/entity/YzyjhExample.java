package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

public class YzyjhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YzyjhExample() {
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

        public Criteria andYzyjhIdIsNull() {
            addCriterion("yzyjh_ID is null");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdIsNotNull() {
            addCriterion("yzyjh_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdEqualTo(String value) {
            addCriterion("yzyjh_ID =", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdNotEqualTo(String value) {
            addCriterion("yzyjh_ID <>", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdGreaterThan(String value) {
            addCriterion("yzyjh_ID >", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdGreaterThanOrEqualTo(String value) {
            addCriterion("yzyjh_ID >=", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdLessThan(String value) {
            addCriterion("yzyjh_ID <", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdLessThanOrEqualTo(String value) {
            addCriterion("yzyjh_ID <=", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdLike(String value) {
            addCriterion("yzyjh_ID like", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdNotLike(String value) {
            addCriterion("yzyjh_ID not like", value, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdIn(List<String> values) {
            addCriterion("yzyjh_ID in", values, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdNotIn(List<String> values) {
            addCriterion("yzyjh_ID not in", values, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdBetween(String value1, String value2) {
            addCriterion("yzyjh_ID between", value1, value2, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhIdNotBetween(String value1, String value2) {
            addCriterion("yzyjh_ID not between", value1, value2, "yzyjhId");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearIsNull() {
            addCriterion("yzyjh_Year is null");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearIsNotNull() {
            addCriterion("yzyjh_Year is not null");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearEqualTo(String value) {
            addCriterion("yzyjh_Year =", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearNotEqualTo(String value) {
            addCriterion("yzyjh_Year <>", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearGreaterThan(String value) {
            addCriterion("yzyjh_Year >", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearGreaterThanOrEqualTo(String value) {
            addCriterion("yzyjh_Year >=", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearLessThan(String value) {
            addCriterion("yzyjh_Year <", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearLessThanOrEqualTo(String value) {
            addCriterion("yzyjh_Year <=", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearLike(String value) {
            addCriterion("yzyjh_Year like", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearNotLike(String value) {
            addCriterion("yzyjh_Year not like", value, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearIn(List<String> values) {
            addCriterion("yzyjh_Year in", values, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearNotIn(List<String> values) {
            addCriterion("yzyjh_Year not in", values, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearBetween(String value1, String value2) {
            addCriterion("yzyjh_Year between", value1, value2, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhYearNotBetween(String value1, String value2) {
            addCriterion("yzyjh_Year not between", value1, value2, "yzyjhYear");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthIsNull() {
            addCriterion("yzyjh_Month is null");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthIsNotNull() {
            addCriterion("yzyjh_Month is not null");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthEqualTo(String value) {
            addCriterion("yzyjh_Month =", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthNotEqualTo(String value) {
            addCriterion("yzyjh_Month <>", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthGreaterThan(String value) {
            addCriterion("yzyjh_Month >", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthGreaterThanOrEqualTo(String value) {
            addCriterion("yzyjh_Month >=", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthLessThan(String value) {
            addCriterion("yzyjh_Month <", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthLessThanOrEqualTo(String value) {
            addCriterion("yzyjh_Month <=", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthLike(String value) {
            addCriterion("yzyjh_Month like", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthNotLike(String value) {
            addCriterion("yzyjh_Month not like", value, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthIn(List<String> values) {
            addCriterion("yzyjh_Month in", values, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthNotIn(List<String> values) {
            addCriterion("yzyjh_Month not in", values, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthBetween(String value1, String value2) {
            addCriterion("yzyjh_Month between", value1, value2, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhMonthNotBetween(String value1, String value2) {
            addCriterion("yzyjh_Month not between", value1, value2, "yzyjhMonth");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidIsNull() {
            addCriterion("yzyjh_XmlbId is null");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidIsNotNull() {
            addCriterion("yzyjh_XmlbId is not null");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidEqualTo(String value) {
            addCriterion("yzyjh_XmlbId =", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidNotEqualTo(String value) {
            addCriterion("yzyjh_XmlbId <>", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidGreaterThan(String value) {
            addCriterion("yzyjh_XmlbId >", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidGreaterThanOrEqualTo(String value) {
            addCriterion("yzyjh_XmlbId >=", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidLessThan(String value) {
            addCriterion("yzyjh_XmlbId <", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidLessThanOrEqualTo(String value) {
            addCriterion("yzyjh_XmlbId <=", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidLike(String value) {
            addCriterion("yzyjh_XmlbId like", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidNotLike(String value) {
            addCriterion("yzyjh_XmlbId not like", value, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidIn(List<String> values) {
            addCriterion("yzyjh_XmlbId in", values, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidNotIn(List<String> values) {
            addCriterion("yzyjh_XmlbId not in", values, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidBetween(String value1, String value2) {
            addCriterion("yzyjh_XmlbId between", value1, value2, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andYzyjhXmlbidNotBetween(String value1, String value2) {
            addCriterion("yzyjh_XmlbId not between", value1, value2, "yzyjhXmlbid");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusIsNull() {
            addCriterion("jzyjh_Status is null");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusIsNotNull() {
            addCriterion("jzyjh_Status is not null");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusEqualTo(String value) {
            addCriterion("jzyjh_Status =", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusNotEqualTo(String value) {
            addCriterion("jzyjh_Status <>", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusGreaterThan(String value) {
            addCriterion("jzyjh_Status >", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusGreaterThanOrEqualTo(String value) {
            addCriterion("jzyjh_Status >=", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusLessThan(String value) {
            addCriterion("jzyjh_Status <", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusLessThanOrEqualTo(String value) {
            addCriterion("jzyjh_Status <=", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusLike(String value) {
            addCriterion("jzyjh_Status like", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusNotLike(String value) {
            addCriterion("jzyjh_Status not like", value, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusIn(List<String> values) {
            addCriterion("jzyjh_Status in", values, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusNotIn(List<String> values) {
            addCriterion("jzyjh_Status not in", values, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusBetween(String value1, String value2) {
            addCriterion("jzyjh_Status between", value1, value2, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andJzyjhStatusNotBetween(String value1, String value2) {
            addCriterion("jzyjh_Status not between", value1, value2, "jzyjhStatus");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridIsNull() {
            addCriterion("yzyjh_TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridIsNotNull() {
            addCriterion("yzyjh_TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridEqualTo(String value) {
            addCriterion("yzyjh_TeacherID =", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridNotEqualTo(String value) {
            addCriterion("yzyjh_TeacherID <>", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridGreaterThan(String value) {
            addCriterion("yzyjh_TeacherID >", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("yzyjh_TeacherID >=", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridLessThan(String value) {
            addCriterion("yzyjh_TeacherID <", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridLessThanOrEqualTo(String value) {
            addCriterion("yzyjh_TeacherID <=", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridLike(String value) {
            addCriterion("yzyjh_TeacherID like", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridNotLike(String value) {
            addCriterion("yzyjh_TeacherID not like", value, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridIn(List<String> values) {
            addCriterion("yzyjh_TeacherID in", values, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridNotIn(List<String> values) {
            addCriterion("yzyjh_TeacherID not in", values, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridBetween(String value1, String value2) {
            addCriterion("yzyjh_TeacherID between", value1, value2, "yzyjhTeacherid");
            return (Criteria) this;
        }

        public Criteria andYzyjhTeacheridNotBetween(String value1, String value2) {
            addCriterion("yzyjh_TeacherID not between", value1, value2, "yzyjhTeacherid");
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