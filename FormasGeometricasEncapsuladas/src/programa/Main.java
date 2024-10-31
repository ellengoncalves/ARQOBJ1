/* Considerando exercícios anteriores sobre as figuras geométricas (classes Triangulo, Retangulo e Circulo), faça modificações
 * nas classes para implementar o encapsulamento. Faça validação de dados: as medidas de todas figuras devem ser valores 
 * inteiros positivos. Por fim, escreva um programa na classe Main para instanciar um objeto de cada classe, atribuir valores
 * aos seus atributos, calcular a área e o perímetro. */

package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// instanciação de objeto da classe Triangulo
		Triangulo t = new Triangulo();

		// instanciação de objeto da classe Retangulo
		Retangulo r = new Retangulo();

		// instanciação de objeto da classe Circulo
		Circulo c = new Circulo();

		// leitura e atribuição das medidas
		System.out.println("Digite as medidas do triângulo x: ");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		
		t.setLadoA(lado1);
		t.setLadoB(lado2);
		t.setLadoC(lado3);

		System.out.println("Digite as medidas do retângulo y: ");
		double altura = sc.nextDouble();
		double largura = sc.nextDouble();
		
		r.setAltura(altura);
		r.setLargura(largura);
		
		System.out.println("Digite o raio do círculo z: ");
		double raio = sc.nextDouble();
		
		c.setRaio(raio);

		// calculos do triângulo t
		double areaT = t.area();
		double perimetroT = t.perimetro();

		// calculos do retângulo r
		double areaR = r.area();
		double perimetroR = r.perimetro();

		// calculos do círculo c
		double areaC = c.area();
		double perimetroC = c.perimetro();

		// mostrando os resultados
		System.out.printf("Área do triângulo x = %.2f%n", areaT);
		System.out.printf("Perímetro do triângulo x = %.2f%n", perimetroT);
		System.out.printf("Área do retângulo y = %.2f%n", areaR);
		System.out.printf("Perímetro do retângulo y = %.2f%n", perimetroR);
		System.out.printf("Área do círculo z = %.2f%n", areaC);
		System.out.printf("Perímetro do círculo z = %.2f%n", perimetroC);

		sc.close();

	}

}
