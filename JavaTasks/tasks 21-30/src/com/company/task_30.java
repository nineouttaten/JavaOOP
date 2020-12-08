package com.company;

public class task_30 {
    public static boolean rightTriangle(int x, int y, int z){
        int a, b, c;
        if (x > y & x > z){
            c = x;
            a = y;
            b = z;
        }
        else if (y > z & y > x){
            c = y;
            a = x;
            b = z;
        }
        else {
            c = z;
            a = y;
            b = x;
        }
        if (c * c == a * a + b * b){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println(rightTriangle(3, 4, 5) );
        System.out.println(rightTriangle(145, 105, 100) );
        System.out.println(rightTriangle(70, 130, 110) );
    }
}
