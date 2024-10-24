// classe Tempo mantém horário no formato de 24 horas
package entidades;

public class Tempo {

	// atributos
	private int hora; // 0 - 23
	private int minuto; // 0 - 59
	private int segundo; // 0 - 59

	private boolean validar(int valor) {
		if (valor >= 0 && valor <= 59)
			return true;
		return false;
	}

	// método get -> tem a função de acessar os atributos de uma classe
	public int getHora() {
		return hora;
	}

	// método set -> tem a função de modificar os atributos de uma classe
	// validação de dados
	public void setHora(int hora) {
		// if sem chaves só funciona se for apenas uma linha de comando
		if (hora >= 0 && hora <= 23)
			this.hora = hora; // this serve para referenciar atributos dentro da classe
		else
			throw new IllegalArgumentException("Hora inválida");
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (validar(minuto))
			this.minuto = minuto;
		else
			throw new IllegalArgumentException("Minuto inválido");
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (validar(segundo))
			this.segundo = segundo;
		else
			throw new IllegalArgumentException("Segundo inválido");
	}

	// método público
	public void exibir() {
		System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}

}
