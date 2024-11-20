package br.edu.ifsp.arqobj1.programa;

import java.util.Locale;
import java.util.Scanner;

import br.edu.ifsp.arqobj1.entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		// instanciando objetos
		ContaBancaria conta1 = new ContaBancaria(1234, "Ellen", 20);
		ContaBancaria conta2 = new ContaBancaria(5678, "Maria");
		
		// mostrando os dados de cada conta após a instanciação
		System.out.println("\nDados da conta 1 cadastrada:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta1.getConta(), conta1.getTitular(), conta1.getSaldo());
        
        System.out.println("\nDados da conta 2 cadastrada:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta2.getConta(), conta2.getTitular(), conta2.getSaldo());
		
        // deposito conta 1
        System.out.print("\nDigite o valor do depósito para conta 1: ");
        double deposito1 = input.nextDouble();
        conta1.depositar(deposito1);
        System.out.println("\nDados da conta 1 após o depósito:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta1.getConta(), conta1.getTitular(), conta1.getSaldo());

        // saque conta 1
        System.out.print("\nDigite o valor do saque para conta 1: ");
        double saque1 = input.nextDouble();
        conta1.sacar(saque1);
        System.out.println("\nDados da conta 1 após o saque:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta1.getConta(), conta1.getTitular(), conta1.getSaldo());
		
        // deposito conta 2
        System.out.print("\nDigite o valor do depósito para conta 2: ");
        double deposito2 = input.nextDouble();
        conta2.depositar(deposito2);
        System.out.println("\nDados da conta 2 após o depósito:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta2.getConta(), conta2.getTitular(), conta2.getSaldo());

        // saque conta 2
        System.out.print("\nDigite o valor do saque para conta 2: ");
        double saque2 = input.nextDouble();
        conta2.sacar(saque2);
        System.out.println("\nDados da conta 2 após o saque:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta2.getConta(), conta2.getTitular(), conta2.getSaldo());
	
        input.close();
	}
}