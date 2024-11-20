package br.edu.ifsp.arqobj1.programa;

import java.util.Locale;
import java.util.Scanner;
import br.edu.ifsp.arqobj1.entidades.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		// instanciando um aluno
		Aluno aluno = new Aluno();
		
		// leitura dos dados desse aluno
		System.out.printf("Nome: ");
		String nome = input.nextLine();
		aluno.setNome(nome);
		System.out.printf("Nota 1: ");
		double nota1 = input.nextDouble();
		aluno.setNota1(nota1);
		System.out.printf("Nota 2: ");
		double nota2 = input.nextDouble();
		aluno.setNota2(nota2);
		System.out.printf("Nota 3: ");
		double nota3 = input.nextDouble();
		aluno.setNota3(nota3);
		
		// calculando nota final
		double notaFinal = aluno.calcularNotaFinal(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
		System.out.printf("Nota Final: %.1f\n", notaFinal);
		
		// aprovado ou reprovado?
		 
		if(notaFinal >= 6.0) {
			System.out.println("Você está aprovado!");
		}else {
			System.out.println("Você está reprovado....");
		}
		
		input.close();
		
	}

}
