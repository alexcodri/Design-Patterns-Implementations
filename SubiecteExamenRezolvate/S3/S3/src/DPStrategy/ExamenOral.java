package DPStrategy;

public class ExamenOral implements TipExamen{

	@Override
	public void sustineExamen(String numeStudent, String disciplina) {
		System.out.println("Studentul " + numeStudent + " sustine examen oral la disciplina " + disciplina);
	}

}
