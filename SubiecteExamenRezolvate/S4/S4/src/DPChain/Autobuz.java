package DPChain;

public class Autobuz extends MijlocDeTransport{

	@Override
	public void deplaseaza(ICalator calator, int nrKm) {
		if(nrKm <= 5) {
			calator.deplaseaza(nrKm);
			System.out.println("Deplasare cu Autobuzul");
		} else {
			super.getUrmatorulMijloc().deplaseaza(calator, nrKm);
		}

	}
}
