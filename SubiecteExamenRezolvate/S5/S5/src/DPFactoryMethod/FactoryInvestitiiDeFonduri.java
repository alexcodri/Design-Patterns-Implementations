package DPFactoryMethod;

public class FactoryInvestitiiDeFonduri implements Factory {

	@Override
	public IFinanciar creareServiciuFinanciar() {
		return new InvestitiiDeFonduri();
	}

}