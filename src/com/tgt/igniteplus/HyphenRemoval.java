package com.tgt.igniteplus;
/*Program to remove hyphen from the given string only if it is in between digits*/
import java.util.Scanner;

public class HyphenRemoval {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = in.nextLine();
        int n=s.length();
        System.out.println("String after removing hyphen between digits : ");
        char[] array=s.toCharArray();
        int i,j=0;
        for(i=0;i<n;i++) {
            if (array[i] == '-' && Character.isDigit(array[i - 1]) && Character.isDigit(array[i + 1])) ;
            else
                array[j++] = array[i];
        }
        while(j<i) {
            array[j++] = '\0';
        }
        System.out.println(array);
    }
}
/*OUTPUT:
Enter a string:
134-10/5566 A-Block
String after removing hyphen between digits :
13410/5566 A-Block
 */
