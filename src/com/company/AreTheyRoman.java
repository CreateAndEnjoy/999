package com.company;//Есть методы turnToRome isItRoman

public class AreTheyRoman {
    private static int test;
    private String firstInput;
    private String secondInput;
    private boolean isItRoman;
    private boolean secondIsRoman;
    private boolean bothAreRoman;
    FromRomanToArab [] toCheck = FromRomanToArab.values();

    public String turnToRome(int test) {
        this.test = test;

        for (int i = 0; i<toCheck.length; i++){
            if(test== (toCheck[i].getArabian())){
                return toCheck[i].getRoman();}
            else {;
            }
        }

        return null;
    };





    public boolean isItRoman(String firstInput){
    this.firstInput = firstInput;
        for (int i = 0; i<toCheck.length; i++){
            if(firstInput.equals (toCheck[i].getRoman())){
                isItRoman= true;

            break; }
                else {
                isItRoman= false;
            }
        }


//        for (int i = 0; i<toCheck.length; i++){
//            if(secondInput.equals (toCheck[i].getRoman())){
//                secondIsRoman = true;}
//            else
//                secondIsRoman= false;
//        }
//        if (firstIsRoman==true & secondIsRoman == true){
//            bothAreRoman = true;}
//            else
//                bothAreRoman = false;

    return isItRoman;
}
}
  /*  FromRomanToArab [] num1 = FromRomanToArab.values();
        for (int i = 0; i<num1.length; i++){
        if(split.input1()-1 == (num1[i].ordinal())){//добавить ошибку
            System.out.println(num1[split.input1()-1]);
            System.out.println(num1[split.input1()].ordinal());*/







//    public void checkIfRoman (String check) {
//        this.check = check;
//        FromRomanToArab [] romanValues = FromRomanToArab.values();
//        for (int i = 0; i<romanValues.length; i++){
//            if(check.equals (romanValues[i].getRoman())){
//                System.out.println(romanValues[i].getArabian());}
