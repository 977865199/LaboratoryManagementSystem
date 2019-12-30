package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("log_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("log_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("log_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("log_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("log_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("log_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("log_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("log_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("log_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("log_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("log_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("log_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIsNull() {
            addCriterion("log_Description is null");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIsNotNull() {
            addCriterion("log_Description is not null");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionEqualTo(String value) {
            addCriterion("log_Description =", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotEqualTo(String value) {
            addCriterion("log_Description <>", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionGreaterThan(String value) {
            addCriterion("log_Description >", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("log_Description >=", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLessThan(String value) {
            addCriterion("log_Description <", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLessThanOrEqualTo(String value) {
            addCriterion("log_Description <=", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLike(String value) {
            addCriterion("log_Description like", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotLike(String value) {
            addCriterion("log_Description not like", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIn(List<String> values) {
            addCriterion("log_Description in", values, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotIn(List<String> values) {
            addCriterion("log_Description not in", values, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionBetween(String value1, String value2) {
            addCriterion("log_Description between", value1, value2, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotBetween(String value1, String value2) {
            addCriterion("log_Description not between", value1, value2, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridIsNull() {
            addCriterion("log_TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridIsNotNull() {
            addCriterion("log_TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridEqualTo(String value) {
            addCriterion("log_TeacherID =", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridNotEqualTo(String value) {
            addCriterion("log_TeacherID <>", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridGreaterThan(String value) {
            addCriterion("log_TeacherID >", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("log_TeacherID >=", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridLessThan(String value) {
            addCriterion("log_TeacherID <", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridLessThanOrEqualTo(String value) {
            addCriterion("log_TeacherID <=", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridLike(String value) {
            addCriterion("log_TeacherID like", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridNotLike(String value) {
            addCriterion("log_TeacherID not like", value, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridIn(List<String> values) {
            addCriterion("log_TeacherID in", values, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridNotIn(List<String> values) {
            addCriterion("log_TeacherID not in", values, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridBetween(String value1, String value2) {
            addCriterion("log_TeacherID between", value1, value2, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTeacheridNotBetween(String value1, String value2) {
            addCriterion("log_TeacherID not between", value1, value2, "logTeacherid");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_Time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("log_Time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("log_Time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("log_Time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_Time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("log_Time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_Time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("log_Time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("log_Time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("log_Time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_Time not between", value1, value2, "logTime");
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