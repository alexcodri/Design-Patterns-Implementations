package main;

import DPflyweight.FabricaDeDiscipline;
import DPflyweight.IStudent;
import DPflyweight.Student;

public class MainFlyweight {

	public static void main(String[] args) {
		IStudent s1 = new Student("Student1");
		IStudent s2 = new Student("Student2");
		IStudent s3 = new Student("Student3");

		FabricaDeDiscipline fabrica = new FabricaDeDiscipline();
		
		fabrica.getDisciplina(1, "Mate").descriere(s1);
		fabrica.getDisciplina(1, "Info").descriere(s2);
		fabrica.getDisciplina(2, "Analiza").descriere(s3);
	}

}
