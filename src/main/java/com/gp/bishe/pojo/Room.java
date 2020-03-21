package com.gp.bishe.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


public class Room implements Serializable {
    private int roomid;
    private String roompic;
    private double roomsize;
    private String roomthings;
    private String roomtype;
    private String roomdate;
    private double ordprice;
    private double vipprice;
    private double deposit;
    private String creater;
    private String toward;//朝向
    private String storey;//楼层
    private String amenities;//便利设施
    private String media;//媒体设施
    private String food;

    @Override
    public String toString() {
        return "Room{" +
                "roomid=" + roomid +
                ", roompic='" + roompic + '\'' +
                ", roomsize=" + roomsize +
                ", roomthings='" + roomthings + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", roomdate='" + roomdate + '\'' +
                ", ordprice=" + ordprice +
                ", vipprice=" + vipprice +
                ", deposit=" + deposit +
                ", creater='" + creater + '\'' +
                ", toward='" + toward + '\'' +
                ", storey='" + storey + '\'' +
                ", amenities='" + amenities + '\'' +
                ", media='" + media + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward;
    }

    public String getStorey() {
        return storey;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public double getOrdprice() {
        return ordprice;
    }

    public void setOrdprice(double ordprice) {
        this.ordprice = ordprice;
    }

    public double getVipprice() {
        return vipprice;
    }

    public void setVipprice(double vipprice) {
        this.vipprice = vipprice;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }


    public String getRoomdate() {
        return roomdate;
    }

    public void setRoomdate(String roomdate) {
        this.roomdate = roomdate;
    }

    public Room(){

    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoompic() {
        return roompic;
    }

    public void setRoompic(String roompic) {
        this.roompic = roompic;
    }

    public double getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(double roomsize) {
        this.roomsize = roomsize;
    }

    public String getRoomthings() {
        return roomthings;
    }

    public void setRoomthings(String roomthings) {
        this.roomthings = roomthings;
    }
}
