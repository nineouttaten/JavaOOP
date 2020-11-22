package com.company;

public class task_19 {
    public static boolean isPrefix(String word, String prefix_){
        int length = prefix_.length() - 1;
        String substring = word.substring(0,length);
        prefix_ = prefix_.substring(0, length);
        return substring.equals(prefix_);
    }
    public static boolean isSuffix(String word, String _suffix){
        int length = _suffix.length() - 1;
        String substring = word.substring(word.length() - length,word.length());
        _suffix = _suffix.substring(1, length + 1);
        return substring.equals(_suffix);
    }
    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
    }
}

