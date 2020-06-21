package DPCommand;

public class ComandaTranzactie implements Comanda{
	String numeClient;
	String tipComanda;
	String stare;
	Broker broker;
	String codActiuni;
	int nrActiuni;

	public ComandaTranzactie(String numeClient, String tipComanda, String stare, Broker broker, String codActiuni,
			int nrActiuni) {
		super();
		this.numeClient = numeClient;
		this.tipComanda = tipComanda;
		this.stare = stare;
		this.broker = broker;
		this.codActiuni = codActiuni;
		this.nrActiuni = nrActiuni;
	}

	@Override
	public void executa() {
		this.toString();
		broker.executa(codActiuni, nrActiuni, tipComanda);
	}

	@Override
	public String toString() {
		return "ComandaTranzactie [numeClient=" + numeClient + ", tipComanda=" + tipComanda + ", stare=" + stare
				+ ", broker=" + broker + ", codActiuni=" + codActiuni + ", nrActiuni=" + nrActiuni + "]";
	}
}
