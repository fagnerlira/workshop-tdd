package modulo1.exercicio.descont;

import java.util.Arrays;

import modulo1.exercicio.desconto.AplicadorDeDescontos;
import modulo1.exercicio.desconto.Compra;
import modulo1.exercicio.desconto.Item;

import org.junit.Assert;
import org.junit.Test;

public class AplicadorDeDescontosTeste {

	@Test
	public void macbokEIphoneTemDesconto() {

		Item item1 = new Item("MACBOOK", 1, 3000);
		Item item2 = new Item("IPHONE", 1, 1500);

		Compra compra = new Compra(Arrays.asList(item1, item2));

		AplicadorDeDescontos aplicadorDeDescontos = new AplicadorDeDescontos();

		aplicadorDeDescontos.aplica(compra);

		Assert.assertEquals((3000+1500) * 0.85, compra.getValorLiquido(),
				0.0001);
	}
	
	
	@Test
	public void notebookEWindowsPhoneTemDesconto() {

		Item item1 = new Item("NOTEBOOK", 1, 3500);
		Item item2 = new Item("WINDOWS PHONE", 1, 1500);

		Compra compra = new Compra(Arrays.asList(item1, item2));

		AplicadorDeDescontos aplicadorDeDescontos = new AplicadorDeDescontos();

		aplicadorDeDescontos.aplica(compra);

		// 0.88 e a diferenca de = 100 - 0.12 = 0.88
		//0.12 da classe AplicadorDeDescontos metodo descontoPorProduto linha 17 
		Assert.assertEquals((3500+1500)*0.88, compra.getValorLiquido(),
				0.0001);
	}

	@Test
	public void testeComCompraBuilder(){
		
		Compra compra = new CompraBuilder().com("NOTEBOOK",3500).com("WINDOWS PHONE", 1500).constroi();
		
		AplicadorDeDescontos aplicadorDeDescontos = new AplicadorDeDescontos();
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals((3500+1500)*0.88, compra.getValorLiquido(),
				0.0001);
	}
	
	
}
