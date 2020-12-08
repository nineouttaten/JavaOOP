package com.company;

public class task_26 {
    public static int unique(int[] arr1){
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            countUnique++;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] == arr1[i]) {
                    count++;
                    break;
                }
            }
        }
        return countUnique - count;
    }
    public static boolean same(int[] arr1, int[] arr2){
        if (unique(arr1) == unique(arr2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1, 3, 4, 4, 4};
        int[] arr2 = {2, 5, 7};
        System.out.println(same(arr1, arr2));
    }
}
