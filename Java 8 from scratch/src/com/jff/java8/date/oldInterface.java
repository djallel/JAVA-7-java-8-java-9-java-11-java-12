package com.jff.java8.date;

public interface oldInterface {
    public void existingMethod();
    default public void newDefaultMethod() {
        System.out.println("New default method"+
                " is added in interface");
    }
}
