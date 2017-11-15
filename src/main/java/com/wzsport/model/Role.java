package com.wzsport.model;

import java.util.Date;

public class Role {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.id
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.name
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.priv_ids
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    private String privIds;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.created_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column wzsport_role.updated_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.id
     * @return  the value of wzsport_role.id
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.id
     * @param id  the value for wzsport_role.id
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.name
     * @return  the value of wzsport_role.name
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.name
     * @param name  the value for wzsport_role.name
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.priv_ids
     * @return  the value of wzsport_role.priv_ids
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public String getPrivIds() {
        return privIds;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.priv_ids
     * @param privIds  the value for wzsport_role.priv_ids
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public void setPrivIds(String privIds) {
        this.privIds = privIds;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.created_at
     * @return  the value of wzsport_role.created_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.created_at
     * @param createdAt  the value for wzsport_role.created_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column wzsport_role.updated_at
     * @return  the value of wzsport_role.updated_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column wzsport_role.updated_at
     * @param updatedAt  the value for wzsport_role.updated_at
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}