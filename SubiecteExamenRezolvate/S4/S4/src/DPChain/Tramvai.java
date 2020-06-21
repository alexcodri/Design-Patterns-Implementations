package DPChain;

public class Tramvai extends MijlocDeTransport{

	@Override
	public void deplaseaza(ICalator calator, int nrKm) {
		if(nrKm <= 10 && nrKm > 5) {
			calator.deplaseaza(nrKm);
			System.out.println("Deplasare cu Tramvaiul");
		} else {
			super.getUrmatorulMijloc().deplaseaza(calator, nrKm);
		}

	}
}
