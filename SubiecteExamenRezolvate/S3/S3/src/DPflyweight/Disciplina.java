package DPflyweight;

public class Disciplina implements IDisciplina{
	private int nrCredite;
	private String disciplina;
	
	public Disciplina(int nrCredite, String disciplina) {
		super();
		this.nrCredite = nrCredite;
		this.disciplina = disciplina;
	}

	@Override
	public void descriere(IStudent student) {
		System.out.println(this.toString() + " " + student.toString());
	}

	@Override
	public String toString() {
		return "Disciplina [nrCredite=" + nrCredite + ", disciplina=" + disciplina + "]";
	}
}
