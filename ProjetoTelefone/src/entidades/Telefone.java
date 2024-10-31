package entidades;

public class Telefone {
	private int codigo_internacional;
	private int codigo_area;
	private int numero_telefone;
	
	//sobrecarga de construtores:
	
	// construtor com 3 campos
	public Telefone(int codigo_internacional, int codigo_area, int numero_telefone) {
		this.codigo_internacional = codigo_internacional;
		this.codigo_area = codigo_area;
		this.numero_telefone = numero_telefone;
	}
	
	// construtor com 2 campos
	public Telefone(int codigo_area, int numero_telefone) {
		this.codigo_area = codigo_area;
		this.numero_telefone = numero_telefone;
		this.codigo_internacional = 55;
	}
	
	// construtor com 1 campo
	public Telefone(int numero_telefone) {
		this.numero_telefone = numero_telefone;
		this.codigo_internacional = 55;
		this.codigo_area = 16;
	}
	
	public int getCodigo_internacional() {
		return codigo_internacional;
	}
	
	public void setCodigo_internacional(int codigo_internacional) {
		this.codigo_internacional = codigo_internacional;
	}
	
	public int getCodigo_area() {
		return codigo_area;
	}
	
	public void setCodigo_area(int codigo_area) {
		this.codigo_area = codigo_area;
	}
	
	public int getNumero_telefone() {
		return numero_telefone;
	}
	
	public void setNumero_telefone(int numero_telefone) {
		this.numero_telefone = numero_telefone;
	}
	
	public void exibir() {
		System.out.printf("Número de telefone: +%d %d %d%n%n", codigo_internacional, codigo_area, numero_telefone, codigo_internacional, codigo_area, numero_telefone);
	}

	@Override
	public String toString() {
		return "+" + this.codigo_internacional + " (" + this.codigo_area + ") " + this.numero_telefone;
	}
}
