package Lab2;
//Wap to swap two numbers

import java.util.Scanner;

//Q   How to swap two numbers without using a third variable?
public class Q1 {

	public static void main(String[] args) {
	    int a,b;
	    
		Scanner s = new Scanner(System.in);
		 System.out.println("Enetr two numbers");
		 a = s.nextInt();
		 b = s.nextInt();
		 
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println(a); 
		 System.out.println(b);
	}

}
