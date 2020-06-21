package DPCommand;

import java.util.ArrayList;

public class Sistem {
	ArrayList<IGlovo> comenzi;
	public Sistem() {
		comenzi = new ArrayList<IGlovo>();
		
	}
	
	public void preiaComanda(IGlovo comanda) {
		if(comanda != null) {
			comenzi.add(comanda);
		}
	}
	
	public void livreazaComenzi() {
		for(IGlovo comanda : comenzi) {
			comanda.getListaCumparaturi("ardei, capia, blabla");
		}
		comenzi.removeAll(comenzi);
	}
}
