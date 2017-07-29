package com.zking.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
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

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Integer value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Integer value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Integer value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Integer value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Integer value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Integer> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Integer> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Integer value1, Integer value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andDeleFlagIsNull() {
            addCriterion("dele_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleFlagIsNotNull() {
            addCriterion("dele_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleFlagEqualTo(Integer value) {
            addCriterion("dele_flag =", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagNotEqualTo(Integer value) {
            addCriterion("dele_flag <>", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagGreaterThan(Integer value) {
            addCriterion("dele_flag >", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("dele_flag >=", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagLessThan(Integer value) {
            addCriterion("dele_flag <", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagLessThanOrEqualTo(Integer value) {
            addCriterion("dele_flag <=", value, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagIn(List<Integer> values) {
            addCriterion("dele_flag in", values, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagNotIn(List<Integer> values) {
            addCriterion("dele_flag not in", values, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagBetween(Integer value1, Integer value2) {
            addCriterion("dele_flag between", value1, value2, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andDeleFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("dele_flag not between", value1, value2, "deleFlag");
            return (Criteria) this;
        }

        public Criteria andPerMsIsNull() {
            addCriterion("per_ms is null");
            return (Criteria) this;
        }

        public Criteria andPerMsIsNotNull() {
            addCriterion("per_ms is not null");
            return (Criteria) this;
        }

        public Criteria andPerMsEqualTo(String value) {
            addCriterion("per_ms =", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsNotEqualTo(String value) {
            addCriterion("per_ms <>", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsGreaterThan(String value) {
            addCriterion("per_ms >", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsGreaterThanOrEqualTo(String value) {
            addCriterion("per_ms >=", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsLessThan(String value) {
            addCriterion("per_ms <", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsLessThanOrEqualTo(String value) {
            addCriterion("per_ms <=", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsLike(String value) {
            addCriterion("per_ms like", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsNotLike(String value) {
            addCriterion("per_ms not like", value, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsIn(List<String> values) {
            addCriterion("per_ms in", values, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsNotIn(List<String> values) {
            addCriterion("per_ms not in", values, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsBetween(String value1, String value2) {
            addCriterion("per_ms between", value1, value2, "perMs");
            return (Criteria) this;
        }

        public Criteria andPerMsNotBetween(String value1, String value2) {
            addCriterion("per_ms not between", value1, value2, "perMs");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_permission
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 29 13:52:51 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_permission
     *
     * @mbg.generated Sat Jul 29 13:52:51 CST 2017
     */
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