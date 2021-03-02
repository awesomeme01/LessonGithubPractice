package com.company;

import java.util.Scanner;

public class Inini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число натуральное");
        int number = sc.nextInt();

        //12245 -> 1 2 == 2(temp) --> break;
        //System.out.println("да"); или "нет"
        int posl = number % 10;//12245 - 5
        number /= 10;// number = number / 10 ==> 1224 --> .9
        int pred = number % 10;//1224 - 4

        boolean printНЕТ = true;
        while(number > 0){
            //сравнить цифры
            //если равны break; + вывод сообщения
            if(posl == pred){
                System.out.println(pred + " == " + posl);
                System.out.println("Да");
                printНЕТ = false;
                //ctrl + ShiftLeft +
                break;
            }//если не равны продолжаем
            else{
                //122
                System.out.println(pred + " != " + posl);
                number /= 10;//number = number / 10;
                posl = pred;//2
                pred = number % 10;//2
            }
        }
        if(printНЕТ){
            System.out.println("НЕТ");
        }
    }
}
