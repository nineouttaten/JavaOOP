package com.company;

public class task_20 {
    public static int boxSeq(int turn){
        int count = 0;
        int i = 1;
        if (turn == 0){
            return 0;
        }
        while (i != turn+1){
            if (i % 2 == 1){
                count += 3;
                i++;
            }
            else{
                count -= 1;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }
}
