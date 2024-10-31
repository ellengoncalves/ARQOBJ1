package programa;

import java.util.Scanner;

import entidades.ContaBancaria;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o número da conta: ");
        int n_conta = input.nextInt();
        conta.setNumeroConta(n_conta);

        System.out.print("Digite o nome do titular: ");
        String nome_titular = input.next();
        conta.setNomeTitular(nome_titular);

        System.out.print("Digite o saldo inicial: ");
        double saldo = input.nextDouble();
        conta.depositar(saldo);

        System.out.println("\nDados da conta cadastrada:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        System.out.print("\nDigite o valor do depósito: ");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("\nDados da conta após o depósito:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        System.out.print("\nDigite o valor do saque: ");
        double valorSaque = input.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("\nDados da conta após o saque:");
        System.out.printf("Conta: %d%nTitular: %s%nSaldo: R$ %.2f%n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        input.close();
    }
}
