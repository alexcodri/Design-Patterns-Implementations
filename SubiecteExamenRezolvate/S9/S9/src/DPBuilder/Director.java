package DPBuilder;

import DPBuilder.Utilizator.UtilizatorBuilder;

public class Director {	
	public static Utilizator buildStudentPredefinit(String nume,String prenume, TipUtilizator tip) {
		if(tip == TipUtilizator.Student) {
			return new UtilizatorBuilder(nume, prenume, tip).setVarsta(18).setGen("Masculin").setGrupa(1000).setFacultate("CSIE").setCursulCoordonat("N/A").build();
		} 
		return null;	
	}

	public static Utilizator buildProfesorPredefinit(String nume,String prenume, TipUtilizator tip) {
		if(tip == TipUtilizator.Profesor) {
			return new UtilizatorBuilder(nume, prenume, tip).setVarsta(30).setGen("Masculin").setGrupa(0).setFacultate("CSIE").setCursulCoordonat("CTS").build();
		} 
		return null;
	}
}
