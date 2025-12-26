package com.java;


//Can have only one abstract method.
@FunctionalInterface
public interface MyFuncInterface {
    public abstract  void sayHello();
}

//Three ways of implementing Interface(Functional here)

/*
1. Create a separate class and impements teh interface
2. Anonymous class for interface
3. By implementing lambda (Java 8)
* */
