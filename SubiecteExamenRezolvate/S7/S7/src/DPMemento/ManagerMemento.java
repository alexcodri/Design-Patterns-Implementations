package DPMemento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerMemento {
	private List<MementoImagineBitmap> lista = new ArrayList<MementoImagineBitmap>();
	
	public void adaugaMemento(MementoImagineBitmap mem) {
		lista.add(mem);
	}
	
	public MementoImagineBitmap getMemento(Date date) {
		for(MementoImagineBitmap mem : lista) {
			if(date.equals(mem.getDataSalvare())) {
				return mem;
			} 
		}
		return null;
	}
	
	public MementoImagineBitmap getFirstMemento() {
		if(lista.size() > 0) {
			return lista.get(0);
		}
		return null;
	}
	
	public void seeAll() {
		for(MementoImagineBitmap mem : lista) {
			System.out.println(mem.toString());
		}
	}
}
