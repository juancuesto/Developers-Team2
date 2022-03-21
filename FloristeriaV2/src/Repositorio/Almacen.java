package Repositorio;

import java.util.ArrayList;
import java.util.Scanner;

import Domain.IArticulo;
import Domain.Arbol;
import Domain.Decoracion;
import Domain.Flor;

public class Almacen {
	
	ArrayList<IArticulo> floristeria=new ArrayList<IArticulo>();
	private String nombre;
	private int stockArboles=0;
	private int stockFlores=0;
	private int stockDecoracion=0;
	
	public Almacen(ArrayList<IArticulo> floristeria, String nombre) {
		super();
		this.floristeria = floristeria;
		this.nombre = nombre;	
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
	
	public IArticulo añadirArbol(){
		int altura;
		double pvp;
		IArticulo a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce arbol en stock");
		System.out.println("introduce altura arbol");
		altura=sc.nextInt();
		System.out.println("introduce precio");
		pvp=sc.nextDouble();
		stockArboles++;
		a=new Arbol(altura,pvp);
		
		return a;
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
	public Arbol eliminarArbol(ArrayList<IArticulo> flo) {
		for(int i=0;i<flo.size();i++) {
			if(flo.get(i) instanceof Arbol) {
				
				return (Arbol)flo.get(i);
			}else {
				System.out.println("No hay stock suficiente");
				return null;
			}
			
		}
		return null;
	}
	public Flor eliminarFlor(ArrayList<IArticulo> flo) {
		for(int i=0;i<flo.size();i++) {
			if(flo.get(i) instanceof Flor) {
				
				return (Flor)flo.get(i);
			}else {
				System.out.println("No hay stock suficiente");
				return null;
			}
			
		}
		return null;
	}
	
	public Decoracion eliminarDecoracion(ArrayList<IArticulo> flo) {
		for(int i=0;i<flo.size();i++) {
			if(flo.get(i) instanceof Decoracion) {
				return (Decoracion)flo.get(i);
			}else {
				System.out.println("No hay stock suficiente");
				return null;
			}
			
		}
		return null;
	}

	
	
	

}
