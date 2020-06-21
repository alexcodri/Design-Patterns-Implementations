package DPComposite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrupDeEmail extends StructuraGrupDeEmail {
	private String numeGrup;
	private int idGrup;
	private List<StructuraGrupDeEmail> noduri;

	public GrupDeEmail(String numeGrup, int idGrup) {
		super();
		this.numeGrup = numeGrup;
		this.idGrup = idGrup;
		noduri = new ArrayList<StructuraGrupDeEmail>();
	}

	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		for(StructuraGrupDeEmail nod : noduri) {
			nod.trimiteEmail(destinatie, subject);
		}
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		for(StructuraGrupDeEmail nod : noduri) {
			nod.creareEmailDraft(subject, prioritate);
		}
	}

	@Override
	public String getEmail() {
		String email = "";
		for(StructuraGrupDeEmail nod : noduri) {
			email += nod.getEmail();
		}
		return email;
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		for(StructuraGrupDeEmail nod : noduri) {
			nod.trimiteEveniment(dataEveniment, destinatie, subject);;
		}
	}

	@Override
	public void addElement(StructuraGrupDeEmail categ) {
		noduri.add(categ);
	}

	@Override
	public void removeElement(StructuraGrupDeEmail categ) {
		noduri.remove(categ);
	}

	@Override
	public StructuraGrupDeEmail getElement(int index) {
		return noduri.get(index);
	}

	@Override
	public String toString() {
		return "GrupDeEmail [numeGrup=" + numeGrup + ", idGrup=" + idGrup + ", noduri=" + noduri + "]";
	}

}
