package br.edu.ifsp.arqobj1.entidades;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		validar(nota1);
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		validar(nota2);
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		validar(nota3);
		this.nota3 = nota3;
	}
	
	public boolean validar(double nota) {

		if(nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Nota inválida!");
		}
		
		return true;
	
	}
	
	public double calcularNotaFinal(double nota1, double nota2, double nota3) {
		return ((nota1 * 30) + (nota2 * 35) + (nota3 * 35)) / 100;
	}
	
}
