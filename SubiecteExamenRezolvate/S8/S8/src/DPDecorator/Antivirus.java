package DPDecorator;

public class Antivirus implements IAntivirus{
	private int codCalculator;
	private boolean hasLicense;

	public Antivirus(int codCalculator, boolean hasLicense) {
		super();
		this.codCalculator = codCalculator;
		this.hasLicense = hasLicense;
	}

	public int getCodCalculator() {
		return codCalculator;
	}

	public void setCodCalculator(int codCalculator) {
		this.codCalculator = codCalculator;
	}

	public boolean isHasLicense() {
		return hasLicense;
	}

	public void setHasLicense(boolean hasLicense) {
		this.hasLicense = hasLicense;
	}

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(url.contains("https")) {
			System.out.println("Website " + url + " securizat!");
		} else {
			System.out.println("Website " + url + " nesecurizat!");
		}
	}

	@Override
	public String toString() {
		return "Antivirus [codCalculator=" + codCalculator + ", hasLicense=" + hasLicense + "]";
	}
}
