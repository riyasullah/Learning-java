package com.Bismillah;

public class Data_types {

    public static void DataTypes(){
        /*
        Two types of datatypes
        1.primitive data types
        2.Non primitive data types(reference data types)

        Primitive data types
        1.byte-(-128 to 127)
        2.short-(-32768 to 32767)
        3.int-(-2147483648 to 2147483647)
        4.long-( -9223372036854775808 to 9223372036854775807)
        5.float-(3.4e−038 to 3.4e+038)
        6.double-(1.7e−308 to 1.7e+308)
        7.boolean-true or false
        8.char-single character(Alternatively, you can use ASCII values to display certain characters:)
        char a=65;
        9.Strings=storing characters

        Numbers primitive data types divided two groups
        1.Integer type-byte,short,int,long
        2.Floating type-float and double

        Non-Primitive Data Types
        Non-primitive data types are called reference types because they refer to objects.

       The main difference between primitive and non-primitive data types are:
      Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer
       and is not defined by Java (except for String).
      Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
      A primitive type has always a value, while non-primitive types can be null.
      A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
      The size of a primitive type depends on the data type, while non-primitive types have all the same size.
      Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about
      these in a later chapter.


        Java type casting
        2 types of casting
        1.Widenning casting(Automatic)-smaller to larger datatypes
        2.Narrowing casting(manual)-larger to smaller data types
         */
       //widening casting
        int no = 120;
        double number1=no;
        System.out.println(number1);

        //Narrowing casting
        double number2=120.8d;
        int number3=(int) number2;
        System.out.println(number3);



    }
}
