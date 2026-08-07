package in.co.rays.basics;

import java.util.Scanner;

public class Testcalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st input");
		int a = sc.nextInt();
		System.out.println("Enter 2nd input");
		int b = sc.nextInt();
		System.out.println("'+','-','*','/','%'");
		String opr = sc.next();
		switch (opr) {
		case "+":
			System.out.println("result " + (a+b));
			break;
		case "-":
			System.out.println("result " + (a-b));
			break;
		case"*":
			System.out.println("resutl " + (a*b));
			break;
		case "/":
			System.out.println("result " +(a/b));
			break;
		case"%":
			System.out.println("result " +(a%b));
			break;
		} sc.close();
}
}