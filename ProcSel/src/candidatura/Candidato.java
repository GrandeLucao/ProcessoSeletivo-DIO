package candidatura;

public class Candidato {
	private String nome;
	private double salario;

	public Candidato(String nome, double sal) {
		this.nome = nome;
		this.salario = sal;

	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

}
