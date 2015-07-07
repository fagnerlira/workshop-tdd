package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	//private List<Integer> items;

//	public GeradorDeSessoes() {
//		this.items = new ArrayList<Integer>();
//	}

	public List<Integer> gera(int inicio, int fim, int periocidade) {
	
//	public int[] gera(int inicio, int fim, int periodo) {
//		
//		int[] dias = new int[5];
//		dias[0]=1;
//		dias[1]=2;
//		dias[3]=3;
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i=inicio; i <= fim; i +=periocidade ){
			lista.add(i);
		}
		
		return lista;
	}

}
