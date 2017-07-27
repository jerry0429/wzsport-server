package com.wzsport.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AndroidVersionInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public AndroidVersionInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
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

		public Criteria andVersionIsNull() {
			addCriterion("version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(String value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(String value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(String value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(String value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(String value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(String value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLike(String value) {
			addCriterion("version like", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotLike(String value) {
			addCriterion("version not like", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<String> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<String> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(String value1, String value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(String value1, String value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionCodeIsNull() {
			addCriterion("version_code is null");
			return (Criteria) this;
		}

		public Criteria andVersionCodeIsNotNull() {
			addCriterion("version_code is not null");
			return (Criteria) this;
		}

		public Criteria andVersionCodeEqualTo(Integer value) {
			addCriterion("version_code =", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeNotEqualTo(Integer value) {
			addCriterion("version_code <>", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeGreaterThan(Integer value) {
			addCriterion("version_code >", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeGreaterThanOrEqualTo(Integer value) {
			addCriterion("version_code >=", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeLessThan(Integer value) {
			addCriterion("version_code <", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeLessThanOrEqualTo(Integer value) {
			addCriterion("version_code <=", value, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeIn(List<Integer> values) {
			addCriterion("version_code in", values, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeNotIn(List<Integer> values) {
			addCriterion("version_code not in", values, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeBetween(Integer value1, Integer value2) {
			addCriterion("version_code between", value1, value2, "versionCode");
			return (Criteria) this;
		}

		public Criteria andVersionCodeNotBetween(Integer value1, Integer value2) {
			addCriterion("version_code not between", value1, value2, "versionCode");
			return (Criteria) this;
		}

		public Criteria andChangelogIsNull() {
			addCriterion("changelog is null");
			return (Criteria) this;
		}

		public Criteria andChangelogIsNotNull() {
			addCriterion("changelog is not null");
			return (Criteria) this;
		}

		public Criteria andChangelogEqualTo(String value) {
			addCriterion("changelog =", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogNotEqualTo(String value) {
			addCriterion("changelog <>", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogGreaterThan(String value) {
			addCriterion("changelog >", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogGreaterThanOrEqualTo(String value) {
			addCriterion("changelog >=", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogLessThan(String value) {
			addCriterion("changelog <", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogLessThanOrEqualTo(String value) {
			addCriterion("changelog <=", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogLike(String value) {
			addCriterion("changelog like", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogNotLike(String value) {
			addCriterion("changelog not like", value, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogIn(List<String> values) {
			addCriterion("changelog in", values, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogNotIn(List<String> values) {
			addCriterion("changelog not in", values, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogBetween(String value1, String value2) {
			addCriterion("changelog between", value1, value2, "changelog");
			return (Criteria) this;
		}

		public Criteria andChangelogNotBetween(String value1, String value2) {
			addCriterion("changelog not between", value1, value2, "changelog");
			return (Criteria) this;
		}

		public Criteria andForcedIsNull() {
			addCriterion("forced is null");
			return (Criteria) this;
		}

		public Criteria andForcedIsNotNull() {
			addCriterion("forced is not null");
			return (Criteria) this;
		}

		public Criteria andForcedEqualTo(Boolean value) {
			addCriterion("forced =", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedNotEqualTo(Boolean value) {
			addCriterion("forced <>", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedGreaterThan(Boolean value) {
			addCriterion("forced >", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("forced >=", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedLessThan(Boolean value) {
			addCriterion("forced <", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedLessThanOrEqualTo(Boolean value) {
			addCriterion("forced <=", value, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedIn(List<Boolean> values) {
			addCriterion("forced in", values, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedNotIn(List<Boolean> values) {
			addCriterion("forced not in", values, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedBetween(Boolean value1, Boolean value2) {
			addCriterion("forced between", value1, value2, "forced");
			return (Criteria) this;
		}

		public Criteria andForcedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("forced not between", value1, value2, "forced");
			return (Criteria) this;
		}

		public Criteria andApkUrlIsNull() {
			addCriterion("apk_url is null");
			return (Criteria) this;
		}

		public Criteria andApkUrlIsNotNull() {
			addCriterion("apk_url is not null");
			return (Criteria) this;
		}

		public Criteria andApkUrlEqualTo(String value) {
			addCriterion("apk_url =", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlNotEqualTo(String value) {
			addCriterion("apk_url <>", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlGreaterThan(String value) {
			addCriterion("apk_url >", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlGreaterThanOrEqualTo(String value) {
			addCriterion("apk_url >=", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlLessThan(String value) {
			addCriterion("apk_url <", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlLessThanOrEqualTo(String value) {
			addCriterion("apk_url <=", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlLike(String value) {
			addCriterion("apk_url like", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlNotLike(String value) {
			addCriterion("apk_url not like", value, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlIn(List<String> values) {
			addCriterion("apk_url in", values, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlNotIn(List<String> values) {
			addCriterion("apk_url not in", values, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlBetween(String value1, String value2) {
			addCriterion("apk_url between", value1, value2, "apkUrl");
			return (Criteria) this;
		}

		public Criteria andApkUrlNotBetween(String value1, String value2) {
			addCriterion("apk_url not between", value1, value2, "apkUrl");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
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
     * This class corresponds to the database table wzsport_android_version_info
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 05 17:31:06 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}