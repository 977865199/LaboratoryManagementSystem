package com.LaboratoryManagementSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TodoExample() {
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

        public Criteria andTodoIdIsNull() {
            addCriterion("todo_ID is null");
            return (Criteria) this;
        }

        public Criteria andTodoIdIsNotNull() {
            addCriterion("todo_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTodoIdEqualTo(String value) {
            addCriterion("todo_ID =", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotEqualTo(String value) {
            addCriterion("todo_ID <>", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdGreaterThan(String value) {
            addCriterion("todo_ID >", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdGreaterThanOrEqualTo(String value) {
            addCriterion("todo_ID >=", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLessThan(String value) {
            addCriterion("todo_ID <", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLessThanOrEqualTo(String value) {
            addCriterion("todo_ID <=", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLike(String value) {
            addCriterion("todo_ID like", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotLike(String value) {
            addCriterion("todo_ID not like", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdIn(List<String> values) {
            addCriterion("todo_ID in", values, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotIn(List<String> values) {
            addCriterion("todo_ID not in", values, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdBetween(String value1, String value2) {
            addCriterion("todo_ID between", value1, value2, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotBetween(String value1, String value2) {
            addCriterion("todo_ID not between", value1, value2, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionIsNull() {
            addCriterion("todo_Description is null");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionIsNotNull() {
            addCriterion("todo_Description is not null");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionEqualTo(String value) {
            addCriterion("todo_Description =", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionNotEqualTo(String value) {
            addCriterion("todo_Description <>", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionGreaterThan(String value) {
            addCriterion("todo_Description >", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("todo_Description >=", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionLessThan(String value) {
            addCriterion("todo_Description <", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("todo_Description <=", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionLike(String value) {
            addCriterion("todo_Description like", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionNotLike(String value) {
            addCriterion("todo_Description not like", value, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionIn(List<String> values) {
            addCriterion("todo_Description in", values, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionNotIn(List<String> values) {
            addCriterion("todo_Description not in", values, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionBetween(String value1, String value2) {
            addCriterion("todo_Description between", value1, value2, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoDescriptionNotBetween(String value1, String value2) {
            addCriterion("todo_Description not between", value1, value2, "todoDescription");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridIsNull() {
            addCriterion("todo_TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridIsNotNull() {
            addCriterion("todo_TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridEqualTo(String value) {
            addCriterion("todo_TeacherID =", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridNotEqualTo(String value) {
            addCriterion("todo_TeacherID <>", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridGreaterThan(String value) {
            addCriterion("todo_TeacherID >", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("todo_TeacherID >=", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridLessThan(String value) {
            addCriterion("todo_TeacherID <", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridLessThanOrEqualTo(String value) {
            addCriterion("todo_TeacherID <=", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridLike(String value) {
            addCriterion("todo_TeacherID like", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridNotLike(String value) {
            addCriterion("todo_TeacherID not like", value, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridIn(List<String> values) {
            addCriterion("todo_TeacherID in", values, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridNotIn(List<String> values) {
            addCriterion("todo_TeacherID not in", values, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridBetween(String value1, String value2) {
            addCriterion("todo_TeacherID between", value1, value2, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoTeacheridNotBetween(String value1, String value2) {
            addCriterion("todo_TeacherID not between", value1, value2, "todoTeacherid");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeIsNull() {
            addCriterion("todo_AnpaiTime is null");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeIsNotNull() {
            addCriterion("todo_AnpaiTime is not null");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeEqualTo(Date value) {
            addCriterion("todo_AnpaiTime =", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeNotEqualTo(Date value) {
            addCriterion("todo_AnpaiTime <>", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeGreaterThan(Date value) {
            addCriterion("todo_AnpaiTime >", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("todo_AnpaiTime >=", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeLessThan(Date value) {
            addCriterion("todo_AnpaiTime <", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeLessThanOrEqualTo(Date value) {
            addCriterion("todo_AnpaiTime <=", value, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeIn(List<Date> values) {
            addCriterion("todo_AnpaiTime in", values, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeNotIn(List<Date> values) {
            addCriterion("todo_AnpaiTime not in", values, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeBetween(Date value1, Date value2) {
            addCriterion("todo_AnpaiTime between", value1, value2, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpaitimeNotBetween(Date value1, Date value2) {
            addCriterion("todo_AnpaiTime not between", value1, value2, "todoAnpaitime");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenIsNull() {
            addCriterion("todo_Anpairen is null");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenIsNotNull() {
            addCriterion("todo_Anpairen is not null");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenEqualTo(String value) {
            addCriterion("todo_Anpairen =", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenNotEqualTo(String value) {
            addCriterion("todo_Anpairen <>", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenGreaterThan(String value) {
            addCriterion("todo_Anpairen >", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenGreaterThanOrEqualTo(String value) {
            addCriterion("todo_Anpairen >=", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenLessThan(String value) {
            addCriterion("todo_Anpairen <", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenLessThanOrEqualTo(String value) {
            addCriterion("todo_Anpairen <=", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenLike(String value) {
            addCriterion("todo_Anpairen like", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenNotLike(String value) {
            addCriterion("todo_Anpairen not like", value, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenIn(List<String> values) {
            addCriterion("todo_Anpairen in", values, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenNotIn(List<String> values) {
            addCriterion("todo_Anpairen not in", values, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenBetween(String value1, String value2) {
            addCriterion("todo_Anpairen between", value1, value2, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoAnpairenNotBetween(String value1, String value2) {
            addCriterion("todo_Anpairen not between", value1, value2, "todoAnpairen");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeIsNull() {
            addCriterion("todo_FinalTime is null");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeIsNotNull() {
            addCriterion("todo_FinalTime is not null");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeEqualTo(Date value) {
            addCriterion("todo_FinalTime =", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeNotEqualTo(Date value) {
            addCriterion("todo_FinalTime <>", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeGreaterThan(Date value) {
            addCriterion("todo_FinalTime >", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("todo_FinalTime >=", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeLessThan(Date value) {
            addCriterion("todo_FinalTime <", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeLessThanOrEqualTo(Date value) {
            addCriterion("todo_FinalTime <=", value, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeIn(List<Date> values) {
            addCriterion("todo_FinalTime in", values, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeNotIn(List<Date> values) {
            addCriterion("todo_FinalTime not in", values, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeBetween(Date value1, Date value2) {
            addCriterion("todo_FinalTime between", value1, value2, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoFinaltimeNotBetween(Date value1, Date value2) {
            addCriterion("todo_FinalTime not between", value1, value2, "todoFinaltime");
            return (Criteria) this;
        }

        public Criteria andTodoStatusIsNull() {
            addCriterion("todo_Status is null");
            return (Criteria) this;
        }

        public Criteria andTodoStatusIsNotNull() {
            addCriterion("todo_Status is not null");
            return (Criteria) this;
        }

        public Criteria andTodoStatusEqualTo(String value) {
            addCriterion("todo_Status =", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusNotEqualTo(String value) {
            addCriterion("todo_Status <>", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusGreaterThan(String value) {
            addCriterion("todo_Status >", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("todo_Status >=", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusLessThan(String value) {
            addCriterion("todo_Status <", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusLessThanOrEqualTo(String value) {
            addCriterion("todo_Status <=", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusLike(String value) {
            addCriterion("todo_Status like", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusNotLike(String value) {
            addCriterion("todo_Status not like", value, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusIn(List<String> values) {
            addCriterion("todo_Status in", values, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusNotIn(List<String> values) {
            addCriterion("todo_Status not in", values, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusBetween(String value1, String value2) {
            addCriterion("todo_Status between", value1, value2, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoStatusNotBetween(String value1, String value2) {
            addCriterion("todo_Status not between", value1, value2, "todoStatus");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenIsNull() {
            addCriterion("todo_Zerenren is null");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenIsNotNull() {
            addCriterion("todo_Zerenren is not null");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenEqualTo(String value) {
            addCriterion("todo_Zerenren =", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenNotEqualTo(String value) {
            addCriterion("todo_Zerenren <>", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenGreaterThan(String value) {
            addCriterion("todo_Zerenren >", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenGreaterThanOrEqualTo(String value) {
            addCriterion("todo_Zerenren >=", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenLessThan(String value) {
            addCriterion("todo_Zerenren <", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenLessThanOrEqualTo(String value) {
            addCriterion("todo_Zerenren <=", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenLike(String value) {
            addCriterion("todo_Zerenren like", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenNotLike(String value) {
            addCriterion("todo_Zerenren not like", value, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenIn(List<String> values) {
            addCriterion("todo_Zerenren in", values, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenNotIn(List<String> values) {
            addCriterion("todo_Zerenren not in", values, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenBetween(String value1, String value2) {
            addCriterion("todo_Zerenren between", value1, value2, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoZerenrenNotBetween(String value1, String value2) {
            addCriterion("todo_Zerenren not between", value1, value2, "todoZerenren");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeIsNull() {
            addCriterion("todo_Datetime is null");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeIsNotNull() {
            addCriterion("todo_Datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeEqualTo(Date value) {
            addCriterion("todo_Datetime =", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeNotEqualTo(Date value) {
            addCriterion("todo_Datetime <>", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeGreaterThan(Date value) {
            addCriterion("todo_Datetime >", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("todo_Datetime >=", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeLessThan(Date value) {
            addCriterion("todo_Datetime <", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("todo_Datetime <=", value, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeIn(List<Date> values) {
            addCriterion("todo_Datetime in", values, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeNotIn(List<Date> values) {
            addCriterion("todo_Datetime not in", values, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeBetween(Date value1, Date value2) {
            addCriterion("todo_Datetime between", value1, value2, "todoDatetime");
            return (Criteria) this;
        }

        public Criteria andTodoDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("todo_Datetime not between", value1, value2, "todoDatetime");
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