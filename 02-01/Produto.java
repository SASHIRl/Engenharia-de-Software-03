	public class Produto {
	private String descricao;
	private Double valor;
	
	public Produto (String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public Double getvalor() {
		return valor;
	}
	public String toString() {
		return "Produto: " + this.descricao + " Valor: " + this.valor;
	}
}
