package DPCommand;

public class ComandaDeLivrat implements IGlovo {
	String numeClient;
	String magazinPreferat;
	Curier curier;

	public ComandaDeLivrat(String numeClient, String magazinPreferat, Curier curier) {
		super();
		this.numeClient = numeClient;
		this.magazinPreferat = magazinPreferat;
		this.curier = curier;
	}

	@Override
	public void getListaCumparaturi(String listaCumparaturi) {
		curier.livrareComanda(numeClient);
		System.out.println(this.toString() + " " + listaCumparaturi);
	}

	@Override
	public String toString() {
		return "ComandaDeLivrat [numeClient=" + numeClient + ", magazinPreferat=" + magazinPreferat + ", curier="
				+ curier + "]";
	}

	
}
