package DPMemento;

import java.util.Date;

public class MementoImagineBitmap {
	protected int latime;
	protected int lungime;
	protected String schemaCulori;
	protected String formatDeStocare;
	protected Date dataSalvare;
	public MementoImagineBitmap(int latime, int lungime, String schemaCulori, String formatDeStocare,
			Date dataSalvare) {
		super();
		this.latime = latime;
		this.lungime = lungime;
		this.schemaCulori = schemaCulori;
		this.formatDeStocare = formatDeStocare;
		this.dataSalvare = dataSalvare;
	}
	public int getLatime() {
		return latime;
	}
	public void setLatime(int latime) {
		this.latime = latime;
	}
	public int getLungime() {
		return lungime;
	}
	public void setLungime(int lungime) {
		this.lungime = lungime;
	}
	public String getSchemaCulori() {
		return schemaCulori;
	}
	public void setSchemaCulori(String schemaCulori) {
		this.schemaCulori = schemaCulori;
	}
	public String getFormatDeStocare() {
		return formatDeStocare;
	}
	public void setFormatDeStocare(String formatDeStocare) {
		this.formatDeStocare = formatDeStocare;
	}
	public Date getDataSalvare() {
		return dataSalvare;
	}
	public void setDataSalvare(Date dataSalvare) {
		this.dataSalvare = dataSalvare;
	}
	@Override
	public String toString() {
		return "MementoImagineBitmap [latime=" + latime + ", lungime=" + lungime + ", schemaCulori=" + schemaCulori
				+ ", formatDeStocare=" + formatDeStocare + ", dataSalvare=" + dataSalvare.getTime() + "]";
	}
	
	
}
