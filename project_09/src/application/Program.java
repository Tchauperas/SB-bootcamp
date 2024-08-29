package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		
		while(x) {
			try {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Height: " + height);
				x = false;
			} catch (InputMismatchException e) {
				System.out.println("The age and height fields must be numeric.");
				sc.nextLine();
			}
		}
		
		sc.close();
	}
}
