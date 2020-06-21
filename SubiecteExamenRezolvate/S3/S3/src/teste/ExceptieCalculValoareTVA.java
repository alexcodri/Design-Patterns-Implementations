package teste;

public class ExceptieCalculValoareTVA extends IllegalArgumentException{
	private String mesaj;

	public ExceptieCalculValoareTVA(String mesaj) {
		super(mesaj);
	}
	
	
}
