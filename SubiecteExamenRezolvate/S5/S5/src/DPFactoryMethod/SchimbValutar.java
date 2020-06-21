package DPFactoryMethod;

public class SchimbValutar implements IFinanciar{

	@Override
	public void descriere() {
		System.out.println("S-a realizat un schimb valutar");
	}

	@Override
	public void descrieBeneficiar(String numeBeneficiar) {
		System.out.println("Beneficiarul schimbului valutar este " + numeBeneficiar);
	}

}
