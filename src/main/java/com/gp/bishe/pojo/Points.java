package com.gp.bishe.pojo;

import java.io.Serializable;

public class Points implements Serializable {
    private int pid;
    private String ppic;
    private double pprice;
    private String creater;
    private String pdate;

    public Points(){

    }
    @Override
    public String toString() {
        return "Points{" +
                "pid=" + pid +
                ", ppic='" + ppic + '\'' +
                ", pprice=" + pprice +
                ", creater='" + creater + '\'' +
                ", pdate='" + pdate + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }
}
