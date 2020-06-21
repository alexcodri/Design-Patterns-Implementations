package DPComposite;

public abstract class StructuraGrupDeEmail implements IActiuniEmail{
	public abstract void addElement(StructuraGrupDeEmail categ);
	public abstract void removeElement(StructuraGrupDeEmail categ);
	public abstract StructuraGrupDeEmail getElement(int index);
}
