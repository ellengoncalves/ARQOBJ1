package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class MainRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de "
				+ "retângulos a serem armazenados no vetor: ");

		int n = sc.nextInt();
		
		// declarando o vetor de Retangulo, do tipo referência
		Retangulo[] vetor = new Retangulo[n];
		
		// instanciar objetos de Retangulo e armazená-los no vetor
		// adicionando objetos no vetor
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do retângulo " + (i+1));
			System.out.println("Digite o comprimento: ");
			double comprimento = sc.nextDouble();
			sc.nextLine();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Retangulo(comprimento, altura);
		}
		
		double areaTotal = 0.0;
		/* acessando objetos o vetor e invocando método para calcular área
		for(int i = 0; i < n; i++) {
			System.out.println(vetor[i]);
			areaTotal += vetor[i].area();
		}*/
		
		// for each -> percorre o vetor
		for(Retangulo r : vetor) {
			System.out.println(r);
			areaTotal += r.area();
		}
		
		double areaMedia = areaTotal / n;
		
		System.out.printf("Área média = %.2f%n", areaMedia);
		
		sc.close();
	}

}