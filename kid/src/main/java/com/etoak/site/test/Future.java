package com.etoak.site.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yy on 2017/6/9.
 * Smile Waits For You
 */
public class Future {
    public static void main(String[] args)throws Exception{
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        java.util.concurrent.Future future = threadPool.submit(new Callable<Integer>() {
            public Integer call()throws Exception{
                return new Random().nextInt(100);
            }
        });

        Thread.sleep(1000);
        System.out.println(future.get());
    }
}
