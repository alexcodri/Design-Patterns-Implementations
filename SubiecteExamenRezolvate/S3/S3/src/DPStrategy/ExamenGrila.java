package DPStrategy;

public class ExamenGrila implements TipExamen{

	@Override
	public void sustineExamen(String numeStudent, String disciplina) {
		System.out.println("Studentul " + numeStudent + " sustine examen grila la disciplina " + disciplina);
	}

}

