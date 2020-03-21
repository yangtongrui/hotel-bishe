package com.gp.bishe.pojo;

import java.io.Serializable;

public class ManagerAddress implements Serializable {
    private int id;
    private String managername;
    private int managerid;
    private String province;
    private String city;
    private String district;
    public ManagerAddress(){}

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    @Override
    public String toString() {
        return "ManagerAddress{" +
                "id=" + id +
                ", managername='" + managername + '\'' +
                ", managerid=" + managerid +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
