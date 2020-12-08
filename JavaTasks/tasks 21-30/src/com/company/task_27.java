package com.company;

public class task_27 {
    public static boolean isKaprekar(int number){
        int number2 = number * number;
        String number_string = String.valueOf(number2);
        int left_int = number_string.length() / 2;
        //int right_int = number_string.length() / 2 + number_string.length() % 2;
        String left = number_string.substring(0, left_int);
        String right = number_string.substring(left_int);
        if (left == ""){
            left = "0";
        }
        if (Integer.parseInt(left) + Integer.parseInt(right) == number){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));
    }
}
