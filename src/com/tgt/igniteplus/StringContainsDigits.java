package com.tgt.igniteplus;

import java.util.Scanner;

/*Program to check if a string contains only digits*/
public class StringContainsDigits {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = in.nextLine();
        if(s.matches("\\d+"))
            System.out.println("String contains only digits.");
        else
            System.out.println("String contains characters other than digits.");

    }
}
/*OUTPUT 1:
Enter a string:
1234
String contains only digits.



OUTPUT 2:
Enter a string:
abcd12
String contains characters other than digits.

 */
