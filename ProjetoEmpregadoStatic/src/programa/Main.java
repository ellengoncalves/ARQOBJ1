package programa;

import entidades.Empregado;

public class Main {

	public static void main(String[] args) {
		System.out.printf("Contagem antes da instanciação = %d%n", Empregado.getCount());
		
		Empregado e1 = new Empregado("Cristiane", "Yaguinuma");
		System.out.printf("Contagem = %d%n", Empregado.getCount());
		
		Empregado e2 = new Empregado("João", "Camargo");		
		System.out.printf("Contagem = %d%n", Empregado.getCount());

	}

}
