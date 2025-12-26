package com.java;

@FunctionalInterface
public interface SumFuncInterfaceWithDefaultAndAbstractMethod {
    public abstract int  sum(int a, int b);

    default void logOperation(String message) {
        System.out.println("Logging: "+ message);
    }

}
