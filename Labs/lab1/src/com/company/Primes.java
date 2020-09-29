package com.company;

public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
            if (isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)  {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
