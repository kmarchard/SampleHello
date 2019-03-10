import java.util.Scanner;
import java.util.*;
public class Palindrome
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in); 
      //int age = sc.nextInt();
      System.out.println("The age is"+  12);
      String name="quora";

StringBuilder strb=new StringBuilder(name);

System.out.println("Checking import"+" "+strb.reverse().toString());
      String original= "MADAM"; // Objects of String class
String reverse= "MADAM";
      if (original.equals(reverse))
         System.out.println("The string and int is a palindrome.");
      else
         System.out.println("The string and int isn't a palindrome.");
         
   }
}      
