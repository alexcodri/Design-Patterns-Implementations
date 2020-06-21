package DPProxy;

public class ProxyProcesareComenzi implements IProcesareComenzi{
	private ProcesareComanda comanda;

	public ProxyProcesareComenzi(ProcesareComanda comanda) {
		super();
		this.comanda = comanda;
	}
	
	 public ProxyProcesareComenzi(Client client) {
		comanda = new ProcesareComanda(client);
	}

	@Override
	public void procesareComanda(String detalii, int nrProduse, float valoareTotala) {
		if(valoareTotala >= 85.0) {
			comanda.procesareComanda(detalii, nrProduse, valoareTotala);
		} else {
			System.out.println("Nu se accepta comenzi mai mici de 85 de lei!");
		}
	}

}
