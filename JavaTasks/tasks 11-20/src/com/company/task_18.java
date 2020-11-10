package com.company;

public class task_18 {
    public static boolean isStrangePair(String first, String second){
        int first_length = first.length();
        int second_length = second.length();
        if ((first.charAt(0) == second.charAt(second_length - 1)) & (second.charAt(0) == first.charAt(first_length - 1))){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "operator"));
    }
}
