import java.util.Scanner;
import java.util.Arrays;
class ArrayOfStrings
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of strings");
int size=sc.nextInt();
String[] string=new String[size];
System.out.println("Enter the string");
for(int i=0;i<size;i++)
{
string[i]=sc.next();
}
System.out.println("Choose:\n1.Built-in-method\n2.User defined method");
System.out.println("Option");
int opt=sc.nextInt();
switch(opt)
{
case 1:
	Arrays.sort(string);
	break;
case 2:
	String temp;
	for(int i=0;i<size-1;i++)
	{
	for(int j=i+1;j<size;j++)
	{
	if(string[i].compareTo(string[j])>0)
	{
	temp=string[i];
	string[i]=string[j];
	string[j]=temp;
	}
	}
	}
	break;
	default:
	  System.out.println("Invalid:");
	  }
	  for(int i=0;i<size;i++)
	  {
	  System.out.println(string[i]);
	  }
}
}

