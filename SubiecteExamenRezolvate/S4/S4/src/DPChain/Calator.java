package DPChain;

public class Calator implements ICalator{
	private String numeCalator;
	
	public Calator(String numeCalator) {
		super();
		this.numeCalator = numeCalator;
	}

	@Override
	public void deplaseaza(int numarKm) {
		System.out.println(numeCalator + " se deplaseaza " + numarKm + "km");
	}

}
