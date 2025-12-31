package com.java.MethodReference;

public class MethodRefDemo {
    public static void main(String[] args) {
        System.out.println("Practicing method reference");

        /*Providing implementation of workInterface i am using lambda for implementation*/
        WorkInterface workInterface = ()->{
            System.out.println("This is doTask new method");
        };
        // we want to reuse implementation which is already there so instead of new implementation we can use method reference
        // we want  body of that method instead of writing new impl of method as we have same impl in both places
        // We referred static method here .
        //className:: methodName

        WorkInterface workInterface1 = Stuff::doStuff;
        workInterface1.doTask();


        //Example of Runnable for method reference (static method reference)
        Runnable runnable = Stuff::threadTask;
        Thread thread = new Thread(runnable);
        thread.start();

        //Non-static method reference
        //we need object of class where this method is and using that object we hve to use method reference
        //classObject :: methodName

        Stuff stf = new Stuff();
        Runnable runnable1 = stf::printNumbers;

    }
}
