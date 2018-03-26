package org.seckill.dto;

import org.seckill.entity.SuccessKilled;

/**
 * 秒杀结果
 */
public class SeckillResult {

    /**
     * 秒杀ID
     */
    private long seckillId;

    /**
     * 秒杀执行结果
     */
    private int status;

    /**
     * 秒杀信息
     */
    private String seckillInfo;



    private SuccessKilled successKilled;

    public SeckillResult(long seckillId, int status, String seckillInfo, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.status = status;
        this.seckillInfo = seckillInfo;
        this.successKilled = successKilled;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSeckillInfo() {
        return seckillInfo;
    }

    public void setSeckillInfo(String seckillInfo) {
        this.seckillInfo = seckillInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillResult{" +
                "seckillId=" + seckillId +
                ", status=" + status +
                ", seckillInfo='" + seckillInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}
