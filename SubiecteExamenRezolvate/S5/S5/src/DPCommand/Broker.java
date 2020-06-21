package DPCommand;

public class Broker implements IClientBursa{
	String nume;

	public Broker(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void vinde(String codActiuni, int nrActiuni) {
		System.out.println("Brokerul " + nume + " vinde " + nrActiuni + " cu codul " + codActiuni);		
	}

	@Override
	public void cumpara(String codActiuni, int nrActiuni) {
		System.out.println("Brokerul " + nume + " cumpara " + nrActiuni + " actiuni cu codul " + codActiuni);
	}
	
	public void executa(String codActiuni, int nrActiuni, String tipComanda) {
		if(tipComanda.equals("cumparare")) {
			this.cumpara(codActiuni, nrActiuni);
		} else if(tipComanda.equals("vanzare")){
			this.vinde(codActiuni, nrActiuni);
		}
	}

}
