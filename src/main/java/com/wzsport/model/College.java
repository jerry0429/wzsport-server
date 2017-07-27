package com.wzsport.model;

import java.util.Date;

public class College {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.university_id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	private Long universityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.name
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.created_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_college.updated_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.id
	 * @return  the value of wzsport_college.id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.id
	 * @param id  the value for wzsport_college.id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.university_id
	 * @return  the value of wzsport_college.university_id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Long getUniversityId() {
		return universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.university_id
	 * @param universityId  the value for wzsport_college.university_id
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.name
	 * @return  the value of wzsport_college.name
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.name
	 * @param name  the value for wzsport_college.name
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.created_at
	 * @return  the value of wzsport_college.created_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.created_at
	 * @param createdAt  the value for wzsport_college.created_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_college.updated_at
	 * @return  the value of wzsport_college.updated_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_college.updated_at
	 * @param updatedAt  the value for wzsport_college.updated_at
	 * @mbg.generated  Thu Jul 27 09:37:30 CST 2017
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}