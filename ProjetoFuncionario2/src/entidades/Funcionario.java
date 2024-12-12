package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Funcionario {
	private String nome;
	private Double salarioBruto;
	private Double imposto;
	private Long id;
	private LocalDate dataNasc;
	
	public String getNome() {
		return nome;
	}
	public Double getSalarioBruto() {
		return salarioBruto;
	}
	public Double getImposto() {
		return imposto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getSalarioLiquido() {
		return this.salarioBruto * (1 - this.imposto/100);
	}
	
	public void aumentarSalarioBruto(double porcentagem) {
		this.salarioBruto += this.salarioBruto * porcentagem/100;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return 	"ID = " + this.id + "\n" + 
				"Nome = " + this.nome + "\n" + 
				"Data de nascimento = " + this.dataNasc.format(dtf);
	}
	
	public String getSobrenome() {
		int posicaoUltimoEspaco = nome.lastIndexOf(" ");
		return nome.substring(posicaoUltimoEspaco + 1);
	}
	
	public Long getId() {
		return id;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public int getIdade() {
		Period p = Period.between(dataNasc, LocalDate.now());
		return p.getYears();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(id, other.id);
	}
}