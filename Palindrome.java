import java.util.Scanner;
public class Palindrome
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in); 
      int age = sc.nextInt();
      System.out.println("The age is"+ age);
      String original= "MADAM"; // Objects of String class
String reverse= "MADAM";
      if (original.equals(reverse))
         System.out.println("The string and int is a palindrome.");
      else
         System.out.println("The string and int isn't a palindrome.");
         
   }
}      
