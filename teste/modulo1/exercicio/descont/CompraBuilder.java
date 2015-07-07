package modulo1.exercicio.descont;

import java.util.ArrayList;
import java.util.List;

import modulo1.exercicio.desconto.Compra;
import modulo1.exercicio.desconto.Item;

public class CompraBuilder {

	private List<Item> items;

	public CompraBuilder() {
		this.items = new ArrayList<Item>();
	}

	public CompraBuilder com(String nome, double valor) {
		Item item = new Item(nome, 1, valor);

		items.add(item);
		return this;
	}

	public Compra constroi() {
		return new Compra(this.items);
	}
}
