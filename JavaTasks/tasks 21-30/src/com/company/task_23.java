package com.company;

public class task_23 {
    public static boolean checkPerfect(int number){
        int sum = 0;
        for (int i = 1; i != number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
    }
}
