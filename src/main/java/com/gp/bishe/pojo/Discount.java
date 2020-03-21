package com.gp.bishe.pojo;

import java.io.Serializable;

public class Discount implements Serializable {
    private int disid;
    private String roomtype;
    private double nordiscountweek;
    private double nordiscountmonth;
    private double nordiscountseason;
    private double nordiscounthalfyear;
    private double nordiscountyear;
    private double vipdiscountweek;
    private double vipdiscountmonth;
    private double vipdiscountseason;
    private double vipdiscounthalfyear;
    private double vipdiscountyear;
    private String creater;

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Discount(){

    }

    public int getDisid() {
        return disid;
    }

    public void setDisid(int disid) {
        this.disid = disid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "disid=" + disid +
                ", roomtype='" + roomtype + '\'' +
                ", nordiscountweek=" + nordiscountweek +
                ", nordiscountmonth=" + nordiscountmonth +
                ", nordiscountseason=" + nordiscountseason +
                ", nordiscounthalfyear=" + nordiscounthalfyear +
                ", nordiscountyear=" + nordiscountyear +
                ", vipdiscountweek=" + vipdiscountweek +
                ", vipdiscountmonth=" + vipdiscountmonth +
                ", vipdiscountseason=" + vipdiscountseason +
                ", vipdiscounthalfyear=" + vipdiscounthalfyear +
                ", vipdiscountyear=" + vipdiscountyear +
                ", creater='" + creater + '\'' +
                '}';
    }

    public double getNordiscountweek() {
        return nordiscountweek;
    }

    public void setNordiscountweek(double nordiscountweek) {
        this.nordiscountweek = nordiscountweek;
    }

    public double getNordiscountmonth() {
        return nordiscountmonth;
    }

    public void setNordiscountmonth(double nordiscountmonth) {
        this.nordiscountmonth = nordiscountmonth;
    }

    public double getNordiscountseason() {
        return nordiscountseason;
    }

    public void setNordiscountseason(double nordiscountseason) {
        this.nordiscountseason = nordiscountseason;
    }

    public double getNordiscounthalfyear() {
        return nordiscounthalfyear;
    }

    public void setNordiscounthalfyear(double nordiscounthalfyear) {
        this.nordiscounthalfyear = nordiscounthalfyear;
    }

    public double getNordiscountyear() {
        return nordiscountyear;
    }

    public void setNordiscountyear(double nordiscountyear) {
        this.nordiscountyear = nordiscountyear;
    }

    public double getVipdiscountweek() {
        return vipdiscountweek;
    }

    public void setVipdiscountweek(double vipdiscountweek) {
        this.vipdiscountweek = vipdiscountweek;
    }

    public double getVipdiscountmonth() {
        return vipdiscountmonth;
    }

    public void setVipdiscountmonth(double vipdiscountmonth) {
        this.vipdiscountmonth = vipdiscountmonth;
    }

    public double getVipdiscountseason() {
        return vipdiscountseason;
    }

    public void setVipdiscountseason(double vipdiscountseason) {
        this.vipdiscountseason = vipdiscountseason;
    }

    public double getVipdiscounthalfyear() {
        return vipdiscounthalfyear;
    }

    public void setVipdiscounthalfyear(double vipdiscounthalfyear) {
        this.vipdiscounthalfyear = vipdiscounthalfyear;
    }

    public double getVipdiscountyear() {
        return vipdiscountyear;
    }

    public void setVipdiscountyear(double vipdiscountyear) {
        this.vipdiscountyear = vipdiscountyear;
    }
}
