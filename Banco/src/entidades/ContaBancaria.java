package entidades;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeTitular;
    
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
    }
}
