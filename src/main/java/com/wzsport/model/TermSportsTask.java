package com.wzsport.model;

import java.util.Date;

public class TermSportsTask {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term_sports_task.id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term_sports_task.term_id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    private Long termId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term_sports_task.target_sports_times
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    private Integer targetSportsTimes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term_sports_task.created_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_term_sports_task.updated_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term_sports_task.id
     * @return  the value of wzsport_term_sports_task.id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term_sports_task.id
     * @param id  the value for wzsport_term_sports_task.id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term_sports_task.term_id
     * @return  the value of wzsport_term_sports_task.term_id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term_sports_task.term_id
     * @param termId  the value for wzsport_term_sports_task.term_id
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term_sports_task.target_sports_times
     * @return  the value of wzsport_term_sports_task.target_sports_times
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public Integer getTargetSportsTimes() {
        return targetSportsTimes;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term_sports_task.target_sports_times
     * @param targetSportsTimes  the value for wzsport_term_sports_task.target_sports_times
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public void setTargetSportsTimes(Integer targetSportsTimes) {
        this.targetSportsTimes = targetSportsTimes;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term_sports_task.created_at
     * @return  the value of wzsport_term_sports_task.created_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term_sports_task.created_at
     * @param createdAt  the value for wzsport_term_sports_task.created_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_term_sports_task.updated_at
     * @return  the value of wzsport_term_sports_task.updated_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_term_sports_task.updated_at
     * @param updatedAt  the value for wzsport_term_sports_task.updated_at
     * @mbg.generated  Tue Oct 03 11:56:52 CST 2017
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}