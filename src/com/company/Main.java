package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;

SplitToNums split = new SplitToNums();
//        System.out.println(split.getFirst());
        AreTheyRoman firstCheck = new AreTheyRoman();

       if( firstCheck.isItRoman(split.getFirst()) && firstCheck.isItRoman(split.getSecond())){
           System.out.println("roman");
           FromRomanToArab first = FromRomanToArab.valueOf(split.getFirst());
           FromRomanToArab second = FromRomanToArab.valueOf(split.getSecond());
           switch (split.getOperation()) {
               case  ("+"):
                   result = first.getArabian()+second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("-"):
                   result = first.getArabian()-second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("/"):
                   result = first.getArabian()/second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));
                   break;
               case  ("*"):
                   result = first.getArabian()*second.getArabian();
                   System.out.println(firstCheck.turnToRome(result));

                   break;
           }

       }
          else if (  !firstCheck.isItRoman(split.getFirst()) & !firstCheck.isItRoman(split.getSecond())){;
        System.out.println("they are Arabian");
        split.calc();}
        ;

        /* if (firstCheck.isItRoman())*/
//        (split.getFirst());
//        (split.getSecond());








// FromRomanToArab two = FromRomanT
//
//
//
//
// oArab.C;
// two.getArabian();





//1если ввели арабское число:
//        if tri =
//        FromRomanToArab [] num1 = FromRomanToArab.values();
//        for (int i = 0; i<num1.length; i++){
//        if(split.input1()-1 == (num1[i].ordinal())){//добавить ошибку
//                System.out.println(num1[split.input1()-1]);
//                System.out.println(num1[split.input1()].ordinal());
        }
    }