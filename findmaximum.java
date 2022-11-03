package basicprogram;

import java.util.Scanner;

public class findmaximum {
public static void main(String []args) {

 float num;
 Scanner sc=new Scanner(System.in);
		 
  System.out.println("Enter number");
 num= sc.nextInt();
 
   if((num%5==0) && (num%11==0))
		   {
	   System.out.println("Number is divisible:" +num);
		   }
   else
   {
	   System.out.println("Invalid number");
   }
}
}