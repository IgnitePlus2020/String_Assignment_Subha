package com.tgt.igniteplus;
/*Program that shows that a string object is immutable whereas objects of StringBuilder and Stringbuffer class can be modified.*/
public class ImmutableString {
    public static void main(String[] args) {
        String s1,s2;
        s1="Sea ";
        s2="Shells";
        s1.concat(s2);
        System.out.println("Use of String object:");
        System.out.println("String after concatenation of \"Sea\" and \"Shells\" : "+s1+"\n\n");
        System.out.println("Use of StringBuilder object:");
        StringBuilder sbuild=new StringBuilder("Good ");
        sbuild.append("Morning");
        System.out.println("String after concatenation of \"Good\" and \"Morning\" : "+sbuild+"\n\n");
        System.out.println("Use of StringBuffer object:");
        StringBuffer sbuf=new StringBuffer("Computer ");
        sbuf.append("Science");
        System.out.println("String after concatenation of \"Computer\" and \"Science\" : "+sbuf);
    }
}
/*OUTPUT:
Use of String object:
String after concatenation of "Sea" and "Shells" : Sea


Use of StringBuilder object:
String after concatenation of "Good" and "Morning" : Good Morning


Use of StringBuffer object:
String after concatenation of "Computer" and "Science" : Computer Science

 */
