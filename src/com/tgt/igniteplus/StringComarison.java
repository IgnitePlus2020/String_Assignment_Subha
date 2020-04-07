package com.tgt.igniteplus;

public class StringComarison {
    public static void main(String[] args) {
        String one="Honey";
        String two="Bee";
        String three="honey";
        System.out.println("Using compareTo on strings \"Honey\" and \"Bee\": ");
        if(one.compareTo(two)>0)
            System.out.println("string \"Honey\" is lexographically greater than \"Bee\" ");
        else if(one.compareTo(two)<0)
            System.out.println("string \"Honey\" is lexographically lesser than \"Bee\" ");
        else
            System.out.println("string \"Honey\" equals \"Bee\" ");
        System.out.println("\n\nUsing equals on strings \"Honey\" and \"honey\": ");
        if(one.equals(three))
            System.out.println("string \"Honey\" equals string \"honey\" ");
        else
            System.out.println("string \"Honey\" is not equal to string \"honey\" ");
        System.out.println("\n\nUsing compareToIgnoreCase on strings \"Honey\" and \"honey\": ");
        if(one.compareToIgnoreCase(three)==0)
            System.out.println("string \"Honey\" equals string \"honey\" ignoring case differences");
        else if(one.compareToIgnoreCase(three)>0)
            System.out.println("string \"Honey\" is lexographically greater than string \"honey\" ignoring case differences");
        else
            System.out.println("string \"Honey\" is lexographically lesser than string \"honey\" ignoring case differences");
    }
}
/*OUTPUT:
Using compareTo on strings "Honey" and "Bee":
string "Honey" is lexographically greater than "Bee"


Using equals on strings "Honey" and "honey":
string "Honey" is not equal to string "honey"


Using compareToIgnoreCase on strings "Honey" and "honey":
string "Honey" equals string "honey" ignoring case differences
 */
