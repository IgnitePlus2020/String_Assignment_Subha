package com.tgt.igniteplus;
/*Program to remove hyphen from the given string only if it is in between digits*/
import java.util.Scanner;

public class HyphenRemoval {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = in.nextLine();
        if(s.isEmpty())
        {
            System.out.println("Empty string!!!");
            return;
        }
        int n=s.length();
        System.out.println("String after removing hyphen between digits : ");
        StringBuilder newstring=new StringBuilder();
        newstring.append(s.charAt(0));
        for(int i=1;i<n-1;i++)
        {
            if (s.charAt(i) == '-' && Character.isDigit(s.charAt(i-1)) && Character.isDigit(s.charAt(i+1)));
            else
                newstring.append(s.charAt(i));
        }
        if(n>1)
            newstring.append(s.charAt(n-1));
        System.out.println(newstring);

    }
}
/*OUTPUT:
Enter a string:
-134-10/5566 A-block, New Manyata Tech-Park 12-45 testing
String after removing hyphen between digits : 
-13410/5566 A-block, New Manyata Tech-Park 1245 testing

 */
