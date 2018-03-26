package org.seckill.service;


import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillResult;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatSeckillException;
import org.seckill.exception.SeckillClosedException;
import org.seckill.exception.SeckillException;

import java.util.List;

public interface ISeckillService {

    /**
     * 获取所有秒杀详情
     *
     * @return
     */
    List<Seckill> seckillList();

    /**
     * 获取单个秒杀详情
     *
     * @param seckillId
     * @return
     */
    Seckill getSeckill(long seckillId);

    /**
     * 秒杀开启则输出秒杀地址,
     * 否则输出当前系统时间
     *
     * @return
     */
    Exposer exportSeckillUrl();

    /**
     * 执行秒杀
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     * @throws SeckillException
     * @throws RepeatSeckillException
     * @throws SeckillClosedException
     */
    SeckillResult executeSeckill(long seckillId, long userPhone, String md5) throws RepeatSeckillException, SeckillClosedException, SeckillException;
}
