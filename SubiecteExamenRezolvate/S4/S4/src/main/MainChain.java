package main;

import DPChain.Autobuz;
import DPChain.Calator;
import DPChain.ICalator;
import DPChain.Metrou;
import DPChain.MijlocDeTransport;
import DPChain.Tramvai;
import DPChain.Tren;

public class MainChain {

	public static void main(String[] args) {
		MijlocDeTransport autobuz = new Autobuz();
		MijlocDeTransport tramvai = new Tramvai();
		MijlocDeTransport metrou = new Metrou();
		MijlocDeTransport tren = new Tren();
		
		autobuz.setUrmatorulMijloc(tramvai);
		tramvai.setUrmatorulMijloc(metrou);
		metrou.setUrmatorulMijloc(tren);
		
		ICalator c1 = new Calator("Anghel");
		ICalator c2 = new Calator("Mihai");
		ICalator c3 = new Calator("Dorin");
		ICalator c4 = new Calator("Alex");
		ICalator c5 = new Calator("Vlad");

		
		autobuz.deplaseaza(c1, 3);
		autobuz.deplaseaza(c2, 6);
		autobuz.deplaseaza(c3, 9);
		autobuz.deplaseaza(c4, 14);
		autobuz.deplaseaza(c5, 17);

	}

}
