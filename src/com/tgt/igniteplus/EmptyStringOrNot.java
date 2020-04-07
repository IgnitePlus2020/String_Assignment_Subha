package com.tgt.igniteplus;

import java.util.Scanner;

/*program to check if a string is empty or not*/
public class EmptyStringOrNot {
        public static void main(String[] args) {
            String s1="";
            String s2="Hello world";
            System.out.println("Is string s1 empty ? "+s1.isEmpty());
            System.out.println("Is string s2 empty ? "+s2.isEmpty());
            String s;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string:");
            s = in.nextLine();
            if(s.isEmpty())
                System.out.println("Given string is empty.");
            else
                System.out.println("Given string is not empty.");
        }
}
/*OUTPUT 1:
Is string s1 empty ? true
Is string s2 empty ? false
Enter a string:

Given string is empty.


OUTPUT 2:
Is string s1 empty ? true
Is string s2 empty ? false
Enter a string:
HI
Given string is not empty.
 */
