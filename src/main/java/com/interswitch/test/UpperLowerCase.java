package com.interswitch.test;

public class UpperLowerCase {
    public String toUpperCase(String text) {
        if (null != text && !text.isEmpty()) {
            String[] words = text.split(" ");
            return words[0].toUpperCase();
        }
        throw new IllegalArgumentException("Text cannot be empty");
    }

    public String toLowerCase(String text) {
        if (null != text && !text.isEmpty()) {
            String[] words = text.split(" ");
            return words[0].toLowerCase();
        }
        throw new IllegalArgumentException("Text cannot be empty");
    }
public static void main(String[] args){
    UpperLowerCase upperCase = new UpperLowerCase();
    System.out.println(upperCase.toUpperCase("Tgjagjkk hskjhkaj"));
    System.out.println(" ");
    System.out.println(upperCase.toLowerCase("Tgjagjkk hskjhkaj"));

}
}
