package br.edu.ifsp.arqobj1.programa;

import br.edu.ifsp.arqobj1.entidades.Teste2;

public class Main {

	public static void main(String[] args) {
		
		// métodos estáticos: são atributos ou métodos que não precisam ser instanciados 
		// a partir de um objeto, ou seja, não precisam da existência de um objeto para serem chamados
		// sendo assim, métodos estáticos (como 'main') só conseguem chamar outros métodos estáticos,
		// sem que um objeto seja instanciado
		// esses tipos de métodos não conseguem manipular os dados diretamente de uma classe
		// 'private static int INCREMENTO' não está mais relacionado ao objeto em si, a partir dessa
		// instancia, todos os objetos terão o mesmo valor de incremento, como uma variável global/compartilhada
		
		// método não estático/de instancia: métodos chamados quando cria-se um objeto
		// esses métodos n-estáticos conseguem acessar varáveis de instancia estáticas
		
		
		System.out.printf("->> criação de método estáticos pré-definidos:\n");
		double raiz = Math.sqrt(4);
		System.out.printf("raiz = %.1f\n", raiz);
		
		double minimo = Math.min(2.3, 12.7);
		System.out.printf("minimo = %.1f\n\n\n", minimo);
		
		
		// não necessita de instanciação do objeto
		System.out.printf("->> chamada do meu próprio método estático:\n");
		Teste2.metodoEstatico();
		
		
		System.out.printf("\n\n");
		
		
		// aqui, a variável INCREMENTO virou "global" então seu valor agora é o último atribuído
		System.out.printf("->> variável INCREMENTO como estática:\n");
		// constante local
		final int LIMITE = 5;
				
		Teste2 t1 = new Teste2(10);
		Teste2 t2 = new Teste2(5);
		
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
