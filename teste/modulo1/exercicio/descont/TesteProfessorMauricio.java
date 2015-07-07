package modulo1.exercicio.descont;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modulo2.exercicio.tdd.sessoes.GeradorDeSessoes;

public class TesteProfessorMauricio {

	@Test
	public void intervaloDeUmDia(){
		
		int inicio =1;
		int fim =1;
		int periocidade=1;
		
		GeradorDeSessoes geradorDeSessoes = new GeradorDeSessoes();
		
		List<Integer> result  = geradorDeSessoes.gera(inicio, fim, periocidade);
		
		
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(1,	result.get(0).intValue());
		
		
	}
	
}
