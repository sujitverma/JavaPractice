package javapractice;

import java.util.Scanner;

public class IsPalindrome {

public static void main(String[] args) {
       	String rev = "";
       	System.out.print("Enter the String");
        Scanner scan =new Scanner(System.in);
        String str = scan.next();
        int strLen = str.length();
        for(int i = strLen-1; i>=0; i--) {
        	rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)) {
        	System.out.print("Yes");
        }
        else {
        	System.out.print("No");
        }
        
    }
}