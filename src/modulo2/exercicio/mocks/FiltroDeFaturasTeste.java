package modulo2.exercicio.mocks;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturasTeste {

	
	@Test
	public void TestePrimeiroIF() {

		Calendar data1 = new GregorianCalendar(2015, Calendar.MARCH,10);
		Calendar data2 = new GregorianCalendar(2015, Calendar.APRIL,20);
		
		Fatura fatura1 = new Fatura(data1, "Cliente"      , 2500);
		Fatura fatura2 = new Fatura(data2, "outroCliente" , 300);

		RepositorioDeFaturas dao = Mockito.mock(RepositorioDeFaturas.class);

		Mockito.when(dao.todas()).thenReturn(Arrays.asList(fatura1, fatura2));

		FiltroDeFaturas filtro = new FiltroDeFaturas(dao);

		List<Fatura> lista = filtro.filtra();

		Assert.assertEquals(1, lista.size());
		//0.0001 se nao passar o assertEquals ficara depreciado 
		Assert.assertEquals(2500, lista.get(0).getValor(), 0.0001);

	}

	
	
	
	
	@Test
	public void TesteSegundoIF() {

		Calendar data1 = new GregorianCalendar(2015, Calendar.MARCH,10);
		Calendar data2 = new GregorianCalendar(2015, Calendar.APRIL,20);
		
		Fatura fatura1 = new Fatura(data1, "Cliente"      , 100);
		Fatura fatura2 = new Fatura(data2, "MICROSOFT" , 300);

		RepositorioDeFaturas dao = Mockito.mock(RepositorioDeFaturas.class);

		Mockito.when(dao.todas()).thenReturn(Arrays.asList(fatura1, fatura2));

		FiltroDeFaturas filtro = new FiltroDeFaturas(dao);

		List<Fatura> lista = filtro.filtra();

		Assert.assertEquals(1, lista.size());
		//0.0001 se nao passar o assertEquals ficara depreciado 
		Assert.assertEquals(300, lista.get(0).getValor(), 0.0001);

	}
	
	
	@Test
	public void TesteTerceiroIF() {

		Calendar data1 = new GregorianCalendar(1998, Calendar.MARCH,10);
		Calendar data2 = new GregorianCalendar(2015, Calendar.APRIL,20);
		
		Fatura fatura1 = new Fatura(data1, "Cliente"      , 2500);
		Fatura fatura2 = new Fatura(data2, "outroCliente" , 300);

		RepositorioDeFaturas dao = Mockito.mock(RepositorioDeFaturas.class);

		Mockito.when(dao.todas()).thenReturn(Arrays.asList(fatura1, fatura2));

		FiltroDeFaturas filtro = new FiltroDeFaturas(dao);

		List<Fatura> lista = filtro.filtra();

		Assert.assertEquals(1, lista.size()); 
		//getData().get(Calendar.YEAR)
		
		Assert.assertEquals(1998, lista.get(0).getData().get(Calendar.YEAR));
		
		

	}

	

}
