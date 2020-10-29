package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:产品类
 */

public class Bike {

    private String frame;
    private String seat;
    private String tire;

    public String getFrame() {
        return frame;
    }
    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String getTire() {
        return tire;
    }
    public void setTire(String tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                ", tire='" + tire + '\'' +
                '}';
    }
}