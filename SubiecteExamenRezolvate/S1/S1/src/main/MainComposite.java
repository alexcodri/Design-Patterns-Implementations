package main;

import java.util.Date;

import DPComposite.ClientEmail;
import DPComposite.GrupDeEmail;
import DPComposite.StructuraGrupDeEmail;

public class MainComposite {
	public static void main(String[] args) {
		StructuraGrupDeEmail g1 = new GrupDeEmail("grup1", 1);
		
		StructuraGrupDeEmail g2 = new GrupDeEmail("grup2", 2);
		StructuraGrupDeEmail g3 = new GrupDeEmail("grup3", 3);
		g1.addElement(g2);
		g1.addElement(g3);
		
		StructuraGrupDeEmail c1 = new ClientEmail("Dorin", 1, true);
		StructuraGrupDeEmail c2 = new ClientEmail("Mihai", 2, false);
		StructuraGrupDeEmail c3 = new ClientEmail("Alex", 3, true);
		StructuraGrupDeEmail c4 = new ClientEmail("Florian Nastase", 4, true);
		
		g2.addElement(c1);
		g2.addElement(c2);
		g3.addElement(c3);
		g1.addElement(c4);
		
		c2.trimiteEmail(g1, "subiect1");
		g1.creareEmailDraft("sub2", 14);
		System.out.println(g1.getEmail());
		g1.trimiteEveniment(new Date(), c3, "sub3");
	}
}
