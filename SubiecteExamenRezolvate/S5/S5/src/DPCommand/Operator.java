package DPCommand;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<Comanda> comenzi;

	public Operator() {
		super();
		comenzi = new ArrayList<Comanda>();
	}
	
	public void incarcaComanda(Comanda comanda) {
		if(comanda != null) {
			comenzi.add(comanda);
		}
	}
	
	public void proceseazaComenzi() {
		for(Comanda comanda : comenzi) {
			comanda.executa();
		}
		comenzi.removeAll(comenzi);
	}
}
