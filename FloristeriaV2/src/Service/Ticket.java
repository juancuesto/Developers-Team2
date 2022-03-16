package Service;

import java.util.ArrayList;


import Domain.IArticulo;
import Repositorio.Almacen;
import Domain.Arbol;
import Domain.Decoracion;
import Domain.Flor;
import Domain.IArticulo;
import Domain.Floristeria;


public class Ticket {
	
	ArrayList<IArticulo> lista=new ArrayList<IArticulo>();
	static ArrayList<IArticulo> historicoVentas=new ArrayList<IArticulo>();
	static double gananciasTotales;
	
	public Ticket() {
		
	}

	public ArrayList<IArticulo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<IArticulo> lista) {
		this.lista = lista;
	}

	public static ArrayList<IArticulo> getHistoricoVentas() {
		return historicoVentas;
	}

	public static void setHistoricoVentas(IArticulo a) {
		historicoVentas.add(a);
	}

	public static double getGananciasTotales() {
		return gananciasTotales;
	}

	public static void setGananciasTotales(double gananciasTotales) {
		Ticket.gananciasTotales = gananciasTotales;
	}
	
	public void añadirArticulo(IArticulo a,Almacen f,ArrayList<IArticulo> flo) {
		int i=f.getStockArboles();
		int j=f.getStockFlores();
		int d=f.getStockDecoracion();
		if((a instanceof Arbol) &&(i>0)){
			lista.add(a);
			historicoVentas.add(a);
			flo.remove(a);
		}else if((a instanceof Flor) &&(j>0)) {
			lista.add(a);
			historicoVentas.add(a);
			flo.remove(a);
		}else if((a instanceof Decoracion) &&(d>0)) {
			lista.add(a);
			historicoVentas.add(a);
			flo.remove(a);
		}
	}
	
	public void imprimirTicket(Ticket t) {
		double pvpTicket=0;
		System.out.println("El ticket contiene: ");
		for(IArticulo elemento: t.lista) {
			System.out.println(elemento.toString());
			pvpTicket=pvpTicket+elemento.getPvp();
		}
		System.out.println("El pvp del ticket es : "+pvpTicket+" €\n");
		 	
	}
	
	public static void historicoVentas() {
		double pvpTotal=0;
		System.out.println("El listado de todas las compras realizadas es: ");
		for(IArticulo elemento: historicoVentas) {
			System.out.println(elemento.toString());
			pvpTotal=pvpTotal + elemento.getPvp();
		}
		System.out.println("La suma de todas las ventas es de: "+pvpTotal);
	}
	

}
