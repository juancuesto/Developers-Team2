package Domain;

public class Flor implements IArticulo {
	
	private String color;
	private double pvp;
	@Override
	public String toString() {
		return "Flor [color=" + color + ", pvp=" + pvp + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	public Flor(String color, double pvp) {
		super();
		this.color = color;
		this.pvp = pvp;
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
