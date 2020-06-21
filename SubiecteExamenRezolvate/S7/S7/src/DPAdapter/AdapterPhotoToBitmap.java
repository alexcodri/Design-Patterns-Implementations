package DPAdapter;

public class AdapterPhotoToBitmap extends PhotoImage {
	private OriginatorImagineBitmap bitmap;

	public AdapterPhotoToBitmap(OriginatorImagineBitmap bitmap) {
		super();
		this.bitmap = bitmap;
	}

	@Override
	public void resize(float procentResize) {
		bitmap.latime = (int) (bitmap.latime * procentResize / 100);
		bitmap.lungime = (int) (bitmap.lungime * procentResize / 100);
	}

	@Override
	public void aplicaFiltruCuloare(String culoare) {
		this.bitmap.schemaCulori = culoare;
	}

	@Override
	public String toString() {
		return "AdapterPhotoToBitmap [bitmap=" + bitmap + "]";
	}

}
