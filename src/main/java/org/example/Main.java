package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "J@va the be$t!123";
        System.out.println("Input: " + s);
        System.out.println("Output: " + reverseLetters(s));
    }

    public static String reverseLetters(String s) {
        if (s == null) return null;

        char[] chars = s.toCharArray();
        if  (chars.length == 1) return s;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}