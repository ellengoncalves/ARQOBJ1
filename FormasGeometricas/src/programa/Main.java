package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// instanciação de objeto da classe Triangulo
		Triangulo x = new Triangulo();

		// instanciação de objeto da classe Retangulo
		Retangulo y = new Retangulo();

		// instanciação de objeto da classe Circulo
		Circulo z = new Circulo();

		// leitura das medidas
		System.out.println("Digite as medidas do triângulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do retângulo y: ");
		y.a = sc.nextDouble();
		y.l = sc.nextDouble();

		System.out.println("Digite o raio do círculo z: ");
		z.r = sc.nextDouble();

		// calculando a área do triângulo X
		double areaX = x.area();

		// calculando o perimetro do triângulo X
		double perimetroX = x.perimetro();

		// calculando a área do retângulo y
		double areaY = y.area();

		// calculando o perimetro do retângulo y
		double perimetroY = y.perimetro();

		// calculando a área do círculo z
		double areaZ = z.area();

		// calculando o perimetro do círculo z
		double perimetroZ = z.perimetro();

		// mostrando os resultados
		System.out.printf("Área do triângulo x = %.2f%n", areaX);
		System.out.printf("Perímetro do triângulo x = %.2f%n", perimetroX);
		System.out.printf("Área do retângulo y = %.2f%n", areaY);
		System.out.printf("Perímetro do retângulo y = %.2f%n", perimetroY);
		System.out.printf("Área do círculo z = %.2f%n", areaZ);
		System.out.printf("Perímetro do círculo z = %.2f%n", perimetroZ);

		sc.close();

	}

}
