package com.dingler.MyProducer;
/*
 * @author  qingsong
 * @date  2020/10/5 21:55
 * @Email:1021237024@qq.com
 */


class Clerk {

    private int producrCount=0;

    public synchronized void produceProduct(){
        if (producrCount<20){
            producrCount++;
            System.out.println(Thread.currentThread().getName()+"开始生产第 "+producrCount+"产品");
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized void consumerProduct(){
        if (producrCount>0){
            System.out.println(Thread.currentThread().getName()+"开始消费第 "+producrCount+"产品");
            producrCount--;
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

//生产者
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName()+"开始生产。。。");

        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

//消费者
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() { 
        System.out.println(getName()+"开始消费。。。");
        while (true){
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumerProduct();
        }
    }
}


public class ProduceTest{

    public static void main(String[] args) {
        Clerk clerk=new Clerk();

        Producer producer=new Producer(clerk);
        producer.setName("生产者1");
        producer.start();

        Consumer consumer=new Consumer(clerk);
        consumer.setName("消费者1");
        consumer.start();
    }
}


