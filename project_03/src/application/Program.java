package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Num 2: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;

		String pair = sum % 2 != 0 ? "A soma não é par" : "A soma é par";
		
		System.out.println(pair);
		
		sc.close();
	}
}
