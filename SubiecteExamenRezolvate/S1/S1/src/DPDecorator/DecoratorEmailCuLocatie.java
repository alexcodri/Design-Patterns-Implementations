package DPDecorator;

import java.util.Date;

public class DecoratorEmailCuLocatie extends Decorator{
	private String locatie;
	
	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public DecoratorEmailCuLocatie(IActiuniEmail client) {
		super(client);
	}

	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		super.client.trimiteEmail(destinatie, subject);
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		super.client.creareEmailDraft(subject, prioritate);
	}

	@Override
	public String getEmail() {
		return super.client.getEmail();
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		super.client.trimiteEveniment(dataEveniment, destinatie, subject);
		System.out.println("Evenimentul are loc la " + locatie);
	}
	
	
}
