package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Palindrome";
        String s3 = "madam";
        String s4 = "racecar";
        String s5 = "applle";
        String s6 = "kayak";
        String s7 = "song";
        String s8 = "noon";
        System.out.print(s1 + " ");
        System.out.println(isPalindrome(s1));
        System.out.print(s2 + " ");
        System.out.println(isPalindrome(s2));
        System.out.print(s3 + " ");
        System.out.println(isPalindrome(s3));
        System.out.print(s4 + " ");
        System.out.println(isPalindrome(s4));
        System.out.print(s5 + " ");
        System.out.println(isPalindrome(s5));
        System.out.print(s6 + " ");
        System.out.println(isPalindrome(s6));
        System.out.print(s7 + " ");
        System.out.println(isPalindrome(s7));
        System.out.print(s8 + " ");
        System.out.println(isPalindrome(s8));
    }
    public static String reverseString(String s){
        char[] sReverse = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            sReverse[j] = s.charAt(i);
            j++;
        }
        s = String.valueOf(sReverse);
        return s;
    }
    public static boolean isPalindrome(String s){
        String s2 =  reverseString(s);
        if (s.equals(s2) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
