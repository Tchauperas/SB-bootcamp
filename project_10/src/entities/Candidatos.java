package entities;

public class Candidatos {
	
	private String nome;
	private double salario;
	
	public Candidatos() {}

	public Candidatos(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
}
