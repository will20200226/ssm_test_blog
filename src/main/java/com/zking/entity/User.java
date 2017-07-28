package com.zking.entity;


public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_cname
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String userCname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_desc
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private String userDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.image
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.role_id
     *
     * @return the value of t_user.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.role_id
     *
     * @param roleId the value for t_user.role_id
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_cname
     *
     * @return the value of t_user.user_cname
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getUserCname() {
        return userCname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_cname
     *
     * @param userCname the value for t_user.user_cname
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setUserCname(String userCname) {
        this.userCname = userCname == null ? null : userCname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_desc
     *
     * @return the value of t_user.user_desc
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_desc
     *
     * @param userDesc the value for t_user.user_desc
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.image
     *
     * @return the value of t_user.image
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.image
     *
     * @param image the value for t_user.image
     *
     * @mbg.generated Fri Jul 28 19:44:21 CST 2017
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}