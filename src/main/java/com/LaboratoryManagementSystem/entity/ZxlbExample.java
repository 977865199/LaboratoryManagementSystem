package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZxlbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZxlbExample() {
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

        public Criteria andZxlbIdIsNull() {
            addCriterion("zxlb_ID is null");
            return (Criteria) this;
        }

        public Criteria andZxlbIdIsNotNull() {
            addCriterion("zxlb_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZxlbIdEqualTo(String value) {
            addCriterion("zxlb_ID =", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdNotEqualTo(String value) {
            addCriterion("zxlb_ID <>", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdGreaterThan(String value) {
            addCriterion("zxlb_ID >", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdGreaterThanOrEqualTo(String value) {
            addCriterion("zxlb_ID >=", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdLessThan(String value) {
            addCriterion("zxlb_ID <", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdLessThanOrEqualTo(String value) {
            addCriterion("zxlb_ID <=", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdLike(String value) {
            addCriterion("zxlb_ID like", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdNotLike(String value) {
            addCriterion("zxlb_ID not like", value, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdIn(List<String> values) {
            addCriterion("zxlb_ID in", values, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdNotIn(List<String> values) {
            addCriterion("zxlb_ID not in", values, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdBetween(String value1, String value2) {
            addCriterion("zxlb_ID between", value1, value2, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbIdNotBetween(String value1, String value2) {
            addCriterion("zxlb_ID not between", value1, value2, "zxlbId");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidIsNull() {
            addCriterion("zxlb_ZyjhID is null");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidIsNotNull() {
            addCriterion("zxlb_ZyjhID is not null");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidEqualTo(String value) {
            addCriterion("zxlb_ZyjhID =", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidNotEqualTo(String value) {
            addCriterion("zxlb_ZyjhID <>", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidGreaterThan(String value) {
            addCriterion("zxlb_ZyjhID >", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidGreaterThanOrEqualTo(String value) {
            addCriterion("zxlb_ZyjhID >=", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidLessThan(String value) {
            addCriterion("zxlb_ZyjhID <", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidLessThanOrEqualTo(String value) {
            addCriterion("zxlb_ZyjhID <=", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidLike(String value) {
            addCriterion("zxlb_ZyjhID like", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidNotLike(String value) {
            addCriterion("zxlb_ZyjhID not like", value, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidIn(List<String> values) {
            addCriterion("zxlb_ZyjhID in", values, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidNotIn(List<String> values) {
            addCriterion("zxlb_ZyjhID not in", values, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidBetween(String value1, String value2) {
            addCriterion("zxlb_ZyjhID between", value1, value2, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbZyjhidNotBetween(String value1, String value2) {
            addCriterion("zxlb_ZyjhID not between", value1, value2, "zxlbZyjhid");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeIsNull() {
            addCriterion("zxlb_Datetime is null");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeIsNotNull() {
            addCriterion("zxlb_Datetime is not null");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeEqualTo(Date value) {
            addCriterion("zxlb_Datetime =", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeNotEqualTo(Date value) {
            addCriterion("zxlb_Datetime <>", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeGreaterThan(Date value) {
            addCriterion("zxlb_Datetime >", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zxlb_Datetime >=", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeLessThan(Date value) {
            addCriterion("zxlb_Datetime <", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zxlb_Datetime <=", value, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeIn(List<Date> values) {
            addCriterion("zxlb_Datetime in", values, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeNotIn(List<Date> values) {
            addCriterion("zxlb_Datetime not in", values, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeBetween(Date value1, Date value2) {
            addCriterion("zxlb_Datetime between", value1, value2, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zxlb_Datetime not between", value1, value2, "zxlbDatetime");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionIsNull() {
            addCriterion("zxlb_Description is null");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionIsNotNull() {
            addCriterion("zxlb_Description is not null");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionEqualTo(String value) {
            addCriterion("zxlb_Description =", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionNotEqualTo(String value) {
            addCriterion("zxlb_Description <>", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionGreaterThan(String value) {
            addCriterion("zxlb_Description >", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("zxlb_Description >=", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionLessThan(String value) {
            addCriterion("zxlb_Description <", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionLessThanOrEqualTo(String value) {
            addCriterion("zxlb_Description <=", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionLike(String value) {
            addCriterion("zxlb_Description like", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionNotLike(String value) {
            addCriterion("zxlb_Description not like", value, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionIn(List<String> values) {
            addCriterion("zxlb_Description in", values, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionNotIn(List<String> values) {
            addCriterion("zxlb_Description not in", values, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionBetween(String value1, String value2) {
            addCriterion("zxlb_Description between", value1, value2, "zxlbDescription");
            return (Criteria) this;
        }

        public Criteria andZxlbDescriptionNotBetween(String value1, String value2) {
            addCriterion("zxlb_Description not between", value1, value2, "zxlbDescription");
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