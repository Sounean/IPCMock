package com.example.ipc;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : Sounean
 * @Time : On 2022-08-30 7:20
 * @Description : ServiceManager
 * @Warn :
 */
public class ServiceManager {
    private static final ServiceManager outInstance = new ServiceManager();
    public static ServiceManager getDefault(){
        return outInstance;
    }

    CacheCenter cacheCenter = CacheCenter.getInstance();





    // 服务注册函数
    public void add(String key,Class<?> clazz){
        cacheCenter.register(key,clazz);
    }
}
