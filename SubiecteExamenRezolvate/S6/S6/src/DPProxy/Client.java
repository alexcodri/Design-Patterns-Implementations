package DPProxy;

public class Client {
	private String nume;
	private int varsta;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + "]";
	}
	public Client(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
}
