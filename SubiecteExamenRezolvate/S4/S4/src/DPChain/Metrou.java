package DPChain;

public class Metrou extends MijlocDeTransport{

	@Override
	public void deplaseaza(ICalator calator, int nrKm) {
		if(nrKm <= 15 && nrKm > 10) {
			calator.deplaseaza(nrKm);
			System.out.println("Deplasare cu Metroul");
		} else {
			super.getUrmatorulMijloc().deplaseaza(calator, nrKm);
		}

	}
}
