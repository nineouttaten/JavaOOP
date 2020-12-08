package com.company;

public class task_25 {
    public static boolean isValidHexCode(String line){
        char[] line_array = line.toCharArray();
        if (line.length() != 7){
            return false;
        }
        for(int i = 1; i != line.length() - 1; i++){
            if (!(Character.isDigit(line_array[i]) || line_array[i] == 'a' || line_array[i] == 'b' || line_array[i] == 'c' || line_array[i] == 'd' || line_array[i] == 'e' || line_array[i] == 'f' || line_array[i] == 'A' || line_array[i] == 'B' || line_array[i] == 'C' || line_array[i] == 'D' || line_array[i] == 'E' || line_array[i] == 'F')){
                return false;
            }
        }
        if(line_array[0] == '#'){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAeCeE"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5z8C"));
        System.out.println(isValidHexCode("dCD5c8C"));
    }
}
