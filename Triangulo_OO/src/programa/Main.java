package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		exemploTrianguloX();
		
		//exemploAreaTrianguloXY();
		
	}
	
	public static void exemploTrianguloX() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// instanciação de objeto da classe Triangulo
		Triangulo x = new Triangulo();
		
		// leitura das medidas
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		// calculando a área do triângulo X
		double areaX = x.area();

		// calculando o perimetro do triângulo X
		double perimetroX = x.perimetro();

		// mostrando os resultados
		System.out.printf("Área do triângulo X = %.2f%n", areaX);
		System.out.printf("Perímetro do triângulo X = %.2f%n", perimetroX);
		
		sc.close();
		
	}
	
	public static void exemploAreaTrianguloXY() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// instanciação de objetos da classe Triangulo
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		// leitura das medidas
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// calculando a área do triângulo X
		double areaX = x.area();

		// calculando a área do triângulo Y
		double areaY = y.area();

		// mostrando os resultados
		System.out.printf("Área do triângulo X = %.2f%n", areaX);
		System.out.printf("Área do triângulo Y = %.2f%n", areaY);

		// verificando a maior área
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();
	}

}

