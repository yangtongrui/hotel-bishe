package com.gp.bishe.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int userid;
    private String username;
    private String realname;
    private String userpwd;
    private int vipsign;
    private String money;
    private String phone;
    private String photo;
    private String prefix;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", vipsign=" + vipsign +
                ", money='" + money + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", prefix='" + prefix + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getVipsign() {
        return vipsign;
    }

    public void setVipsign(int vipsign) {
        this.vipsign = vipsign;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
