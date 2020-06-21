package DPStrategy;

public class Student implements IStudent{
	private String numeStudent;
	private TipExamen examen;

	public Student(String numeStudent) {
		super();
		this.numeStudent = numeStudent;
	}

	public TipExamen getExamen() {
		return examen;
	}

	public void setExamen(TipExamen examen) {
		this.examen = examen;
	}

	@Override
	public void sustineExamen(String disciplina) {
		examen.sustineExamen(numeStudent, disciplina);
	}

}
