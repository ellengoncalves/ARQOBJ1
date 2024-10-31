package entidades;

//classe Tempo mantém horário no formato de 24 horas
public class Tempo {
	
	// atributos privados
	private int hora = 10; 	  // 0 - 23
	private int minuto = 10;  // 0 - 59
	private int segundo = 10; // 0 - 59	
	
	// construtor customizado
	//                  parâmetros de entrada
	public Tempo(int hora, int minuto, int segundo) {
		// variáveis de instância
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23)
			this.hora = hora;
		else
			throw new IllegalArgumentException("Hora inválida");
	}

	public void setMinuto(int minuto) {
		if (validar(minuto))
			this.minuto = minuto;
		else
			throw new IllegalArgumentException("Minuto inválido");
	}
	public void setSegundo(int segundo) {
		if (validar(segundo))
			this.segundo = segundo;
		else throw new IllegalArgumentException("Segundo inválido");
	}

	// método público
	public void exibir() {
		System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}
	
	// método privado para validação
	private boolean validar(int valor) {
		if (valor >= 0 && valor <= 59)
			return true;
		return false;	
	}
	
	
}