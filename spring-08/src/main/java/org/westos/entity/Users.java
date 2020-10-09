package org.westos.entity;

import java.io.Serializable;

/**
 * users
 * @author 
 */
public class Users implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private String phone;

    private String mail;

    private Integer userstateid;

    private Integer isonline;

    private String loginid;

    private String loginpwd;

    private Integer userroleid;

    private Integer gender;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getUserstateid() {
        return userstateid;
    }

    public void setUserstateid(Integer userstateid) {
        this.userstateid = userstateid;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", userstateid=" + userstateid +
                ", isonline=" + isonline +
                ", loginid='" + loginid + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", userroleid=" + userroleid +
                ", gender=" + gender +
                '}';
    }
}