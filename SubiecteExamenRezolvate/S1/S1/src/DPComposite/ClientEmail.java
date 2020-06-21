package DPComposite;

import java.util.Date;

public class ClientEmail extends StructuraGrupDeEmail{
	private String nume;
	private int idClient;
	private boolean esteOnline;

	public ClientEmail(String nume, int idClient, boolean esteOnline) {
		super();
		this.nume = nume;
		this.idClient = idClient;
		this.esteOnline = esteOnline;
	}
	
	

	public String getNume() {
		return nume;
	}



	public void setNume(String nume) {
		this.nume = nume;
	}



	public int getIdClient() {
		return idClient;
	}



	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}



	public boolean isEsteOnline() {
		return esteOnline;
	}



	public void setEsteOnline(boolean esteOnline) {
		this.esteOnline = esteOnline;
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
		return "ClientEmail [nume=" + nume + ", idClient=" + idClient + ", esteOnline=" + esteOnline + "]";
	}



	@Override
	public void addElement(StructuraGrupDeEmail categ) {
		throw new UnsupportedOperationException("Nu este implementata");
	}



	@Override
	public void removeElement(StructuraGrupDeEmail categ) {
		throw new UnsupportedOperationException("Nu este implementata");		
	}



	@Override
	public StructuraGrupDeEmail getElement(int index) {
		throw new UnsupportedOperationException("Nu este implementata");
	}

}
