package Domain;

public class Decoracion implements IArticulo {
	
	private String tipo;
	private double pvp;
	public Decoracion(String tipo, double pvp) {
		super();
		this.tipo = tipo;
		this.pvp = pvp;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	@Override
	public String toString() {
		return "Decoracion [tipo=" + tipo + ", pvp=" + pvp + "]";
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
