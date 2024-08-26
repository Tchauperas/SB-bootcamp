package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Num1: ");
		double num1 = sc.nextDouble();
		System.out.print("Num2: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Resultado: " + calculadora(num1, num2));
		
		sc.close();
	}
	
	public static double calculadora(double num1, double num2) {
		return num1 + num2;
	}
}
