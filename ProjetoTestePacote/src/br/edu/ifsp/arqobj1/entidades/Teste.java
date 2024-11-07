package br.edu.ifsp.arqobj1.entidades;

public class Teste {
	// private final int INCREMENTO = 10; ->inicializaçao no momento de declaração
	private final int INCREMENTO; /* atributo constante (padrão maiúsculo), onde o modificador 'final' 
										  indica que o valor não pode ser alterado depois de atrbuído*/
	private int soma = 0;
	
	// constante inicializada no construtor
	public Teste(int incremento) {
		INCREMENTO = incremento;
	}
	
	public void incrementar() {
		soma += INCREMENTO; // soma = soma + INCREMENTO
	}
	
	public int getSoma() {
		return this.soma;
	}
	
	public int getINCREMENTO() {
		return INCREMENTO;
	}
}
