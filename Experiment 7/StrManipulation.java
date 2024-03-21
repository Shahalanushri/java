import java.util.*;
import java.util.Scanner;
class StrManipulation{
public static void main(String args[])
{
//string using new operator
char chs[]={'I','G','H','A'};
String newStr=new String(chs);
System.out.println("New string using new operator: "+newStr);


//string length
String s1="good";
String s2="Morning";
System.out.println("String length of "+s1+":"+s1.length());


//to uppercase & lowercase
System.out.println(s1+"to uppercase: "+s1.toUpperCase());
System.out.println(s1+"to lowercase: "+s1.toLowerCase());


//string concatenation
System.out.print("\n");
System.out.println("----STRING CONCATENATION-------- ");
System.out.print("\n");
System.out.println("using concat(): "+s1.concat(s2));
System.out.println("using + operator: "+s1 + s2);


//character extraction
System.out.print("\n");
System.out.print("-----CHARACTER EXTRACTION------");
System.out.print("\n");
System.out.print("\n");
System.out.println("character at 2nd position: "+s1.charAt(2));
char c[]=new char[5];
s2.getChars(2,4,c,0);
System.out.println("character between 2 and 4: "+new String(c));
s1="morning";
s2="MORNING";
System.out.print("\n");
System.out.print("-----CHARACTER COMPARISON------");
System.out.print("\n");
System.out.print("\n");
System.out.println(s1+"Equals"+s2+":"+s1.equals(s2));
System.out.println(s1+"Equals ignore case"+s2+":"+s1.equalsIgnoreCase(s2));
System.out.println(s1+"Compare"+s2+":"+s1.compareTo(s2));
System.out.println(s1+"Compare ignore case"+s2+":"+s1.compareToIgnoreCase(s2));
System.out.println(s1+" Start with M : "+":"+s2.startsWith("M"));
System.out.println(s1+" End with g : "+":"+s1.endsWith("g"));
System.out.print("\n");
System.out.print("-----SEARCH SUBSTRING------");
System.out.print("\n");
System.out.print("\n");
s1="how are you";
System.out.println(" Index of you in "+s1+ ":" +s1.indexOf("you"));
System.out.print("\n");
System.out.println("-------MODIFY STRING------");
System.out.print("\n");
System.out.println(" Substring of "+s1+":"+s1.substring(5));
System.out.println(" String replacing: "+s1.replace("how are","hey"));
System.out.print("\n");
System.out.println("----USING valueOf()------");
System.out.print("\n");
float n=10.6f;
System.out.println(n+" is converted to "+String.valueOf(n));
}
}



