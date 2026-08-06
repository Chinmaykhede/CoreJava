package in.co.rays.basics;

import java.util.Scanner;

public class Traingle {
	public static void main(String[] args) {
		//int num=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many stars ?");
		int num = sc.nextInt();
		
		for(int i= 0; i<num; i++)
		{
		  for(int j=1; j<=i; j++) 
		  {
		    System.out.print(" *");
		  }
		  System.out.println();
		  
		}
		
	}

}
