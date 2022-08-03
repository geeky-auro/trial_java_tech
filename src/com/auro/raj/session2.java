package com.auro.raj;

import java.util.Scanner;

public class session2 {
    public static void main(String args[]){
    /**
     *
     * You are given a single positive integer, N.
     * You need to find and print whether N is Prime or not.
     * Ex:5,13,7
     * */

//    Object creation a scanner Class...!
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number to be checked:\n");
//        int n=sc.nextInt();//5
//        checkPrime(5);

//        10---->2,3,5,7
//        11---->2,3,5,7,11
        printPrimeSeries(10);

    }

    private static void printPrimeSeries(int range) {
        for (int j=1;j<=range;j++){
            checkPrime(j);
        }
    }

    public static void checkPrime(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.print(n+":"+"It is a Prime Number..! \n");
        }

       }
}
