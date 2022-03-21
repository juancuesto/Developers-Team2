package Domain;

public class Arbol implements IArticulo {
	
	private double altura;
	private double pvp;
	
	public Arbol(double altura, double pvp) {
		super();
		this.altura = altura;
		this.pvp = pvp;
	}

	@Override
	public double getPvp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
