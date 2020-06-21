package DPBuilder;

public class Utilizator {
	private String nume;
	private String prenume;
	private TipUtilizator tip;
	
	private int varsta;
	private String gen;
	private int grupa;
	private String facultatea;
	private String cursulCoordonat;
	
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public TipUtilizator getTip() {
		return tip;
	}

	public void setTip(TipUtilizator tip) {
		this.tip = tip;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public int getGrupa() {
		return grupa;
	}

	public void setGrupa(int grupa) {
		this.grupa = grupa;
	}

	public String getFacultatea() {
		return facultatea;
	}

	public void setFacultatea(String facultatea) {
		this.facultatea = facultatea;
	}

	public String getCursulCoordonat() {
		return cursulCoordonat;
	}

	public void setCursulCoordonat(String cursurlCoordonat) {
		this.cursulCoordonat = cursurlCoordonat;
	}
	
	@Override
	public String toString() {
		return "Utilizator [nume=" + nume + ", prenume=" + prenume + ", tip=" + tip + ", varsta=" + varsta + ", gen="
				+ gen + ", grupa=" + grupa + ", facultatea=" + facultatea + ", cursulCoordonat=" + cursulCoordonat
				+ "]";
	}

	public static class UtilizatorBuilder implements Builder{
		private Utilizator utilizator;
		
		public UtilizatorBuilder(String nume,String prenume, TipUtilizator tip) {
			utilizator = new Utilizator();
			utilizator.setNume(nume);
			utilizator.setPrenume(prenume);
			utilizator.setTip(tip);
		}
		
		public UtilizatorBuilder setVarsta(int varsta) {
			utilizator.setVarsta(varsta);
			return this;
		}
		
		public UtilizatorBuilder setGen(String gen) {
			utilizator.setGen(gen);
			return this;
		}
		
		public UtilizatorBuilder setGrupa(int grupa) {
			utilizator.setGrupa(grupa);
			return this;
		}
		
		public UtilizatorBuilder setFacultate(String facultatea) {
			utilizator.setFacultatea(facultatea);
			return this;
		}
		
		public UtilizatorBuilder setCursulCoordonat(String cursulCoordonat) {
			utilizator.setCursulCoordonat(cursulCoordonat);
			return this;
		}

		@Override
		public Utilizator build() {
			return utilizator;
		}
	}
}
