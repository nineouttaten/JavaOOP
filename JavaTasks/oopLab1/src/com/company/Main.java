package com.company;

import java.util.Scanner;

public class Main {

    public static int remainder(int chastnoe, int delitel) {
        int ost;
        ost = chastnoe % delitel;
        System.out.println("lab 1");
        System.out.println("remainder(1, 3)");
        System.out.println(ost);
        System.out.println();
        return ost;
    }

    public static int triArea(int osnov, int visota){
        int s;
        s = (osnov * visota)/2;
        System.out.println("lab 2");
        System.out.println("triArea(3, 2)");
        System.out.println(s);
        System.out.println();
        return s;
    }

    public static int animals(int chickens, int cows, int pigs){
        int s;
        s = chickens * 2 + cows * 4 + pigs * 4;
        System.out.println("lab 3");
        System.out.println("animals(2, 3, 5)");
        System.out.println(s);
        System.out.println();
        return s;
    }

    public static boolean profitableGamble(double prob, int prize, int pay){
        System.out.println("lab 4");
        System.out.println("profitableGamble(0.2, 50, 9)");
        if (prob * prize > pay){
            System.out.println("true");
            System.out.println();
            return true;
        }
        else{
            System.out.println("false");
            System.out.println();
            return false;
        }
    }

    public static String operation(int N, int a, int b){
        System.out.println("lab 5");
        System.out.println("operation(24, 15, 9)");
        if ((a+b) == N){
            System.out.println("added");
            System.out.println();
            return "added";
        }
        else if ((a - b) == N){
            System.out.println("subtracted");
            System.out.println();
            return "subtracted";
        }
        else if ((a * b) == N){
            System.out.println("multiplied");
            System.out.println();
            return "multiplied";
        }
        else if ((a / b) == N){
            System.out.println("divided");
            System.out.println();
            return "divided";
        }
        else return "none";
    }

    public static int ctoa (char symbol){
        int ascii = (int) symbol;
        System.out.println("lab 6");
        System.out.println("ctoa('A')");
        System.out.println(ascii);
        System.out.println();
        return ascii;
    }

    public static int addUpTo(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum += i;
        }
        System.out.println("lab 7");
        System.out.println("addUpTo(3)");
        System.out.println(sum);
        System.out.println();
        return sum;
    }

    public static int nextEdge(int rebro1, int rebro2){
        rebro1 = rebro1 + rebro2 - 1;
        System.out.println("lab 8");
        System.out.println("nextEdge(8, 10)");
        System.out.println(rebro1);
        System.out.println();
        return rebro1;
    }

    public static int sumOfCubes(int[] mass){
        int sum = 0;
        int arrayLength = mass.length;
        for (int i = 0; i < arrayLength; i++){
            sum += mass[i]*mass[i]*mass[i];
        }
        System.out.println("lab 9");
        System.out.println("sumOfCubes(1, 5, 9)");
        System.out.println(sum);
        System.out.println();
        return sum;
    }

    public static boolean abcmath(int a, int b, int c){
        System.out.println("lab 10");
        System.out.println("abcmath(42, 5, 10)");
        for (int i = 0; i < b; i++){
            a += a;
        }
        if (a % c == 0){
            System.out.println("true");
            System.out.println();
            return true;
        }
        else{
            System.out.println("false");
            System.out.println();
            return false;
        }
    }

    public static void main(String[] args) {
        int ost_int;
        int[] mass = {1, 5, 9};
        boolean ost_boolean;
        String ost_string;
        ost_int = remainder(1, 3);
        ost_int = triArea(3,2);
        ost_int = animals(2,3,5);
        ost_boolean = profitableGamble(0.2,50,9);
        ost_string = operation(24,15,9);
        ost_int = ctoa('A');
        ost_int = addUpTo(3);
        ost_int = nextEdge(8, 10);
        ost_int = sumOfCubes(mass);
        ost_boolean = abcmath(42, 5, 10);
    }
}
