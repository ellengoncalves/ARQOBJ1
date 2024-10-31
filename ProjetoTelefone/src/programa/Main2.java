package programa;

import java.util.Scanner;

import entidades.Telefone;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Informe o código do país = ");
		int codigoPais = input.nextInt();
		
		System.out.printf("Informe o código de área = ");
		int codigoArea = input.nextInt();
		
		System.out.printf("Informe o número de telefone = ");
		int numeroTelefone = input.nextInt();
		
		Telefone t1 = new Telefone(codigoPais, codigoArea, numeroTelefone);
		System.out.println(t1);
	}
}
