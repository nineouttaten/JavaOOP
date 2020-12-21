package com.company;

public class task_17 {
    public static boolean isValid(String index){
        if (index.length() != 5){
            return false;
        }
        for (int i=0; i < index.length(); i++){
            if (Character.isDigit(index.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValid("12145"));
    }
}
