package programa;

import entidades.Tempo2;

public class Main {

	public static void main(String[] args) {
		
		// instanciando um objeto da classe Tempo
		Tempo2 t1 = new Tempo2(); // construtor sem parâmetros
		Tempo2 t2 = new Tempo2(10); // constutor hora
		Tempo2 t3 = new Tempo2(10, 4); // construtor hora min
		Tempo2 t4 = new Tempo2(10, 4, 25); // construtor completo
		
		t1.exibir();
		t2.exibir();
		t3.exibir();
		t4.exibir();
		
		// uso de métodos setters
		t1.setHora(10);
		t1.setMinuto(30);
		t1.setSegundo(40);
		
		// uso de métodos getters
		System.out.println("Hora = " + t1.getHora());
		System.out.println("Minuto = " + t1.getMinuto());
		System.out.println("Segundo = " + t1.getSegundo());
		
		// método público para mostrar o horário completo
		t1.exibir();		
		
	}

}
