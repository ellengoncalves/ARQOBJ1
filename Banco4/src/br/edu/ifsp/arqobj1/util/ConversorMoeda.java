package br.edu.ifsp.arqobj1.util;

public class ConversorMoeda {
	
	//
	public static double taxa_iof = 0.438;
	
	// método estático, ou seja, não pode ser instanciado
	public static double converter(double dolares, double cotacao) {
		if (dolares <= 0 || cotacao <= 0) {
            throw new IllegalArgumentException("Os valores de dólares e cotação devem ser positivos.");
        }
		return (dolares * cotacao) + (((dolares * cotacao) * taxa_iof) / 10);
	}
}
