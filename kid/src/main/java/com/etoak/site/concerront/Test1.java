package com.etoak.site.concerront;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinyong on 2017/4/28.
 * 线程协助-生产者/消费者------鸡蛋先放后取
 */
public class Test1 {
    List<Object> eggs = new ArrayList<>();

    public synchronized Object getEgg(){
        while (eggs.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object egg = eggs.get(0);
        eggs.clear();
        System.out.println("拿到鸡蛋");
        notify();
        return egg;
    }

    public synchronized void putEgg(Object egg){
        while (eggs.size() != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        eggs.add(egg);
        System.out.println("放入鸡蛋");
        notify();
    }
    static class AddThread implements Runnable{
        private Test1 test;
        private Object egg = new Object();
        public AddThread (Test1 test){
            this.test = test;
        }
        public void run(){
            test.putEgg(egg);
        }
    }

    static class GetThread implements Runnable{
        private Test1 test;
        public GetThread(Test1 test){
            this.test = test;
        }
        public void run(){
            test.getEgg();
        }
    }

    public static void main(String[] args){
        Test1 test = new Test1();
        for (int i = 0; i < 10; i++){
            new Thread(new AddThread(test)).start();
            new Thread(new GetThread(test)).start();
        }
    }
}
