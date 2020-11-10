package com.company;

public class task_14 {
    public static int[] cumulativeSum(int[] mass) {
        int sum = 0;
        for (int i=0; i < mass.length; i++){
            mass[i] = mass[i] + sum;
            sum = mass[i];
        }
        return mass;
    }
    public static void main(String[] args) {
        int[] mass;
        mass = (cumulativeSum(new int[] {1, 2, 3}));
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
