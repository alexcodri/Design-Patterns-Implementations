package DPProxy;

public class ProcesareComanda implements IProcesareComenzi{
	private Client client;

	public ProcesareComanda(Client client) {
		super();
		this.client = client;
	}

	@Override
	public void procesareComanda(String detalii, int nrProduse, float valoareTotala) {
		System.out.println(client.toString() + ". Comanda: detalii: " + detalii + ", nr produse: " + nrProduse + ", valoare toatala: " + valoareTotala);
	}

}
