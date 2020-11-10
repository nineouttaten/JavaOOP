package com.company;

public class task_13 {
    public static boolean isAvgWhole(int[] mass) {
        double average = 0;
        for (int i=0; i < mass.length; i++){
            average += mass[i];
        }
        average = average / mass.length;
        if (average % 1 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[] {1, 5, 6}));
        System.out.println(isAvgWhole(new int[] {1, 1, 1}));
        System.out.println(isAvgWhole(new int[] {9, 2, 2, 5}));
    }
}
