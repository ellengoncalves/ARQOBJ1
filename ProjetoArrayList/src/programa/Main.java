package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de "
				+ "valores a serem armazenados na lista: ");
		int n = sc.nextInt();
		
		List<Double> lista = new ArrayList<Double>();
		
		// adicionar elementos na lista
		for(int i = 0; i < n; i++) {
			lista.add(sc.nextDouble());
		}
		
		double soma = 0.0;
		
		// mostrar elementos da lista
		for(int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
			System.out.println(i+ " : " + lista.get(i));
		}
		
		System.out.printf("%n");
		
		// adicionar elementos no meio da lista
		lista.add(2, 100.0);
		lista.add(2, 100.0);
		
		// mostrar elementos da lista depois das adições
		for(int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
			System.out.println(i+ " : " + lista.get(i));
		}
		
		double pesoMedio = soma / lista.size();
		
		System.out.printf("Peso médio = %.1f%n", pesoMedio);
		
		sc.close();
	}

}
