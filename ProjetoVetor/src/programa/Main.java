package programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale .setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de "
				+ "valores a serem armazenados no vetor: ");
		int n = sc.nextInt();
		
		// declarando o vetor de pesos
		double[] vetor = new double[n];
		
		System.out.println("Digite os valores de peso: ");
		
		// armazenando valores no vetor
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		// acessando valores do vetor
		for(int i = 0; i < n; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
			soma += vetor[i];
		}
		
		double pesoMedio = soma/n;
		System.out.printf("Peso médio = %.2f%n", pesoMedio);

		sc.close();
	}

}
