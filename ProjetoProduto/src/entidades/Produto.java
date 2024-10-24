package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public void mostrarDados() {
		System.out.println(
				nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: R$ "
				+ String.format("%.2f", preco * quantidade)
				);
	}
	
	public void adicionarUnidades(int unidades) {
		quantidade += unidades;
		
	}
	
	public void removerUnidades(int unidades) {
		quantidade -= unidades;
	}

}

