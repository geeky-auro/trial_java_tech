package com.auro.raj;

public class Main {

    public static void main(String[] args) {

//        Addtions...!
        int a=0,b=5,c=6;
        a=b+c;
        System.out.println("Initially");
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("C="+c);

//        B=6
//        C=5
//        Swapping

//        Swapping using 3rd variable...!
        int temp=0;
        temp=b;
        b=c;
        c=temp;

        System.out.println("Finally");
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("C="+c);

//        Swapping without using 3rd variable...>

        b=b+c; // b=6, c=5------->b= 6+5=11
        c=b-c;//c=11-5----> C=6
        b=b-c;//b==11-6------> B=5

        System.out.println("Swapping Without using 3rd variable..!");

        System.out.println("A="+a);
        System.out.println("B="+b);
        System.out.println("C="+c);


    }


}
