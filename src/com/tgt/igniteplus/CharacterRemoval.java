package com.tgt.igniteplus;
import  java.util.Scanner;
/*program to remove all occurrences of a given character from input string.*/
public class CharacterRemoval {
    public static void main(String[] args) {
        String s;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string:");
        s=in.nextLine();
        int n=s.length();
        System.out.println("Enter the character to be removed in the above string:");
        char ch=in.next().charAt(0);
        char other_case;
        if(Character.isLowerCase(ch))
            other_case=Character.toUpperCase(ch);
        else
            other_case=Character.toLowerCase(ch);

        char[] array=s.toCharArray();
        int i,j=0;
        for(i=0;i<n;i++) {
            if (array[i] == ch || array[i] == other_case);
            else
                array[j++] = array[i];
        }
        while(j<i) {
            array[j++] = '\0';
        }
        System.out.print("Modified String : ");
        System.out.println(array);

    }
}
/*OUTPUT:
Enter a string:
Red rose
Enter the character to be removed in the above string:
r
Modified String : ed ose
 */
