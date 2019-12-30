package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_ID like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_ID not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIsNull() {
            addCriterion("teacher_Number is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIsNotNull() {
            addCriterion("teacher_Number is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberEqualTo(String value) {
            addCriterion("teacher_Number =", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotEqualTo(String value) {
            addCriterion("teacher_Number <>", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberGreaterThan(String value) {
            addCriterion("teacher_Number >", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Number >=", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLessThan(String value) {
            addCriterion("teacher_Number <", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLessThanOrEqualTo(String value) {
            addCriterion("teacher_Number <=", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLike(String value) {
            addCriterion("teacher_Number like", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotLike(String value) {
            addCriterion("teacher_Number not like", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIn(List<String> values) {
            addCriterion("teacher_Number in", values, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotIn(List<String> values) {
            addCriterion("teacher_Number not in", values, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberBetween(String value1, String value2) {
            addCriterion("teacher_Number between", value1, value2, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotBetween(String value1, String value2) {
            addCriterion("teacher_Number not between", value1, value2, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNull() {
            addCriterion("teacher_Password is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNotNull() {
            addCriterion("teacher_Password is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordEqualTo(String value) {
            addCriterion("teacher_Password =", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotEqualTo(String value) {
            addCriterion("teacher_Password <>", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThan(String value) {
            addCriterion("teacher_Password >", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Password >=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThan(String value) {
            addCriterion("teacher_Password <", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThanOrEqualTo(String value) {
            addCriterion("teacher_Password <=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLike(String value) {
            addCriterion("teacher_Password like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotLike(String value) {
            addCriterion("teacher_Password not like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIn(List<String> values) {
            addCriterion("teacher_Password in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotIn(List<String> values) {
            addCriterion("teacher_Password not in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordBetween(String value1, String value2) {
            addCriterion("teacher_Password between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotBetween(String value1, String value2) {
            addCriterion("teacher_Password not between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_Name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_Name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_Name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_Name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_Name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_Name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_Name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_Name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_Name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_Name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_Name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_Name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNull() {
            addCriterion("teacher_Title is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNotNull() {
            addCriterion("teacher_Title is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleEqualTo(String value) {
            addCriterion("teacher_Title =", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotEqualTo(String value) {
            addCriterion("teacher_Title <>", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThan(String value) {
            addCriterion("teacher_Title >", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Title >=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThan(String value) {
            addCriterion("teacher_Title <", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_Title <=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLike(String value) {
            addCriterion("teacher_Title like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotLike(String value) {
            addCriterion("teacher_Title not like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIn(List<String> values) {
            addCriterion("teacher_Title in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotIn(List<String> values) {
            addCriterion("teacher_Title not in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleBetween(String value1, String value2) {
            addCriterion("teacher_Title between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotBetween(String value1, String value2) {
            addCriterion("teacher_Title not between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNull() {
            addCriterion("teacher_Gender is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNotNull() {
            addCriterion("teacher_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderEqualTo(String value) {
            addCriterion("teacher_Gender =", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotEqualTo(String value) {
            addCriterion("teacher_Gender <>", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThan(String value) {
            addCriterion("teacher_Gender >", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Gender >=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThan(String value) {
            addCriterion("teacher_Gender <", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThanOrEqualTo(String value) {
            addCriterion("teacher_Gender <=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLike(String value) {
            addCriterion("teacher_Gender like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotLike(String value) {
            addCriterion("teacher_Gender not like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIn(List<String> values) {
            addCriterion("teacher_Gender in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotIn(List<String> values) {
            addCriterion("teacher_Gender not in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderBetween(String value1, String value2) {
            addCriterion("teacher_Gender between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotBetween(String value1, String value2) {
            addCriterion("teacher_Gender not between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkIsNull() {
            addCriterion("teacher_Work is null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkIsNotNull() {
            addCriterion("teacher_Work is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkEqualTo(String value) {
            addCriterion("teacher_Work =", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkNotEqualTo(String value) {
            addCriterion("teacher_Work <>", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkGreaterThan(String value) {
            addCriterion("teacher_Work >", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Work >=", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkLessThan(String value) {
            addCriterion("teacher_Work <", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkLessThanOrEqualTo(String value) {
            addCriterion("teacher_Work <=", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkLike(String value) {
            addCriterion("teacher_Work like", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkNotLike(String value) {
            addCriterion("teacher_Work not like", value, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkIn(List<String> values) {
            addCriterion("teacher_Work in", values, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkNotIn(List<String> values) {
            addCriterion("teacher_Work not in", values, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkBetween(String value1, String value2) {
            addCriterion("teacher_Work between", value1, value2, "teacherWork");
            return (Criteria) this;
        }

        public Criteria andTeacherWorkNotBetween(String value1, String value2) {
            addCriterion("teacher_Work not between", value1, value2, "teacherWork");
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