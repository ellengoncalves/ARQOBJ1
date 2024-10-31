package entidades;

public class Circulo {

	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area() {
		double area;

		area = Math.PI * (raio * raio);

		return area;
	}

	public double perimetro() {
		double perimetro;

		perimetro = 2 * Math.PI * raio;

		return perimetro;
	}

}
