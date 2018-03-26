package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private Byte state;

    private Date createTime;

    private long seckillId;

    private long userPhone;

    private Seckill seckill;

    public SuccessKilled(){}

    public SuccessKilled(Byte state, Date createTime, long seckillId, long userPhone, Seckill seckill) {
        this.state = state;
        this.createTime = createTime;
        this.seckillId = seckillId;
        this.userPhone = userPhone;
        this.seckill = seckill;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "state=" + state +
                ", createTime=" + createTime +
                ", seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", seckill=" + seckill +
                '}';
    }
}
