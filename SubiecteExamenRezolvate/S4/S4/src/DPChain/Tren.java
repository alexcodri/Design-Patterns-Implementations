package DPChain;

public class Tren extends MijlocDeTransport{

	@Override
	public void deplaseaza(ICalator calator, int nrKm) {
			calator.deplaseaza(nrKm);
			System.out.println("Deplasare cu Trenul");
	}
}
