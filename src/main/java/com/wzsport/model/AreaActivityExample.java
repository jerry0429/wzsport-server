package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaActivityExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public AreaActivityExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdIsNull() {
			addCriterion("area_sport_id is null");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdIsNotNull() {
			addCriterion("area_sport_id is not null");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdEqualTo(Long value) {
			addCriterion("area_sport_id =", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdNotEqualTo(Long value) {
			addCriterion("area_sport_id <>", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdGreaterThan(Long value) {
			addCriterion("area_sport_id >", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdGreaterThanOrEqualTo(Long value) {
			addCriterion("area_sport_id >=", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdLessThan(Long value) {
			addCriterion("area_sport_id <", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdLessThanOrEqualTo(Long value) {
			addCriterion("area_sport_id <=", value, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdIn(List<Long> values) {
			addCriterion("area_sport_id in", values, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdNotIn(List<Long> values) {
			addCriterion("area_sport_id not in", values, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdBetween(Long value1, Long value2) {
			addCriterion("area_sport_id between", value1, value2, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andAreaSportIdNotBetween(Long value1, Long value2) {
			addCriterion("area_sport_id not between", value1, value2, "areaSportId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudentIdIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudentIdEqualTo(Long value) {
			addCriterion("student_id =", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotEqualTo(Long value) {
			addCriterion("student_id <>", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThan(Long value) {
			addCriterion("student_id >", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("student_id >=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThan(Long value) {
			addCriterion("student_id <", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdLessThanOrEqualTo(Long value) {
			addCriterion("student_id <=", value, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdIn(List<Long> values) {
			addCriterion("student_id in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotIn(List<Long> values) {
			addCriterion("student_id not in", values, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdBetween(Long value1, Long value2) {
			addCriterion("student_id between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andStudentIdNotBetween(Long value1, Long value2) {
			addCriterion("student_id not between", value1, value2, "studentId");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNull() {
			addCriterion("cost_time is null");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNotNull() {
			addCriterion("cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andCostTimeEqualTo(Integer value) {
			addCriterion("cost_time =", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotEqualTo(Integer value) {
			addCriterion("cost_time <>", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThan(Integer value) {
			addCriterion("cost_time >", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cost_time >=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThan(Integer value) {
			addCriterion("cost_time <", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThanOrEqualTo(Integer value) {
			addCriterion("cost_time <=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeIn(List<Integer> values) {
			addCriterion("cost_time in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotIn(List<Integer> values) {
			addCriterion("cost_time not in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeBetween(Integer value1, Integer value2) {
			addCriterion("cost_time between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("cost_time not between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedIsNull() {
			addCriterion("kcal_consumed is null");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedIsNotNull() {
			addCriterion("kcal_consumed is not null");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedEqualTo(Integer value) {
			addCriterion("kcal_consumed =", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotEqualTo(Integer value) {
			addCriterion("kcal_consumed <>", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedGreaterThan(Integer value) {
			addCriterion("kcal_consumed >", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedGreaterThanOrEqualTo(Integer value) {
			addCriterion("kcal_consumed >=", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedLessThan(Integer value) {
			addCriterion("kcal_consumed <", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedLessThanOrEqualTo(Integer value) {
			addCriterion("kcal_consumed <=", value, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedIn(List<Integer> values) {
			addCriterion("kcal_consumed in", values, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotIn(List<Integer> values) {
			addCriterion("kcal_consumed not in", values, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedBetween(Integer value1, Integer value2) {
			addCriterion("kcal_consumed between", value1, value2, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andKcalConsumedNotBetween(Integer value1, Integer value2) {
			addCriterion("kcal_consumed not between", value1, value2, "kcalConsumed");
			return (Criteria) this;
		}

		public Criteria andQualifiedIsNull() {
			addCriterion("qualified is null");
			return (Criteria) this;
		}

		public Criteria andQualifiedIsNotNull() {
			addCriterion("qualified is not null");
			return (Criteria) this;
		}

		public Criteria andQualifiedEqualTo(Boolean value) {
			addCriterion("qualified =", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotEqualTo(Boolean value) {
			addCriterion("qualified <>", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedGreaterThan(Boolean value) {
			addCriterion("qualified >", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("qualified >=", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedLessThan(Boolean value) {
			addCriterion("qualified <", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedLessThanOrEqualTo(Boolean value) {
			addCriterion("qualified <=", value, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedIn(List<Boolean> values) {
			addCriterion("qualified in", values, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotIn(List<Boolean> values) {
			addCriterion("qualified not in", values, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedBetween(Boolean value1, Boolean value2) {
			addCriterion("qualified between", value1, value2, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("qualified not between", value1, value2, "qualified");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIsNull() {
			addCriterion("qualified_cost_time is null");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIsNotNull() {
			addCriterion("qualified_cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeEqualTo(Integer value) {
			addCriterion("qualified_cost_time =", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotEqualTo(Integer value) {
			addCriterion("qualified_cost_time <>", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeGreaterThan(Integer value) {
			addCriterion("qualified_cost_time >", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("qualified_cost_time >=", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeLessThan(Integer value) {
			addCriterion("qualified_cost_time <", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeLessThanOrEqualTo(Integer value) {
			addCriterion("qualified_cost_time <=", value, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeIn(List<Integer> values) {
			addCriterion("qualified_cost_time in", values, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotIn(List<Integer> values) {
			addCriterion("qualified_cost_time not in", values, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeBetween(Integer value1, Integer value2) {
			addCriterion("qualified_cost_time between", value1, value2, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andQualifiedCostTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("qualified_cost_time not between", value1, value2, "qualifiedCostTime");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtIsNull() {
			addCriterion("ended_at is null");
			return (Criteria) this;
		}

		public Criteria andEndedAtIsNotNull() {
			addCriterion("ended_at is not null");
			return (Criteria) this;
		}

		public Criteria andEndedAtEqualTo(Date value) {
			addCriterion("ended_at =", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtNotEqualTo(Date value) {
			addCriterion("ended_at <>", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtGreaterThan(Date value) {
			addCriterion("ended_at >", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("ended_at >=", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtLessThan(Date value) {
			addCriterion("ended_at <", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtLessThanOrEqualTo(Date value) {
			addCriterion("ended_at <=", value, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtIn(List<Date> values) {
			addCriterion("ended_at in", values, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtNotIn(List<Date> values) {
			addCriterion("ended_at not in", values, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtBetween(Date value1, Date value2) {
			addCriterion("ended_at between", value1, value2, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedAtNotBetween(Date value1, Date value2) {
			addCriterion("ended_at not between", value1, value2, "endedAt");
			return (Criteria) this;
		}

		public Criteria andEndedByIsNull() {
			addCriterion("ended_by is null");
			return (Criteria) this;
		}

		public Criteria andEndedByIsNotNull() {
			addCriterion("ended_by is not null");
			return (Criteria) this;
		}

		public Criteria andEndedByEqualTo(Boolean value) {
			addCriterion("ended_by =", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByNotEqualTo(Boolean value) {
			addCriterion("ended_by <>", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByGreaterThan(Boolean value) {
			addCriterion("ended_by >", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ended_by >=", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByLessThan(Boolean value) {
			addCriterion("ended_by <", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByLessThanOrEqualTo(Boolean value) {
			addCriterion("ended_by <=", value, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByIn(List<Boolean> values) {
			addCriterion("ended_by in", values, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByNotIn(List<Boolean> values) {
			addCriterion("ended_by not in", values, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByBetween(Boolean value1, Boolean value2) {
			addCriterion("ended_by between", value1, value2, "endedBy");
			return (Criteria) this;
		}

		public Criteria andEndedByNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ended_by not between", value1, value2, "endedBy");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wzsport_area_activity
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 28 11:12:50 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}