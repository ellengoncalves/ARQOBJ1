import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// variáveis para as medidas de cada triângulo
		double xA, xB, xC, yA, yB, yC;

		// leitura das medidas
		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// calculando a área do triângulo X
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// calculando a área do triângulo Y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
