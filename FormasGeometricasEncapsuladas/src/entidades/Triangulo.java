package entidades;

public class Triangulo {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double area() {
		double p, area;
		
		p = (ladoA + ladoB + ladoC) / 2.0;
		area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
		
		return area;
	}
	
	public double perimetro() {
		double perimetro;
		
		perimetro = ladoA + ladoB + ladoC;
		
		return perimetro;
	}

}
