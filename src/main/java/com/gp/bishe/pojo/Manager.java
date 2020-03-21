package com.gp.bishe.pojo;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Manager implements Serializable{
    private int managerid;
    private String managername;
    private String managerpwd;
    private int managersign;
    private String managerdate;
    private String phone;
    private String birthday;
    private String email;
    private String[] address;
    private String prefix;
    private String sex;
    private int age;
    private String job;
    private String jobdate;

    public String getJobdate() {
        return jobdate;
    }

    public void setJobdate(String jobdate) {
        this.jobdate = jobdate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    private String creater;

    public String getManagerdate() {
        return managerdate;
    }

    public void setManagerdate(String managerdate) {
        this.managerdate = managerdate;
    }

    public String getPhone() {
        return phone;

    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Manager(){

    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerid=" + managerid +
                ", managername='" + managername + '\'' +
                ", managerpwd='" + managerpwd + '\'' +
                ", managersign=" + managersign +
                ", managerdate='" + managerdate + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", address=" + Arrays.toString(address) +
                ", prefix='" + prefix + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", jobdate='" + jobdate + '\'' +
                ", creater='" + creater + '\'' +
                '}';
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManagerpwd() {
        return managerpwd;
    }

    public void setManagerpwd(String managerpwd) {
        this.managerpwd = managerpwd;
    }

    public int getManagersign() {
        return managersign;
    }

    public void setManagersign(int managersign) {
        this.managersign = managersign;
    }
}
