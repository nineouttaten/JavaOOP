package com.company;

public class task_28 {
    public static String longestZero(String line){
        char[] line_array= line.toCharArray();
        int count = 0;
        int max_count = 0;
        for (int i = 0; i != line.length(); i++){
            if(line_array[i] == '0'){
                count ++;
            }
            else {
                if (count > max_count){
                    max_count = count;
                }
                count = 0;
            }
        }
        line = "";
        for (int i = 0; i != max_count; i++){
            line += "0";
        }
        return line;
    }
    public static void main(String[] args){
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
    }
}
