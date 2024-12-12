package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do(a) funcionário(a): ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o imposto: ");
		double imposto = sc.nextDouble();
		
		System.out.print("Digite o id: ");
		Long id = sc.nextLong();
			
		sc.nextLine();
		System.out.print("Digite a data de nascimento (DD/MM/YYYY): ");
		String dataNascString = sc.nextLine();
		
		// criando objeto de Funcionario
		Funcionario f1 = new Funcionario();
		f1.setNome(nome);
		f1.setSalarioBruto(salario);
		f1.setImposto(imposto); 
		f1.setId(id);
		
		// convertendo a data de nascimento de String para LocalDate
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNasc = LocalDate.parse(dataNascString, dtf);
		f1.setDataNasc(dataNasc);
		
		// mostrando dados do funcionário
	    System.out.println(f1);
		System.out.println("Sobrenome = " + f1.getSobrenome());
		
		// aumentando salário bruto
		//System.out.print("Digite a porcentagem de aumento do salário: ");
		//double aumento = sc.nextDouble();
		//f1.aumentarSalarioBruto(aumento);
		
		// mostrando dados do funcionário
		//System.out.println(f1);	
		
		// mostrando idade em anos
		System.out.println("Idade = " + f1.getIdade());
		
		// criando outro objeto de Funcionario: f2
		Funcionario f2 = new Funcionario();
		f2.setNome(nome);
		f2.setSalarioBruto(salario);
		f2.setImposto(imposto); 
		f2.setId(2l);
		f2.setDataNasc(dataNasc);
		
		System.out.println("\nFuncionário f1 = \n" + f1);
		System.out.println("\nFuncionário f2 = \n" + f2);
		
		if (f1.equals(f2)) 
			System.out.println("Funcionários f1 e f2 são iguais.");
		else
		    System.out.println("Funcionários f1 e f2 são diferentes.");
		
		sc.close();
	}
}