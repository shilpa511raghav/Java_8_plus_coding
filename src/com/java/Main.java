package com.java;

import com.java.StreamsExamples.MasterStreamAPI;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("program starts");

        //Before java 8 , 2 ways to use interface
        //After Java 8 ,included using lambda also so three now.

        /*
        Create a separate impl class to implement/use interface
        */
        //MyFuncInterface myinterface = new MyFuncInterfaceImpl();
        MyFuncInterfaceImpl myinterface = new MyFuncInterfaceImpl();
        myinterface.sayHello();

        /*
        Using anonymous class to use interface
        No need of extra class just use anonymous class by using interface directly and add body there
        */
        MyFuncInterface i = new MyFuncInterface() {
            @Override
            public void sayHello() {
                System.out.println("This is my first anonymous class to use interface");
            }
        };
        i.sayHello();

        MyFuncInterface i2 = new MyFuncInterface() {

            @Override
            public void sayHello() {
                System.out.println("This is my second annonymous class to use interface");
            }
        };
        i2.sayHello();


        /*
         * Using our java 8 lambda feature to implement Functional interface since it has only one line as output so we can remove brackets also and can do implementation in single line
         * */
        MyFuncInterface lmbda = () -> System.out.println("This interface implemented using java 8 lambda feature");
        lmbda.sayHello();

        /*
         * Using lambda for SumFuncInterfaceWithDefaultAndAbstractMethod
         * */
        SumFuncInterfaceWithDefaultAndAbstractMethod sumIntr = (a, b) -> a + b;
        sumIntr.logOperation(" Sum Operation Started");
        System.out.println(sumIntr.sum(2, 5));
        System.out.println(sumIntr.sum(10, 20));
        sumIntr.logOperation("Operation Completed successfully");

        /*
         * ThreadImplWith Lambda
         */
        ThreadImplWithLambda myThread = new ThreadImplWithLambda();
        myThread.startThread();

        /*Stream*/
        MasterStreamAPI.printEvenNumberFromList();
    }
}

