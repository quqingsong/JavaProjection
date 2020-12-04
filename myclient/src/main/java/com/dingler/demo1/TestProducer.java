package com.dingler.demo1;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/3
 * @Content:
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestProducer{

    private static final Logger LOGGER = LoggerFactory.getLogger(TestProducer.class);

    public static void main(String[] args){
        Producer producer = new Producer();
        producer.init();
        TestProducer testMq = new TestProducer();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            LOGGER.error("", e);
        }
        //Thread 1
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 2
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 3
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 4
        new Thread(testMq.new ProductorMq(producer)).start();
        //Thread 5
        new Thread(testMq.new ProductorMq(producer)).start();
    }

    private class ProductorMq implements Runnable{

        Producer producter;

        public ProductorMq(Producer producter){
            this.producter = producter;
        }

        public void run(){
            while (true){
                try{
                    producter.sendMessage("Jaycekon-MQ");
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    LOGGER.error("{}", e);
                }
            }
        }
    }
}