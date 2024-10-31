package programa;

import entidades.Telefone;

public class Main {

	public static void main(String[] args) {
		
		// inicializando telefone 1 
		// codigo internacional do Paraguai
		// codigo de área da cidade de Assunção - Paraguai
		// numero de telefone aleatorio
		Telefone t1 = new Telefone(595, 21, 998765432);
		
		// inicializando telefone 2
		// codigo internacional padrão = 55
		// codigo de área de São Paulo
		// numero de telefone aleatório
		Telefone t2 = new Telefone(11, 994396217);
		
		// inicializando telefone 3
		// codigo internacional padrão = 55
		// codigo de área padrão = 16
		// numero de telefone aleatorio
		Telefone t3 = new Telefone(996295711);
		
		t1.exibir();
		t2.exibir();
		t3.exibir();
	}

}
