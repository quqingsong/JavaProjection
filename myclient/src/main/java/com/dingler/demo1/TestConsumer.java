package com.dingler.demo1;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/12/3
 * @Content:
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestConsumer{

    private static final Logger LOGGER = LoggerFactory.getLogger(TestConsumer.class);

    public static void main(String[] args){
        Consumer comsumer = new Consumer();
        comsumer.init();
        TestConsumer testConsumer = new TestConsumer();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
    }

    private class ConsumerMq implements Runnable{

        Consumer consumer;

        public ConsumerMq(Consumer consumer){
            this.consumer = consumer;
        }

        public void run(){
            while (true){
                try{
                    consumer.getMessage("Jaycekon-MQ");
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    LOGGER.error("", e);
                }
            }
        }
    }
}