package com.java;

public class ThreadImplWithLambda {
    /*
    * First Thread with lambda
    * Runnable is functional interface with one abstract method so can be implemented with Lambda
    * */

    public void startThread(){

        Runnable thread1 = () -> {
            for (int i =0; i <10;i++){
                System.out.println("Value of i is : "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread2 = ()->{
            for(int j =0;j<=10;j++){
                System.out.println( "Value of j is: "+ j*2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("T1");
        t.start();

        Thread t2 = new Thread(thread2);
        t2.setName("T2");
        t2.start();
    };

}
