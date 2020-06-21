package DPStrategy;

public class ExamenPractic implements TipExamen{

	@Override
	public void sustineExamen(String numeStudent, String disciplina) {
		System.out.println("Studentul " + numeStudent + " sustine examen practic la disciplina " + disciplina);
	}

}
