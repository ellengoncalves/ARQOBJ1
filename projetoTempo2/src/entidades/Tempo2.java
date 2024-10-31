package entidades;

public class Tempo2 {

	// atributos privados
	private int hora; 	 // 0 - 23
	private int minuto;  // 0 - 59
	private int segundo; // 0 - 59

	// construtor com 1 parâmetro: hora
	public Tempo2(int hora) {

		if (validar('h', hora)) {
			this.hora = hora;
		}
		// demais atributos serão inicializados com valor padrão para variáveis do tipo int: 0
	}

	// construtor com 2 parâmetros: hora e minuto
	public Tempo2(int hora, int minuto) {

		if (validar('h', hora) && validar('m', minuto)) {
			this.hora = hora;
			this.minuto = minuto;
		}
		// segundo será inicializado com valor padrão para variáveis do tipo int: 0
	}

	// construtor com 3 parâmetros: hora, minuto e segundo
	public Tempo2(int hora, int minuto, int segundo) {

		if (validar('h', hora) && validar('m', minuto) && validar('s', segundo)) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
	}

	// construtor padrão
	// tem que declarar explicitamente (se desejar) porque existe pelo menos um construtor customizado
	public Tempo2() {
		// todos atributos serão inicializados com valor padrão para variáveis do tipo int: 0
	} 

	// métodos getters
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}

	// métodos setters com validação
	public void setHora(int hora) {

		if (validar('h', hora)) {
			this.hora = hora;
		}

	}

	public void setMinuto(int minuto) {

		if (validar('m', minuto)) {
			this.minuto = minuto;
		}

	}
	public void setSegundo(int segundo) {

		if (validar('s', segundo)) {
			this.segundo = segundo;
		}

	}

	// método para exibir tempo no formato hh:mm:ss
	public void exibir() {
		System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}

	// método privado para validar valores dos atributos
	private boolean validar(char tipo, int valor) {

		switch (tipo) {
		case 'h':
			if (valor < 0 || valor > 23)
				throw new IllegalArgumentException("Hora inválida");
			break;
		case 'm':
			if (valor < 0 || valor > 59)
				throw new IllegalArgumentException("Minuto inválido");
			break;
		case 's':
			if (valor < 0 || valor > 59)
				throw new IllegalArgumentException("Segundo inválido");
			break;
		default: 
			throw new IllegalArgumentException("Opção inválida");
		}

		return true;		
	}

}
