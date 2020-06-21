package cts.chioibas.dorin.gr1076.teste;

public class Produs {

	private String denumireProdus;
	private Double pret;
	public Produs(String denumireProdus, Double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.pret = pret;
	}
	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}
	
	public void setPret(Double pret, int tipPromotie) {
		if (pret < 1 || pret > 1000) {
			throw new IllegalArgumentException("Pretul este in afara intervalului stabilit");
		}

		switch(tipPromotie) {
		case 1:
			this.pret = pret;
			break;
		case 2:
			if (pret >= 2) {
				this.pret = pret/2;
				break;
			} else {
				this.pret = pret;
				break;
			}
		default:
			this.pret = pret;	
		}
		
	}
	public String getDenumireProdus() {
		return denumireProdus;
	}
	public Double getPret() {
		return pret;
	}
	@Override
	public String toString() {
		return "Produs [" + denumireProdus + ",    pret=" + pret + "]";
	}
	
	
}
