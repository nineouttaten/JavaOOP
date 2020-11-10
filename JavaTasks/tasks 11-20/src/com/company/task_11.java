package com.company;

public class task_11 {
    public static String repeat(String word, int count) {
        String result = "";
        for (int j=0; j < word.length(); j++) {
            for (int i = 0; i < count; i++) {
                result += word.charAt(j);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeat("mice",5));
    }
}
