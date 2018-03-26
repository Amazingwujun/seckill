package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Autowired
    private SuccessKilledDao successKilledDao;


    @Test
    public void insertSuccessKilledDao() throws Exception {
        int i = successKilledDao.insertSuccessKilledDao(1000, 18578458286L);
        System.out.println(i > 0 ? "秒杀成功" : "秒杀失败");
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1000;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,18578458286L);
        System.out.println(successKilled);
    }

}