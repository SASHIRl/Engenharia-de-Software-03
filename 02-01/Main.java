import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Manga", 42.00);
		Produto p2 = new Produto("Maçã", 00.01);
		Produto p3 = new Produto("Banana", 10.00);
		
		ArrayList<Item> ListaItens1 = new ArrayList<Item>();
		ArrayList<Item> ListaItens2 = new ArrayList<Item>();
		
		Item i1 = new Item(p1, 2);
		Item i2 = new Item(p2, 4);
		
		ListaItens1.add(i1);
		ListaItens2.add(i2);
		
		Venda v1 = new Venda(1, LocalDate.now(), ListaItens1);
		Venda v2 = new Venda(2, LocalDate.now(), ListaItens2);
		
		Item i3 = new Item(p3, 4);
		
		System.out.println("Primeira venda, código: " + v1.getCodigo() + " // Data: " + v1.getData() + " // Itens: " + i1.getProduto().getDescricao() + " // Quantidade: " + i1.getQuantidade());
		System.out.println("Valor total: " + i1.getValor());
		System.out.println("Segunda venda, código: " + v2.getCodigo() + " // Data: " + v2.getData() + " // Itens: " + i2.getProduto().getDescricao() + " // Quantidade: " + i2.getQuantidade());
		System.out.println("Valor total: " + i2.getValor());
		
		System.out.println("Adicionando um novo item na venda 1");
		ListaItens1.add(i3);
		System.out.println(v1);
	}
}
