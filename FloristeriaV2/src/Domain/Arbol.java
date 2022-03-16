package Domain;

public class Arbol implements IArticulo {
	
	private double altura;
	private double pvp;
	
	public Arbol(double altura, double pvp) {
		super();
		this.altura = altura;
		this.pvp = pvp;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	@Override
	public String toString() {
		return "Arbol [altura=" + altura + ", pvp=" + pvp + "]";
	}
	
	public int getStockArboles() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getStockFlores() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getStockDecoracion() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
