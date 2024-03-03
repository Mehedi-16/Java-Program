import java.util.Scanner;  
public class p17  
{  
public static void main(String args[])  
{  
int number, digit, sum = 0;  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = input.nextInt();  
while(number > 0)  
{ 
digit = number % 10;  

sum = sum + digit;   
number = number / 10;  
}   
System.out.println("Sum of Digits: "+sum);  
}  
}  