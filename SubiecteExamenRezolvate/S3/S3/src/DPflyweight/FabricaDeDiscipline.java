package DPflyweight;

import java.util.HashMap;

public class FabricaDeDiscipline {
	private HashMap<Integer, IDisciplina> listaDiscipline;
	
	public FabricaDeDiscipline() {
		listaDiscipline = new HashMap<Integer, IDisciplina>();
	}
	
	public int getNumarDiscipline() {
		return listaDiscipline.size();
	}
	
	public IDisciplina getDisciplina(int nrCredite, String disc) {
		IDisciplina disciplina = listaDiscipline.get(nrCredite);
		if(disciplina == null) {
			disciplina = new Disciplina(nrCredite, disc);
			listaDiscipline.put(nrCredite, disciplina);
		}
		return disciplina;
	}
}
