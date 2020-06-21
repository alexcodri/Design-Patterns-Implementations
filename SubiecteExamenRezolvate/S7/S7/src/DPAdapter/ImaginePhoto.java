package DPAdapter;

public class ImaginePhoto extends PhotoImage{
	
	public ImaginePhoto(int lungime, int inaltime, String culoare) {
		this.lungime = lungime;
		this.inaltime = inaltime;
		this.culoareDeBaza = culoare;
	}

	@Override
	public void resize(float procentResize) {
		this.inaltime = (int) (this.inaltime * procentResize / 100);
		this.lungime = (int) (this.lungime * procentResize / 100);
	}

	@Override
	public void aplicaFiltruCuloare(String culoare) {
		this.culoareDeBaza = culoare;
	}

}
