package com.company;

public class task_12 {
    public static int differenceMaxMin(int[] mass) {
        int max = mass[0], min = mass[0];
        for (int i=0; i < mass.length; i++){
            if (mass[i] > max){
                max = mass[i];
            }
            if (mass[i] < min){
                min = mass[i];
            }
        }
        max = max - min;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
    }
}
