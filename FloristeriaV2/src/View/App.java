package View;

import Domain.IArticulo;

import java.util.ArrayList;

import Domain.Arbol;
import Domain.Decoracion;
import Domain.Flor;
import Domain.IArticulo;
import Domain.Floristeria;
import Repositorio.Almacen;
import Service.Ticket;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<IArticulo> flo=new ArrayList<IArticulo>();
		double pvpStock;
		
		Almacen comercio=new Almacen(flo,"Loli",2,2,2);
		
		IArticulo a1=new Arbol(100,23.50);
		IArticulo a2=new Arbol(10,23.50);
		IArticulo f1=new Flor("Azul",5);
		IArticulo f2=new Flor("Verde",5);
		IArticulo d1=new Decoracion("Fusta",10);
		IArticulo d2=new Decoracion("Plastic",10);
		
		flo.add(a1);
		flo.add(a2);
		flo.add(f1);
		flo.add(f2);
		flo.add(d1);
		flo.add(d2);
		
		Floristeria flo1=new Floristeria("Floristeria Loli",flo);
		
		comercio.dameStock(flo);
		
		IArticulo a3=new Arbol(10,23.50);
		
		flo=comercio.añadirArbol(a3,flo);
		System.out.println("------------------------------------");
		comercio.dameStock(flo);
		
		pvpStock=comercio.pvpStock(flo);
		System.out.println("El valor del stock de la floristeria es de: "+pvpStock+" €");
		
		Ticket t1=new Ticket();
		
		t1.añadirArticulo(a1, comercio, flo);
		t1.añadirArticulo(d1, comercio, flo);
		System.out.println("-----------------------------");
		pvpStock=comercio.pvpStock(flo);
		System.out.println("El valor del stock de la floristeria es de: "+pvpStock+" €");

		t1.imprimirTicket(t1);
		Ticket.historicoVentas();
		System.out.println("///////////////////////////////////");
		
		Ticket t2=new Ticket();
		
		t2.añadirArticulo(a2, comercio, flo);
		t2.añadirArticulo(f2, comercio, flo);
		t2.imprimirTicket(t2);
		
		System.out.println(flo1.getNombre());
		Ticket.historicoVentas();
		
		
		
		
		

		

		

	}

}
