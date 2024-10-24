package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// criando um objeto da classe Produto
		Produto p = new Produto();
		
		// lendo dados da entrada
		System.out.println("Digite dados do produto: ");
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		p.quantidade = sc.nextInt();
		
		// mostrando dados do produto
		System.out.println();
		System.out.println("Dados do produto: ");
		p.mostrarDados();
		System.out.println();
		
		// adicionando unidades no estoque
		System.out.print("Digite a quantidade de unidades a serem adicionadas no estoque: ");
		int unidades = sc.nextInt();
		p.adicionarUnidades(unidades);
		System.out.println();
		
		System.out.println("Dados atualizados: ");
		p.mostrarDados();
		System.out.println();
		
		System.out.print("Digite a quantidade de unidades a serem removidas do estoque: ");
		unidades = sc.nextInt();
		p.removerUnidades(unidades);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		p.mostrarDados();		
		
		sc.close();

	}

}
