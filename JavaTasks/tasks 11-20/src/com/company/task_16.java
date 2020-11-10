package com.company;

public class task_16 {
    public static int Fibonacci(int index){
        int number;
        int[] fibonacci = new int[index];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for (int i=2; i < index; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[index - 1];
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}
