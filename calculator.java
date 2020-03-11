

import java.util.Scanner;

public class calculator {
	public static void addition(int x,int y){
		System.out.println("Sum of given two numbers is : " + (x+y));
	}
	public static void subtraction(int x,int y){
		System.out.println("difference of given two numbers is : " + (x-y));
	}
	public static void multiplication(int x,int y){
		System.out.println("product of given two numbers is : " + (x*y));
	}
	public static void division(int x,int y){
		System.out.println("division  of given two numbers is : " + (x/y));
	}
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("****CALCULATOR****");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			char c1;
			String k;
			do {
				System.out.println("enter your choice:");
				int ch=sc.nextInt();
				System.out.println("enter first number: ");
				int num1 = sc.nextInt();
				System.out.println("enter second number: ");
				int num2 = sc.nextInt();
				switch(ch){
				case 1:addition(num1,num2);break;
				case 2:subtraction(num1,num2);break;
				case 3:multiplication(num1,num2);break;
				case 4:division(num1,num2);break;
				}
				System.out.println("Do you want to continue(y (or) n):");
				k = sc.next();
				c1 = k.charAt(0);
			}while(c1 =='y');
	}

}