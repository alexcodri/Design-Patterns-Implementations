package DPObserver;

import java.util.ArrayList;
import java.util.List;

public class GrupMesagerie implements Subject{
	
	private String numeGrup;
	private List<ITransmitereMesaj> utilizatoriGrup;

	public GrupMesagerie(String numeGrup) {
		super();
		this.numeGrup = numeGrup;
		this.utilizatoriGrup = new ArrayList<ITransmitereMesaj>();
	}

	@Override
	public void adaugaObserver(ITransmitereMesaj obs) {
		if(obs != null) {
			utilizatoriGrup.add(obs);
		}
	}

	@Override
	public void stergeObserver(ITransmitereMesaj obs) {
		utilizatoriGrup.remove(obs);
	}

	@Override
	public void trimiteNotificare(String user, String mesaj) {
		for(ITransmitereMesaj utilizator: utilizatoriGrup) {
			utilizator.primireMesaj(user, mesaj);
		}
	}
}
