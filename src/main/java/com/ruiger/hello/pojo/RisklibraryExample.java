package com.ruiger.hello.pojo;

import java.util.ArrayList;
import java.util.List;

public class RisklibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RisklibraryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNull() {
            addCriterion("riskType is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("riskType is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("riskType =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("riskType <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("riskType >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("riskType >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("riskType <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("riskType <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("riskType like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("riskType not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("riskType in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("riskType not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("riskType between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("riskType not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisknameIsNull() {
            addCriterion("riskName is null");
            return (Criteria) this;
        }

        public Criteria andRisknameIsNotNull() {
            addCriterion("riskName is not null");
            return (Criteria) this;
        }

        public Criteria andRisknameEqualTo(String value) {
            addCriterion("riskName =", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameNotEqualTo(String value) {
            addCriterion("riskName <>", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameGreaterThan(String value) {
            addCriterion("riskName >", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameGreaterThanOrEqualTo(String value) {
            addCriterion("riskName >=", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameLessThan(String value) {
            addCriterion("riskName <", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameLessThanOrEqualTo(String value) {
            addCriterion("riskName <=", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameLike(String value) {
            addCriterion("riskName like", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameNotLike(String value) {
            addCriterion("riskName not like", value, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameIn(List<String> values) {
            addCriterion("riskName in", values, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameNotIn(List<String> values) {
            addCriterion("riskName not in", values, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameBetween(String value1, String value2) {
            addCriterion("riskName between", value1, value2, "riskname");
            return (Criteria) this;
        }

        public Criteria andRisknameNotBetween(String value1, String value2) {
            addCriterion("riskName not between", value1, value2, "riskname");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIsNull() {
            addCriterion("riskCode is null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIsNotNull() {
            addCriterion("riskCode is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeEqualTo(String value) {
            addCriterion("riskCode =", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotEqualTo(String value) {
            addCriterion("riskCode <>", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThan(String value) {
            addCriterion("riskCode >", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("riskCode >=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThan(String value) {
            addCriterion("riskCode <", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThanOrEqualTo(String value) {
            addCriterion("riskCode <=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLike(String value) {
            addCriterion("riskCode like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotLike(String value) {
            addCriterion("riskCode not like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIn(List<String> values) {
            addCriterion("riskCode in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotIn(List<String> values) {
            addCriterion("riskCode not in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeBetween(String value1, String value2) {
            addCriterion("riskCode between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotBetween(String value1, String value2) {
            addCriterion("riskCode not between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskvalueIsNull() {
            addCriterion("riskValue is null");
            return (Criteria) this;
        }

        public Criteria andRiskvalueIsNotNull() {
            addCriterion("riskValue is not null");
            return (Criteria) this;
        }

        public Criteria andRiskvalueEqualTo(String value) {
            addCriterion("riskValue =", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueNotEqualTo(String value) {
            addCriterion("riskValue <>", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueGreaterThan(String value) {
            addCriterion("riskValue >", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueGreaterThanOrEqualTo(String value) {
            addCriterion("riskValue >=", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueLessThan(String value) {
            addCriterion("riskValue <", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueLessThanOrEqualTo(String value) {
            addCriterion("riskValue <=", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueLike(String value) {
            addCriterion("riskValue like", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueNotLike(String value) {
            addCriterion("riskValue not like", value, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueIn(List<String> values) {
            addCriterion("riskValue in", values, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueNotIn(List<String> values) {
            addCriterion("riskValue not in", values, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueBetween(String value1, String value2) {
            addCriterion("riskValue between", value1, value2, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskvalueNotBetween(String value1, String value2) {
            addCriterion("riskValue not between", value1, value2, "riskvalue");
            return (Criteria) this;
        }

        public Criteria andRiskanswerIsNull() {
            addCriterion("riskAnswer is null");
            return (Criteria) this;
        }

        public Criteria andRiskanswerIsNotNull() {
            addCriterion("riskAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andRiskanswerEqualTo(String value) {
            addCriterion("riskAnswer =", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerNotEqualTo(String value) {
            addCriterion("riskAnswer <>", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerGreaterThan(String value) {
            addCriterion("riskAnswer >", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerGreaterThanOrEqualTo(String value) {
            addCriterion("riskAnswer >=", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerLessThan(String value) {
            addCriterion("riskAnswer <", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerLessThanOrEqualTo(String value) {
            addCriterion("riskAnswer <=", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerLike(String value) {
            addCriterion("riskAnswer like", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerNotLike(String value) {
            addCriterion("riskAnswer not like", value, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerIn(List<String> values) {
            addCriterion("riskAnswer in", values, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerNotIn(List<String> values) {
            addCriterion("riskAnswer not in", values, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerBetween(String value1, String value2) {
            addCriterion("riskAnswer between", value1, value2, "riskanswer");
            return (Criteria) this;
        }

        public Criteria andRiskanswerNotBetween(String value1, String value2) {
            addCriterion("riskAnswer not between", value1, value2, "riskanswer");
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