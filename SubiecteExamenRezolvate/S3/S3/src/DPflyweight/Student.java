package DPflyweight;

public class Student implements IStudent{
	private String nume;

	public Student(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void sustineExamen(String disciplina) {
		System.out.println(nume + " sustine examen la disciplina " + disciplina);
	}

	@Override
	public String toString() {
		return "Student [nume=" + nume + "]";
	}
	
}
