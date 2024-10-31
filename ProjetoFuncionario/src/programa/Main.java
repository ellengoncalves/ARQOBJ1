/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do 
 * funcionário: nome e salário líquido (salário bruto descontado o imposto).  Depois, aumentar o salário bruto do funcionário 
 * com base em uma porcentagem fornecida e mostrar novamente os dados do funcionário */

package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		// Instanciando um funcionário
		Funcionario f = new Funcionario();
		
		System.out.printf("Nome: ");
		f.setNome(input.nextLine());
		
		System.out.printf("Salário bruto: ");
		f.setSalarioBruto(input.nextDouble());
		
		System.out.printf("Imposto: ");
		f.setImposto(input.nextDouble());
		
		System.out.printf("\n");
		
		System.out.println("---------- DADOS ----------");
		System.out.println("Nome: " + f.getNome());
		System.out.printf("Salário líquido: R$ %.2f\n", f.calcularSalarioLiquido());
		
		System.out.printf("\n");
		
		System.out.printf("Forneça a porcentagem de aumento sob o salário bruto: ");
		int porcentagem = input.nextInt();
		f.aumentarSalarioBruto(porcentagem);
		
		System.out.printf("\n");
		
		System.out.printf("---------- DADOS DO FUNCIONARIO ----------\n");
		System.out.println("Nome: " + f.getNome());
		System.out.printf("Salário líquido: R$ %.2f\n", f.calcularSalarioLiquido());
		
		input.close();
	}
}