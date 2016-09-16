package com.company;

/**
 * Created by azolotukhin on 15.09.2016.
 */
public class BaseClass {
    BaseClass(){}

    public void method1(){
        System.out.println("Method 1");
        method2();
    }

    public void method2(){
        System.out.println("Method 2");
    }
}
