package modulo2.exercicio.mocks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroDeFaturas {

	private final RepositorioDeFaturas faturas;

	public FiltroDeFaturas(RepositorioDeFaturas faturas) {
		this.faturas = faturas;
	}
	
	public List<Fatura> filtra() {
		
		List<Fatura> filtradas = new ArrayList<Fatura>();
		
		for(Fatura fatura : faturas.todas()) {
			//primeiro if
			if (fatura.getValor() > 2000) 
				filtradas.add(fatura);
			//segundo if
			else if (fatura.getValor() < 2000 && fatura.getCliente().equals("MICROSOFT")) 
				filtradas.add(fatura);
			//terceiro if
			else if (fatura.getData().get(Calendar.YEAR) < 1999) 
				filtradas.add(fatura);
		}
		
		return filtradas;
	}
}
