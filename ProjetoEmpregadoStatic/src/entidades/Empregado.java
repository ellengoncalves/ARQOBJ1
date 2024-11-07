package entidades;

public class Empregado {
	// variável estática para armazenar a contagem
	private static int count = 0;
	
	// variáveis de instância
	private String nome;
	private String sobrenome;
	
	// construtor
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		// atualizar a contagem
		count++;
		
		// exibir a contagem
		System.out.printf("Construtor de empregado: %s %s; contagem = %d%n", 
				this.nome, this.sobrenome, count);
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
			
	
}
