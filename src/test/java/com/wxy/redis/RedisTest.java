package com.wxy.redis;

import com.wxy.redis.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author xcbeyond
 * 2018年7月19日下午3:08:04
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisUtils redisUtils;

    /**
     * 插入缓存数据
     */
    @Test
    public void set() {
        redisUtils.set("test", "hello redis");
    }

    /**
     * 读取缓存数据
     */
    @Test
    public void get() {
        String value = redisUtils.get("test");
        System.out.println(value);
    }

    @Test
    public void update() {
        redisUtils.update("test", "update value");
    }

    @Test
    public void delete() {
        redisUtils.delete("test");
    }
}