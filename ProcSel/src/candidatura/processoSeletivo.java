package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
	
	public static Scanner scanner = new Scanner(System.in);
	public static List<String> candidatoName = new ArrayList<>();
	public static List<Double> candidatoSal = new ArrayList<>();
	public static Candidato candidato;
	static int numeroInscritos = 0;

	public static void main(String[] args) {
		numeroInscritos = inscritos();
		getCandidatos(numeroInscritos);
		imprimirSelecionados();
	}

	static void imprimirSelecionados() {
		for (int i = 0; i < candidatoName.size(); i++) {
			System.out.println("Nome: "+candidatoName.get(i)+", Salario: "+candidatoSal.get(i));
		}
	}

	static int inscritos() {
		System.out.println("Insira um numero de candidatos: ");
		int numInscritos=scanner.nextInt();
		return numInscritos;
	}

	static void getCandidatos(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Insira o nome do candidato "+(i+1)+":");
			String name=scanner.next();
			double salarioPretendido = valorPretendido();
			candidatoSal.add(salarioPretendido);
			candidatoName.add(name);
		}

	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

}
