package com.example.ipc;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : Sounean
 * @Time : On 2022-08-30 7:33
 * @Description : 缓存中心 (存放serviceManager中的三张表)
 * 1.单例模式
 * @Warn :
 */
public class CacheCenter {
    private static final CacheCenter ourInstance =new CacheCenter();
    public static CacheCenter getInstance(){
        return ourInstance;
    }

    private final ConcurrentHashMap<String , Class<?>> mClassMap;   // 类表
    private final ConcurrentHashMap<String , Object> mInstanceObjectMap;   // 对象表
    private final ConcurrentHashMap<String , ConcurrentHashMap<String, Method>> mAllMethodMap;   // 方法表
    private CacheCenter(){
        mClassMap = new ConcurrentHashMap<String , Class<?>> ();
        mInstanceObjectMap = new ConcurrentHashMap<String , Object> ();
        mAllMethodMap = new ConcurrentHashMap<String , ConcurrentHashMap<String, Method>>();
    }

    /*
    * 1.注册到缓存中心
    * */
    public void register(String key,Class<?> clazz){
        registerClass(key,clazz);
        registerMethod()
    }

    private void registerClass(String key, Class<?> clazz) {
        mClassMap.put(key,clazz);
    }
}
