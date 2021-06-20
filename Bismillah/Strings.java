package com.Bismillah;

import java.util.Locale;

public class Strings {

    public static void string(){
        String name="Mohamed Riyasullah";
      //finding length of name
        System.out.println(name.length());
      //converting uppercase and lowercase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
      //finding a character

        System.out.println(name.indexOf("R"));

      //Special character like " ' \
      String Name="We are the so-called \"Vikings\" from the north.";
        String Name1= "It\'s alright.";
        String Name2 = "The character \\ is called backslash.";

        //code valid in string
        //  \n-new line
        //  \t-tab

        String fathername="Mohamed ibrahim";
        System.out.println(name+" "+fathername);

       //Math
       int a=50;
       int b=70;
       int c=-25;
       int d=25;


        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(c));
        System.out.println(Math.sqrt(d));
        System.out.println(Math.floor(5.3));
        System.out.println(Math.ceil(5.3));
        System.out.println((int) (Math.pow(3,2)));
        System.out.println(Math.random()*50);

    }
}
