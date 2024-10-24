package entidades;

public class Retangulo {

	// atributos ou variáveis de instância
	public double a; // altura
	public double l; // largura

	// método para calcular a área
	public double area() {
		double area;

		area = a * l;

		return area;
	}

	// método para calcular o perímetro
	public double perimetro() {
		double perimetro;

		perimetro = 2 * (a + l);

		return perimetro;
	}

}
