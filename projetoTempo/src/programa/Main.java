package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Tempo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		// instanciando um objeto da classe Tempo
		Tempo t = new Tempo (); // construtor da classe Tempo
		
		// ler os valores de entrada
		int hora = input.nextInt();
		int minuto = input.nextInt();
		int segundo = input.nextInt();
		
		// modificando atributos com métodos setters
		t.setHora(hora);
		t.setMinuto(minuto);
		t.setSegundo(segundo);
			
		// exibir os atributos com métodos getters
		System.out.println("Hora = " + t.getHora());
		System.out.println("Minuto = " + t.getMinuto());
		System.out.println("Segundo = " + t.getSegundo());
		
		// método público para mostrar o horário completo
		// t1.exibir();
		
		input.close();
	
	}
}

