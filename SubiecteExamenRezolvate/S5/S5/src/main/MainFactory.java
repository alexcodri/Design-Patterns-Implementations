package main;

import DPFactoryMethod.Factory;
import DPFactoryMethod.FactoryInvestitiiDeFonduri;
import DPFactoryMethod.FactorySchimbValutar;

public class MainFactory {

	public static void main(String[] args) {
		Factory f1 = new FactoryInvestitiiDeFonduri();
		Factory f2 = new FactorySchimbValutar();
		
		f1.creareServiciuFinanciar().descriere();
		f2.creareServiciuFinanciar().descrieBeneficiar("Casa de schimb valutar BCR");
	}

}
