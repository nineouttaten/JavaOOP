package com.company;

public class task_24 {
    public static String flipEndChars(String line){
        char[] line_array = line.toCharArray();
        char bubble = line_array[0];
        if (line.length() < 2){
            return "Incompatible.";
        }
        else if (line_array[0] == line_array[line.length()-1]){
            return "Two's a pair.";
        }
        else {
            line_array[0] = line_array[line.length() - 1];
            line_array[line.length() - 1] = bubble;
            String str = new String(line_array);
            return str;
        }
    }
    public static void main(String[] args){
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("z"));
    }
}
