package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

public class XmlbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XmlbExample() {
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

        public Criteria andXmlbIdIsNull() {
            addCriterion("xmlb_ID is null");
            return (Criteria) this;
        }

        public Criteria andXmlbIdIsNotNull() {
            addCriterion("xmlb_ID is not null");
            return (Criteria) this;
        }

        public Criteria andXmlbIdEqualTo(String value) {
            addCriterion("xmlb_ID =", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdNotEqualTo(String value) {
            addCriterion("xmlb_ID <>", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdGreaterThan(String value) {
            addCriterion("xmlb_ID >", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdGreaterThanOrEqualTo(String value) {
            addCriterion("xmlb_ID >=", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdLessThan(String value) {
            addCriterion("xmlb_ID <", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdLessThanOrEqualTo(String value) {
            addCriterion("xmlb_ID <=", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdLike(String value) {
            addCriterion("xmlb_ID like", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdNotLike(String value) {
            addCriterion("xmlb_ID not like", value, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdIn(List<String> values) {
            addCriterion("xmlb_ID in", values, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdNotIn(List<String> values) {
            addCriterion("xmlb_ID not in", values, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdBetween(String value1, String value2) {
            addCriterion("xmlb_ID between", value1, value2, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbIdNotBetween(String value1, String value2) {
            addCriterion("xmlb_ID not between", value1, value2, "xmlbId");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcIsNull() {
            addCriterion("xmlb_Xmmc is null");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcIsNotNull() {
            addCriterion("xmlb_Xmmc is not null");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcEqualTo(String value) {
            addCriterion("xmlb_Xmmc =", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcNotEqualTo(String value) {
            addCriterion("xmlb_Xmmc <>", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcGreaterThan(String value) {
            addCriterion("xmlb_Xmmc >", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("xmlb_Xmmc >=", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcLessThan(String value) {
            addCriterion("xmlb_Xmmc <", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcLessThanOrEqualTo(String value) {
            addCriterion("xmlb_Xmmc <=", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcLike(String value) {
            addCriterion("xmlb_Xmmc like", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcNotLike(String value) {
            addCriterion("xmlb_Xmmc not like", value, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcIn(List<String> values) {
            addCriterion("xmlb_Xmmc in", values, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcNotIn(List<String> values) {
            addCriterion("xmlb_Xmmc not in", values, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcBetween(String value1, String value2) {
            addCriterion("xmlb_Xmmc between", value1, value2, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbXmmcNotBetween(String value1, String value2) {
            addCriterion("xmlb_Xmmc not between", value1, value2, "xmlbXmmc");
            return (Criteria) this;
        }

        public Criteria andXmlbMsIsNull() {
            addCriterion("xmlb_ms is null");
            return (Criteria) this;
        }

        public Criteria andXmlbMsIsNotNull() {
            addCriterion("xmlb_ms is not null");
            return (Criteria) this;
        }

        public Criteria andXmlbMsEqualTo(String value) {
            addCriterion("xmlb_ms =", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsNotEqualTo(String value) {
            addCriterion("xmlb_ms <>", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsGreaterThan(String value) {
            addCriterion("xmlb_ms >", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsGreaterThanOrEqualTo(String value) {
            addCriterion("xmlb_ms >=", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsLessThan(String value) {
            addCriterion("xmlb_ms <", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsLessThanOrEqualTo(String value) {
            addCriterion("xmlb_ms <=", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsLike(String value) {
            addCriterion("xmlb_ms like", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsNotLike(String value) {
            addCriterion("xmlb_ms not like", value, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsIn(List<String> values) {
            addCriterion("xmlb_ms in", values, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsNotIn(List<String> values) {
            addCriterion("xmlb_ms not in", values, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsBetween(String value1, String value2) {
            addCriterion("xmlb_ms between", value1, value2, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbMsNotBetween(String value1, String value2) {
            addCriterion("xmlb_ms not between", value1, value2, "xmlbMs");
            return (Criteria) this;
        }

        public Criteria andXmlbZqIsNull() {
            addCriterion("xmlb_zq is null");
            return (Criteria) this;
        }

        public Criteria andXmlbZqIsNotNull() {
            addCriterion("xmlb_zq is not null");
            return (Criteria) this;
        }

        public Criteria andXmlbZqEqualTo(String value) {
            addCriterion("xmlb_zq =", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqNotEqualTo(String value) {
            addCriterion("xmlb_zq <>", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqGreaterThan(String value) {
            addCriterion("xmlb_zq >", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqGreaterThanOrEqualTo(String value) {
            addCriterion("xmlb_zq >=", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqLessThan(String value) {
            addCriterion("xmlb_zq <", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqLessThanOrEqualTo(String value) {
            addCriterion("xmlb_zq <=", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqLike(String value) {
            addCriterion("xmlb_zq like", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqNotLike(String value) {
            addCriterion("xmlb_zq not like", value, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqIn(List<String> values) {
            addCriterion("xmlb_zq in", values, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqNotIn(List<String> values) {
            addCriterion("xmlb_zq not in", values, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqBetween(String value1, String value2) {
            addCriterion("xmlb_zq between", value1, value2, "xmlbZq");
            return (Criteria) this;
        }

        public Criteria andXmlbZqNotBetween(String value1, String value2) {
            addCriterion("xmlb_zq not between", value1, value2, "xmlbZq");
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