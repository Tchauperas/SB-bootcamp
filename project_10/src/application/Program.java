package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Candidatos;

public class Program {
	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Candidatos> candidatos = new ArrayList<>();
		System.out.print("Numero de candidatos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome do candidato: ");
			String nome = sc.nextLine();
			System.out.print("Pretenção salarial: ");
			double salario = sc.nextDouble();
			Candidatos candidato = new Candidatos(nome, salario);
			candidatos.add(candidato);
		}
		
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.println("Nome do candidato: " + candidatos.get(i).getNome());
			System.out.println("Pretenção salarial: " + candidatos.get(i).getSalario());
			System.out.print("Situação do candidato: ");
			analizandoCandidato(candidatos.get(i).getSalario());
		}
		
		System.out.println();
		System.out.println("Candidatos selecionados: ");
		for(int i = 0; i < n; i++) {
			if(candidatos.get(i).getSalario() < 2000) {
				System.out.println(candidatos.get(i).getNome());
			}
		}
		
		sc.close();
		
	}
	
	static void analizandoCandidato(double salarioPretendido) {
		double salarioBase = 2000;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if(salarioBase == salarioPretendido){
			System.out.println("Ligar para condidato com contra proposta");
		} else {
			System.out.println("Aguardando demais candidatos");
		}
	}
}
