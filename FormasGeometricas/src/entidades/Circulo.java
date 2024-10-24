package entidades;

public class Circulo {

	// atributos ou variáveis de instância
	public double r; // raio

	// método para calcular a área
	public double area() {
		double area;

		area = Math.PI * r * r;

		return area;
	}

	// método para calcular o perímetro
	public double perimetro() {
		double perimetro;

		perimetro = 2 * Math.PI * r;

		return perimetro;
	}

}
