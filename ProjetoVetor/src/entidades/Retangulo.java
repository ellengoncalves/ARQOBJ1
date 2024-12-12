package entidades;

public class Retangulo {

	private double altura; // altura
	private double largura; // largura
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double area() {
		double area;

		area = altura * largura;

		return area;
	}

	public double perimetro() {
		double perimetro;

		perimetro = 2 * (altura + largura);

		return perimetro;
	}

	@Override
	public String toString() {
		return "Retangulo [altura = " + altura + ", largura = " + largura + "]";
	}
}