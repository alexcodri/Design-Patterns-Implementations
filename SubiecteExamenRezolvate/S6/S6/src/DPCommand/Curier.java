package DPCommand;

public class Curier {
	private String nume;
	private int rating;
	public Curier(String nume, int rating) {
		super();
		this.nume = nume;
		this.rating = rating;
	}
	
	public void livrareComanda(String numeClient) {
		System.out.println(nume + ", cu rating " + rating + ", o sa livreze comanda catre " + numeClient);
	}
}
