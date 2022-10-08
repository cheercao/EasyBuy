package cn.easybuy.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtils {
    static JedisPool pool;

    public static Jedis getRedis() {
        return pool.getResource();
    }
}
