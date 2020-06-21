package main;

import DPStrategy.ExamenGrila;
import DPStrategy.ExamenOral;
import DPStrategy.ExamenPractic;
import DPStrategy.Student;

public class MainStrategy {

	public static void main(String[] args) {
		Student student = new Student("Mirel");
		
		student.setExamen(new ExamenOral());
		student.sustineExamen("Matematica");
		
		student.setExamen(new ExamenPractic());
		student.sustineExamen("Android");
		
		student.setExamen(new ExamenGrila());
		student.sustineExamen("Economie");
	}

}
