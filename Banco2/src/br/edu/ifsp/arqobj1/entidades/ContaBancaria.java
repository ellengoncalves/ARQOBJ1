package br.edu.ifsp.arqobj1.entidades;

public class ContaBancaria {
	private int conta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public ContaBancaria(int conta, String titular, double deposito_inicial) {
		this.conta = conta;
		this.titular = titular;
		this.saldo += deposito_inicial;
	}
	
	public int getConta() {
		return conta;
	}

	// numero da conta não pode ser alterado livremente, apenas será alterado ao instanciar um novo objeto
	private void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	// o saldo não pode ser mudado livremente, o saldo só aumenta por meio de depósitos e diminui por meio de saques
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
		saldo += valor;
		System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
		System.out.printf("Saldo atual: %.2f\n", saldo);
	}
	
	public void sacar(double valor) {
		if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
		
		if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
		saldo -= valor + 5.0;
		System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
		System.out.printf("Saldo atual: %.2f\n", saldo);
	}
}
