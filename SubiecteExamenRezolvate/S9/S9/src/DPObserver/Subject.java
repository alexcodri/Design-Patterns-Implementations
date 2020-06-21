package DPObserver;

public interface Subject {
	public void adaugaObserver(ITransmitereMesaj obs);
	public void stergeObserver(ITransmitereMesaj obs);
	public void trimiteNotificare(String user, String mesaj);
}
