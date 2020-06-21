package main;

import DPCommand.Broker;
import DPCommand.ComandaTranzactie;
import DPCommand.Operator;

public class MainCommand {

	public static void main(String[] args) {
		Broker b1 = new Broker("Anton");
		Broker b2 = new Broker("Gigi");
		
		Operator operator = new Operator();
		operator.incarcaComanda(new ComandaTranzactie("Client1", "cumparare", "procesata", b1, "fba123", 4));
		operator.incarcaComanda(new ComandaTranzactie("Client1", "vanzare", "procesata", b2, "jtmn123", 90));
		operator.incarcaComanda(new ComandaTranzactie("Client2", "cumparare", "neprocesata", b2, "fba123", 7));
		operator.incarcaComanda(new ComandaTranzactie("Client3", "vanzare", "procesata", b1, "fba123", 4));

		operator.proceseazaComenzi();
	}

}
