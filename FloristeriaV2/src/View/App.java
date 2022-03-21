package View;

import Domain.IArticulo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
		
		/*System.out.println(" MENU DE OPCIONES");
		System.out.println("1. CREAR FLORISTERIA");
		System.out.println("2. AÑADIR ARBOL");
		System.out.println("3. AÑADIR FLOR");
		System.out.println("4. AÑADIR DECORACION");
		System.out.println("5. CREAR TICKET");
		System.out.println("6. AÑADIR ARTICULO A TICKET");
		System.out.println("7. IMPRIMR TICKET");
		System.out.println("8. MOSTRAR STOCK FLORISTERIA");
		System.out.println("9. MOSTRAR GANANCIAS TOTALES");
		System.out.println("10. SALIR\n");
		
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		System.out.println("Introduce un opcion:");
		
		opcion=sc.nextInt();*/
		
		String nombre=null;
		ArrayList<IArticulo> flo=new ArrayList<IArticulo>();
		Almacen comercio=new Almacen(flo,nombre);
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU DE OPCIONES\n"
					+ "1. CREAR FLORISTERIA\n"
					+ "2. AÑADIR ARBOL\n"
					+ "3. AÑADIR FLOR\n"
					+ "4. AÑADIR DECORACION\n"
					+ "5. CREAR ARCHIVO TXT\n"
					+ "6. AÑADIR ARTICULO A TICKET\n"
					+ "7. IMPRIMR TICKET\n"
					+ "8. DAME STOCK\n"
					+ "9. HISTORICO DE VENTAS"
					+ "10. SALIR"));
			switch(opcion) {
			case 1:
				Scanner scn=new Scanner(System.in);
				System.out.println("Introduce el nombre de la floristeria");
				nombre=scn.nextLine();
				Floristeria flo1=new Floristeria(nombre);
				break;
			case 2:
				int altura;
				double pvpArbol;
				Scanner sc=new Scanner(System.in);
				System.out.println("introduce arbol en stock");
				System.out.println("introduce altura arbol");
				altura=sc.nextInt();
				System.out.println("introduce precio");
				pvpArbol=sc.nextDouble();
				IArticulo a1=new Arbol(altura,pvpArbol);
				flo.add(a1);
				break;
			case 3:
				double pvpFlor;
				String color;
				Scanner scn2=new Scanner(System.in);
				Scanner scn3=new Scanner(System.in);
				System.out.println("introduce flor en stock");
				System.out.println("introduce color ");
				color=scn2.nextLine();
				System.out.println("introduce precio");
				pvpFlor=scn3.nextDouble();scn3.nextLine();
				IArticulo f1=new Flor(color,pvpFlor);
				flo.add(f1);
				break;
				
			case 4:
				double pvpDecoracion;
				String tipo;
				Scanner scn4=new Scanner(System.in);
				Scanner scn5=new Scanner(System.in);
				System.out.println("introduce decoracion en stock");
				System.out.println("introduce tipo plastico o madera ");
				tipo=scn4.nextLine();
				System.out.println("introduce precio");
				pvpDecoracion=scn5.nextDouble();scn5.nextLine();
				IArticulo d1=new Decoracion(tipo,pvpDecoracion);
				flo.add(d1);
				
				
				break;
			case 5:
				try {
					FileWriter fw = new FileWriter("C:/Users/juanc/Desktop/java_ejemplo/floristeria.txt", true);
					fw.write(nombre);
					fw.write("\n");
					for(IArticulo elemento: flo) {
						fw.write(elemento.toString());
						fw.write("\n");
					}
					fw.close();
				}catch (Exception e) {}
				
				
				break;
			case 6:
				Ticket t1=new Ticket();
				int op;
				IArticulo a;
				System.out.println("¿que quieres comprar?\n 1. Arbol\n 2.Flor\n3. Decoracion");
				Scanner sc3=new Scanner(System.in);
				op=sc3.nextInt();
				if(op==1) {
					a=comercio.eliminarArbol(flo);
					flo.remove(a);
					Ticket.añadirArticulo(a, comercio, flo);
				}else if(op==2) {
					a=comercio.eliminarFlor(flo);
					flo.remove(a);
					Ticket.añadirArticulo(a, comercio, flo);
				}else if(op==3) {
					a=comercio.eliminarDecoracion(flo);
					flo.remove(a);
					Ticket.añadirArticulo(a, comercio, flo);
				}
				break;
			case 7:
				Ticket.imprimirTicket();
				break;
			case 8:
				comercio.dameStock(flo);
				break;
			case 9:
				Ticket.historicoVentas();
				break;
			
		}}while(opcion<10);
	}	
	}

