package DPDecorator;

import java.util.Date;

public class DecoratorEmailCuOra extends Decorator{
	public DecoratorEmailCuOra(IActiuniEmail client) {
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
		return super.client.getEmail() + " la ora: " + new Date().getHours();
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		super.client.trimiteEveniment(dataEveniment, destinatie, subject);
	}
	
	
}
