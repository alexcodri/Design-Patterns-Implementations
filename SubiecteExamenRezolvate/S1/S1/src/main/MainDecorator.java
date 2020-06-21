package main;

import java.util.Date;

import DPDecorator.ClientEmail;
import DPDecorator.DecoratorEmailCuLocatie;
import DPDecorator.DecoratorEmailCuOra;
import DPDecorator.IActiuniEmail;

public class MainDecorator {
	public static void main(String[] args) {
		IActiuniEmail c1 = new ClientEmail("George");
		IActiuniEmail d1 = new DecoratorEmailCuLocatie(c1);
		((DecoratorEmailCuLocatie) d1).setLocatie("Porche Pipera Pucuresti");
		d1.trimiteEveniment(new Date(), new ClientEmail("Muguru"), "Esti gras Mugure");
		IActiuniEmail d2 = new DecoratorEmailCuOra(c1);
		System.out.println(d2.getEmail());
	}
}
