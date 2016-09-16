package com.company;

/**
 * Created by azolotukhin on 14.09.2016.
 */
public class Lesson2 {
    public Lesson2(){}
    public void Lesson()
    {
        int i = 0;
        //i = i + 1;
        i += 1;
        //i -= 2;

        System.out.println(i);

        i++;
        System.out.println(i);
        System.out.println(++i); //Plus, then print
        System.out.println(i++); //Print, then plus
        System.out.println(++i);

        //logic
        //if (i > 1 && i < 100){};

        //приведение типов
        //int k = 200;
        //long l = k;

        long l2 = 200;
        int k2 = (int) 12;

        //Math.round(l2);

        for (int i2 = 0; i2 < 10; i2++) {
            System.out.println(i2);
            if (i2 == 2) {
                break;
            }
        }

        System.out.println("************************");
        label1:
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            if (j == 3) {
                break label1;
            }
        }

        System.out.println("************************");
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
            default:
                System.out.println("Default");
        }

        Cat Ko = new Cat(i);
        Cat Ko2 = new Cat();

        System.out.println(Cat.i);
        Ko.Meow();
        System.out.println(Cat.i);
        Ko2.Meow();
        System.out.println(Cat.i);
        Cat.Meow();
        System.out.println(Cat.i);

        //modificators
        //public
        //private
        //protected
        //< >

        //final - constant
    }
}
