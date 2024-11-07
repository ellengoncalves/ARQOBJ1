package br.edu.ifsp.arqobj1.programa;

import br.edu.ifsp.arqobj1.entidades.Teste;

public class Main {

	public static void main(String[] args) {
		
		// constante local
		final int LIMITE = 5;
		
		// inicializa a constante com o parâmetro do construtor
		Teste t1 = new Teste(10);
		Teste t2 = new Teste(5);
		
		System.out.println("valor do incremento t1 = " + t1.getINCREMENTO());
		System.out.println("valor do incremento t2 = " + t2.getINCREMENTO());
		
		for(int i = 0; i < LIMITE; i++) {
			t1.incrementar();
			t2.incrementar();
			System.out.println("soma parcial t1 = " + t1.getSoma());
			System.out.println("soma parcial t2 = " + t2.getSoma() + "\n");
		}
		
		System.out.println("soma final t1 = " + t1.getSoma());
		System.out.println("soma final t2 = " + t2.getSoma());
	}

}
