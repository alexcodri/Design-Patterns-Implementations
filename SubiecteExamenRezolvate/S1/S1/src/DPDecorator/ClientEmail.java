package DPDecorator;

import java.util.Date;

public class ClientEmail implements IActiuniEmail{
	private String nume;

	public ClientEmail(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		System.out.println(nume + " trimite email cu subiectul " + subject + " catre " + destinatie.toString());
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		System.out.println("S-a creat un draft cu subiectul " + subject + ", prioritate " + prioritate);
	}

	@Override
	public String getEmail() {
		return nume + " a primit un email";
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		System.out.println(nume + " trimite un eveniment cu subiectul " + subject + ", la data de " + dataEveniment.toString() + " catre " + destinatie.toString());
	}

	@Override
	public String toString() {
		return "ClientEmail [nume=" + nume + "]";
	}
}
