package com.Bismillah;

public class Opertors {

    public static void operator(){

        /* Types of operators
        1.arithmetic
        2.assignment
        3.comparison
        4.logical
        5.bitwise


         */
    //arithmetic
        int a=5;
        int b=10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    //assignment oprerator
    int num=5;
        System.out.println(num);
    //increament and decrement operator
    int number1=10;
    number1+=1;
        System.out.println(number1);
    int number2=20;
    number2-=1;
        System.out.println(number2);

    //comparison operator
    int number3=50;
    int number4=100;

        System.out.println(number3==number4);
        System.out.println(number3!=number4);
        System.out.println(number3>number4);
        System.out.println(number3<number4);
        System.out.println(number3>=number4);
        System.out.println(number3<=number4);

        //logical operator and(&&) or(||) not(!)

        System.out.println(number3<100 && number4>50);
        System.out.println(number3<100 || number4==50);
        System.out.println(!(number3<100 && number4>50));


    }
}
