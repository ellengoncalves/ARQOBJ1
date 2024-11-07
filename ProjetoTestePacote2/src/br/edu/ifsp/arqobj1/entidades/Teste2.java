package br.edu.ifsp.arqobj1.entidades;

public class Teste2 {
	
	// variáveis de instância
	private static int INCREMENTO;
	private int soma = 0;
	
	// constante inicializada no construtor
	public Teste2(int incremento) {
		INCREMENTO = incremento;
	}
	
	public void incrementar() {
		soma += INCREMENTO;
	}
	
	public int getSoma() {
		return this.soma;
	}
	
	public int getINCREMENTO() {
		return INCREMENTO;
	}
	
	public static void metodoEstatico() {
		System.out.println("Método estático executa "
				+ "sem precisar de um objeto instanciado");
	}
}
