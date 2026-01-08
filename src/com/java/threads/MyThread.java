package com.java.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+" is executing the thread.");
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
