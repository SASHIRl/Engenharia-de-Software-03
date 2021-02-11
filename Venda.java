import java.time.LocalDate;
import java.util.List;

public class Venda {
	private Integer codigo;
	private LocalDate data;
	private List<Item> itens;
	
	public Venda(Integer codigo, LocalDate data, List<Item> itens) {
		this.codigo = codigo;
		this.data = LocalDate.now();
		this.itens = itens;
	}
	
	public Double valorTotal() {
		double valorTotal = 0.0;
		for (Item item: itens) {
			valorTotal += item.getValor();
		}
		return valorTotal;
	}
	
	public LocalDate getData() {
		return LocalDate.now();
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void addItem(Produto produto, Integer quantidade) {
		itens.addAll(itens);
	}
	public Integer qtdItens(Item itens) {
		return itens.getQuantidade();
	}
	public String toString() {
		return " Itens: " + this.itens;
	}
}
