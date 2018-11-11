package com.ruiger.hello.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssuepointtransitiondetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssuepointtransitiondetailExample() {
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

        public Criteria andUseruuidIsNull() {
            addCriterion("userUuid is null");
            return (Criteria) this;
        }

        public Criteria andUseruuidIsNotNull() {
            addCriterion("userUuid is not null");
            return (Criteria) this;
        }

        public Criteria andUseruuidEqualTo(String value) {
            addCriterion("userUuid =", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotEqualTo(String value) {
            addCriterion("userUuid <>", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidGreaterThan(String value) {
            addCriterion("userUuid >", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidGreaterThanOrEqualTo(String value) {
            addCriterion("userUuid >=", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLessThan(String value) {
            addCriterion("userUuid <", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLessThanOrEqualTo(String value) {
            addCriterion("userUuid <=", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidLike(String value) {
            addCriterion("userUuid like", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotLike(String value) {
            addCriterion("userUuid not like", value, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidIn(List<String> values) {
            addCriterion("userUuid in", values, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotIn(List<String> values) {
            addCriterion("userUuid not in", values, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidBetween(String value1, String value2) {
            addCriterion("userUuid between", value1, value2, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUseruuidNotBetween(String value1, String value2) {
            addCriterion("userUuid not between", value1, value2, "useruuid");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumIsNull() {
            addCriterion("issuePointNum is null");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumIsNotNull() {
            addCriterion("issuePointNum is not null");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumEqualTo(String value) {
            addCriterion("issuePointNum =", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumNotEqualTo(String value) {
            addCriterion("issuePointNum <>", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumGreaterThan(String value) {
            addCriterion("issuePointNum >", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumGreaterThanOrEqualTo(String value) {
            addCriterion("issuePointNum >=", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumLessThan(String value) {
            addCriterion("issuePointNum <", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumLessThanOrEqualTo(String value) {
            addCriterion("issuePointNum <=", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumLike(String value) {
            addCriterion("issuePointNum like", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumNotLike(String value) {
            addCriterion("issuePointNum not like", value, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumIn(List<String> values) {
            addCriterion("issuePointNum in", values, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumNotIn(List<String> values) {
            addCriterion("issuePointNum not in", values, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumBetween(String value1, String value2) {
            addCriterion("issuePointNum between", value1, value2, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuepointnumNotBetween(String value1, String value2) {
            addCriterion("issuePointNum not between", value1, value2, "issuepointnum");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentIsNull() {
            addCriterion("issueDepartment is null");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentIsNotNull() {
            addCriterion("issueDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentEqualTo(String value) {
            addCriterion("issueDepartment =", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentNotEqualTo(String value) {
            addCriterion("issueDepartment <>", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentGreaterThan(String value) {
            addCriterion("issueDepartment >", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("issueDepartment >=", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentLessThan(String value) {
            addCriterion("issueDepartment <", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentLessThanOrEqualTo(String value) {
            addCriterion("issueDepartment <=", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentLike(String value) {
            addCriterion("issueDepartment like", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentNotLike(String value) {
            addCriterion("issueDepartment not like", value, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentIn(List<String> values) {
            addCriterion("issueDepartment in", values, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentNotIn(List<String> values) {
            addCriterion("issueDepartment not in", values, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentBetween(String value1, String value2) {
            addCriterion("issueDepartment between", value1, value2, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedepartmentNotBetween(String value1, String value2) {
            addCriterion("issueDepartment not between", value1, value2, "issuedepartment");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNull() {
            addCriterion("issueDate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("issueDate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(Date value) {
            addCriterion("issueDate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(Date value) {
            addCriterion("issueDate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(Date value) {
            addCriterion("issueDate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("issueDate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(Date value) {
            addCriterion("issueDate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(Date value) {
            addCriterion("issueDate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<Date> values) {
            addCriterion("issueDate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<Date> values) {
            addCriterion("issueDate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(Date value1, Date value2) {
            addCriterion("issueDate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(Date value1, Date value2) {
            addCriterion("issueDate not between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuesystemIsNull() {
            addCriterion("issueSystem is null");
            return (Criteria) this;
        }

        public Criteria andIssuesystemIsNotNull() {
            addCriterion("issueSystem is not null");
            return (Criteria) this;
        }

        public Criteria andIssuesystemEqualTo(String value) {
            addCriterion("issueSystem =", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemNotEqualTo(String value) {
            addCriterion("issueSystem <>", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemGreaterThan(String value) {
            addCriterion("issueSystem >", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemGreaterThanOrEqualTo(String value) {
            addCriterion("issueSystem >=", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemLessThan(String value) {
            addCriterion("issueSystem <", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemLessThanOrEqualTo(String value) {
            addCriterion("issueSystem <=", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemLike(String value) {
            addCriterion("issueSystem like", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemNotLike(String value) {
            addCriterion("issueSystem not like", value, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemIn(List<String> values) {
            addCriterion("issueSystem in", values, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemNotIn(List<String> values) {
            addCriterion("issueSystem not in", values, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemBetween(String value1, String value2) {
            addCriterion("issueSystem between", value1, value2, "issuesystem");
            return (Criteria) this;
        }

        public Criteria andIssuesystemNotBetween(String value1, String value2) {
            addCriterion("issueSystem not between", value1, value2, "issuesystem");
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