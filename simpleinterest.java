
package basicprogram;

import java.util.Scanner;

public class simpleinterest{
public static void main(String []args)
{
	float phy,chem,math,bio,english,total,avg,percentage;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of physics:");
	phy =sc.nextFloat();
	System.out.println("Enter marks of chemistry:");
	chem = sc.nextFloat();
	System.out.println("Enter marks of maths:");
	math =sc.nextFloat();
	System.out.println("Enter marks of bio:");
	bio =sc.nextFloat();
	System.out.println("Enter marks of english:");
	english =sc.nextFloat();
	total= phy+chem+math+bio+english;
	System.out.println("total of five subject is:" +total);
	avg= total/5;
	System.out.println("Average is:" +avg);
	percentage= (total/500)*100;
	System.out.println("percentage is:" +percentage);
	
	if (total>=300)
	{
		System.out.println("True condition");
	}
	else
		System.out.println("false condition");
	
}
}
