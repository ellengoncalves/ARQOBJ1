package br.edu.ifsp.arqobj1.entidades;

public class Teste3 {
	
	// variáveis de instância
	private final static int INCREMENTO = 10;
	private int soma = 0;
	
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
