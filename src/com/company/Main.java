package com.company;

public class Main {

    public static void main(String[] args) {
        //Lesson2 a = new Lesson2();
        //a.Lesson();

        //Task 1
        int al = 8;
        ConnectionManager cm = new ConnectionManager(al);
        for (int i = 0; i <= al; i++){
            System.out.println(ConnectionManager.GetConnection());
        }

        System.out.println("***************************");
        //Task 2
        DerivedClass dc = new DerivedClass();
        BaseClass bc = new DerivedClass();
        dc.method1();
        bc.method1();
        //Both methods. Second - from DerivedClass.
    }
}
