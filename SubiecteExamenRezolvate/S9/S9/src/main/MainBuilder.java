package main;

import DPBuilder.Director;
import DPBuilder.TipUtilizator;
import DPBuilder.Utilizator;

public class MainBuilder {

	public static void main(String[] args) {
		Utilizator u1 = new Utilizator.UtilizatorBuilder("Mihai", "Serban", TipUtilizator.Student).setFacultate("CSIE").setGen("Masculin").setVarsta(21).setGrupa(1076).setCursulCoordonat("N/A").build();
		Utilizator u2 = new Utilizator.UtilizatorBuilder("Anghel", "Marian", TipUtilizator.Profesor).setFacultate("CSIE").setGen("Masculin").setVarsta(42).setCursulCoordonat("SO").setGrupa(0).build();
		Utilizator u3 = Director.buildStudentPredefinit("Dumitru", "George", TipUtilizator.Student);
		Utilizator u4 = Director.buildProfesorPredefinit("Ana", "Blandian", TipUtilizator.Profesor);
		
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		System.out.println(u4.toString());
	}

}
