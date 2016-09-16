package com.company;

/**
 * Created by azolotukhin on 13.09.2016.
 */
public class Cat {

    static int i = 0;

    Cat(){
        System.out.println("Default Constructor");
    }

    Cat(int i){
        this();
        System.out.println("Int Constructor");
    }

    Cat(int i, int j){
        System.out.println(i + ", " + j);
    }

    public static void Meow(){
        i += 1;
    }

    public void Meow(int... arr){
        System.out.println(arr[i]);
    }
}
