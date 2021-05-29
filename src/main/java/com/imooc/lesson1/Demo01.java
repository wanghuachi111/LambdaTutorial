package com.imooc.lesson1;

/**
 * @author whc
 * @Title: Demo01
 * @Package: com.imooc.test
 * @Description:
 * @date 2021/5/24 19:51
 */
public class Demo01 {

    public static void main(String[] args) {
        //1.传统模式下线程的创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Threading..." + Thread.currentThread().getId());
            }
        }).start();


        //2.jdk8新特性，lambda表达式优化线程模式
        new Thread(() -> {
            System.out.println("Lambda threading..." + Thread.currentThread().getId());
        }).start();
    }

}
