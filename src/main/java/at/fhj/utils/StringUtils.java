package at.fhj.utils;

public class StringUtils {

    public static boolean isPalindrome(String input) { 
        String reversed = new StringBuilder(input).reverse().toString(); 
        return input.equals(reversed); 
    }
}






    // public static boolean isPalindrome(String input) { 
    //     String reversed = new StringBuilder(input).reverse().toString(); 
    //     return input == reversed; 
    // }
