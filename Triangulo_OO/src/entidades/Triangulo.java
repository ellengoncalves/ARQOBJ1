// pacote para organizar as classes que representam tipos de dados
package entidades;

public class Triangulo {

	// atributos ou variáveis de instância
	public double a;
	public double b;
	public double c;

	// método para calcular a área
	public double area() {
		double p, area;
		
		p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return area;
	}
	
	// método para calcular o perímetro
	public double perimetro() {
		double perimetro;
		
		perimetro = a + b + c;
		
		return perimetro;
	}

}


