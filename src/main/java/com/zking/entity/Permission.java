package com.zking.entity;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.per_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private Integer perId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.per_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String perName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.dele_flag
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private Integer deleFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.per_ms
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String perMs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.per_id
     *
     * @return the value of t_permission.per_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public Integer getPerId() {
        return perId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.per_id
     *
     * @param perId the value for t_permission.per_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.per_name
     *
     * @return the value of t_permission.per_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getPerName() {
        return perName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.per_name
     *
     * @param perName the value for t_permission.per_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.role_id
     *
     * @return the value of t_permission.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.role_id
     *
     * @param roleId the value for t_permission.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.dele_flag
     *
     * @return the value of t_permission.dele_flag
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public Integer getDeleFlag() {
        return deleFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.dele_flag
     *
     * @param deleFlag the value for t_permission.dele_flag
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setDeleFlag(Integer deleFlag) {
        this.deleFlag = deleFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.per_ms
     *
     * @return the value of t_permission.per_ms
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getPerMs() {
        return perMs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.per_ms
     *
     * @param perMs the value for t_permission.per_ms
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setPerMs(String perMs) {
        this.perMs = perMs == null ? null : perMs.trim();
    }
}