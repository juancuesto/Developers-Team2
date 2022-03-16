package Domain;

import java.util.ArrayList;

public class Floristeria  {
	
	private String nombre;
	ArrayList<IArticulo> floristeria=new ArrayList<IArticulo>();
	
	public Floristeria(String nombre, ArrayList<IArticulo> floristeria) {
		super();
		this.nombre = nombre;
		this.floristeria = floristeria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<IArticulo> getFloristeria() {
		return floristeria;
	}

	public void setFloristeria(ArrayList<IArticulo> floristeria) {
		this.floristeria = floristeria;
	}
	
	
	
	
	
}
