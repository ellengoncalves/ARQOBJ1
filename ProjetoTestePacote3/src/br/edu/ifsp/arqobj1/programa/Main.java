package br.edu.ifsp.arqobj1.programa;

import br.edu.ifsp.arqobj1.entidades.Teste3;

public class Main {

	public static void main(String[] args) {
		
		// agora o valor do INCREMENTO não muda e fica visível para todos da classe
		System.out.printf("->> variável INCREMENTO como constante (final) e estática (static):\n");
		// constante local
		final int LIMITE = 10;
				
		Teste3 t1 = new Teste3();
		Teste3 t2 = new Teste3();
		
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
