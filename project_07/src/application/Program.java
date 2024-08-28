package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite suas duas notas:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double med = (n1 + n2) / 2;
		
		String media = med >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media);
		
		sc.close();
	}
}
