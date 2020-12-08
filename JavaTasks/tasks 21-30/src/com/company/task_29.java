package com.company;

public class task_29 {
    public static int nextPrime(int number){
        int k = 0;
        for (int i = number; i != 0; i++) {
            k = 0;
            for (int j = 2; j != i; j++){
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 0){
                return i;
            }
        }
        return number;
    }
    public static void main(String[] args){
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
    }
}
