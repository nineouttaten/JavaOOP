package com.company;

public class task_15 {
    public static int getDecimalPlaces(String number) {
        int index = number.indexOf('.');
        if (index == -1){
            return 0;
        }
        else {
            index = number.length() - 1 - index;
            return index;
        }
    }
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
    }
}
