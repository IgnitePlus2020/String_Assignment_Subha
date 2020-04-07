package com.tgt.igniteplus;

import java.util.Scanner;
/*Program to find string length*/
public class StringSize {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = in.nextLine();
        int n=s.length();
        System.out.println("Length of the given string  is "+n);
    }
}
/*OUTPUT 1:
Enter a string:
ABCD1223
Length of the given string  is 8

OUTPUT 2:
Enter a string:

Length of the given string  is 0
 */
