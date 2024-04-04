import java.util.Scanner;
import java.util.*;
class InvalidUserException extends Exception
{
public InvalidUserException(String msg)
{
super (msg);
}
}
public class Authentication
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter username: ");
String username=sc.nextLine();
System.out.println("Enter password: ");
String password=sc.nextLine();
try
{
if(username.length()<8)
{
throw new InvalidUserException("Invalid usernmae,User must be greater than 7 charecters!");
}
else if(!password.equals("abcd1234"))
{
throw new InvalidUserException("Invalid password,Enter correct password! ");
}
else
{
System.out.println("Login successful! ");
}
}
catch(InvalidUserException e){
e.printStackTrace();
}
}
}

