package com.company;


import java.util.Scanner;

public class Main{//
    static void Error(){
        System.out.println("Нельзя четные числа");
        System.exit(1);
    }

    static void printTable2(){
        //код который принтит таблицу умножения на 2
//        System.out.println(k);


    }

    static void print(String text){
        System.out.println(text);
    }
    static void printSum(int a, int b){
        print(a + b + "");
        //int * int = int
        //int * double = double
        //int + String = String

    }

    public static void main(String[] args) {
        print("Hello world");
        printSum(5, 6);

    }
}
