package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> alunos = new ArrayList<String>();
		System.out.print("Quantos alunos seram registrados? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.print("Nome do aluno: ");
			String aluno = sc.nextLine();
			alunos.add(aluno);
		}
		
		for(String aluno: alunos) {
			System.out.println(aluno);
		}
				
		sc.close();
	}
}
