package com.company;

public class task_22 {
    public static int findZip(String line){
        int firstEnter = line.indexOf("zip");
        int secondEnter = line.indexOf("zip",firstEnter + 1);
        return secondEnter;
    }
    public static void main(String[] args){
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
    }
}
