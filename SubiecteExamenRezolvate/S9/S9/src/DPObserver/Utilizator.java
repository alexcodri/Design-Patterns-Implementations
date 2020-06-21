package DPObserver;

public class Utilizator implements ITransmitereMesaj{
	private String numeUtilizator;
	
	public Utilizator(String numeUtilizator) {
		super();
		this.numeUtilizator = numeUtilizator;
	}
	
	

	public String getNumeUtilizator() {
		return numeUtilizator;
	}



	@Override
	public void primireMesaj(String user, String mesaj) {
		System.out.println(numeUtilizator + " a primit de la " + user + " urmatorul mesaj: " + mesaj);
	}

}
