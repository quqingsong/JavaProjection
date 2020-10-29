package com.dingler;

import java.util.Date;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/28
 * @Content:这里是深拷贝
 */
public class Video implements Cloneable{
    //用户名
    private String message;
    //创建时间
    private Date createtime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object=super.clone();
        //实现深克隆,这里注意object与video这两个对象。被强转，这两个对象是一个对象。
        Video video=(Video) object;
        video.createtime= (Date) this.createtime.clone();
        return video;
    }

    public Video(String message, Date createtime) {
        this.message = message;
        this.createtime = createtime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "message='" + message + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}