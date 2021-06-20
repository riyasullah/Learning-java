package com.Bismillah;


public class Variables {

    public static void variable() {


        int number = 1;
        float number1 = 1.5f;
        String name = "riyas";
        char namee = 'a';
        boolean condition = true;

        System.out.println(number);
        System.out.println(number1);
        System.out.println(namee);
        System.out.println(name);
        System.out.println(condition);

        //we can assign the values later as mentioned below
        int a;
        a=25;
        System.out.println(a);

        //we can overwrite the existing value as mentioned below
        float NO=12.5f;
        NO=15.33f;
        System.out.println(NO);

        //if we dont need to overwirte existing data then we can use "final" keyword as mentioned below
        //final String Myname="Riyas";
       // Myname="Sullah";

        //Declaring many variables for arithmetic operation
        int x=6,y=7,z=10;
        System.out.println(x+y+z);

        /*
        Rules for creating variables
        1.Should start with alphabet,underscores
        2.Do not start with number
        3.We can use alphanumeric
        4.Dont use whitespace
        5.Keywords should not use in varaibles like int,char as like
        6.Names are case sensitive ("myVar" and "myvar" are different variables)
         */
    }

}
