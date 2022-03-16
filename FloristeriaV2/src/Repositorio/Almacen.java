package Repositorio;

import java.util.ArrayList;

import Domain.IArticulo;
import Domain.Arbol;
import Domain.Decoracion;
import Domain.Flor;

public class Almacen {
	
	ArrayList<IArticulo> floristeria=new ArrayList<IArticulo>();
	private String nombre;
	private int stockArboles;
	private int stockFlores;
	private int stockDecoracion;
	
	public Almacen(ArrayList<IArticulo> floristeria, String nombre,int a,int b,int c) {
		super();
		this.floristeria = floristeria;
		this.nombre = nombre;
		stockArboles=a;
		stockFlores=b;
		stockDecoracion=c;
	}
	
	public void dameStock(ArrayList<IArticulo> floristeria) {
		
		int cantidadArboles=0;
		int cantidadFlores=0;
		int cantidadDecoracion=0;
		for(IArticulo elemento: floristeria) {
			if(elemento instanceof Arbol) {
				
				cantidadArboles++;
			}else if(elemento instanceof Flor) {
				
				cantidadFlores++;
			}else if(elemento instanceof Decoracion) {
				cantidadDecoracion++;
			}
		}
		System.out.println("Cantidad de arboles: "+cantidadArboles+ "\n"+"Cantidad de flores: "+cantidadFlores+"\n"+"Cantidad decoracion: "+cantidadDecoracion);
	}
	
	public ArrayList<IArticulo> añadirArbol(IArticulo a, ArrayList<IArticulo> flo){
		if( a instanceof Arbol){
			stockArboles++;
			flo.add(a);
		}
		return flo;
	}
	public ArrayList<IArticulo>  añadirFlor(IArticulo a,ArrayList<IArticulo> l){
		if( a instanceof Flor){
			stockFlores++;
			l.add(a);
		}
		return l;
	}
	public void añadirdecoracion(IArticulo a){
		if( a instanceof Arbol){
			stockDecoracion++;
		}
	}
	
	public int getStockArboles() {
		return stockArboles;
	}
	
	
	public int getStockFlores() {
		
		return stockFlores;
	}
	
	public int getStockDecoracion() {
		return stockDecoracion;
	}
	
	public double pvpStock(ArrayList<IArticulo> flo) {
		double pvpTotal=0;
		for(IArticulo elemento: flo) {
			pvpTotal=pvpTotal+elemento.getPvp();
		}
		return pvpTotal;
	}

	
	
	

}
