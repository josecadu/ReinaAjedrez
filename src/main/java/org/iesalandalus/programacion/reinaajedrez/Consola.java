package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;



public class Consola {
	private void Consola()
	{
		
	}
	public static void mostrarMenu()
	{	
			System.out.println("MENU DE OPCIONES:");
			System.out.println("=====================================");
			System.out.println("1.Crear reina por defecto.");
			System.out.println("2.Crear una reina eligiendo el color.");
			System.out.println("3.Mover.");
			System.out.println("4.Salir.");
		
		}
	public static int elegirOpcionMenu()
	{
		int menuSeleccion=1;
		while (menuSeleccion !=1 || menuSeleccion !=2 || menuSeleccion !=3 || menuSeleccion !=4)
		System.out.println("1.ELIGE LA OPCION QUE DESEA REALIZAR");
		menuSeleccion= Entrada.entero();
		return menuSeleccion;	
	}
	public static Color elegirOpcion()
	{
		Color color=null;
		int opcionColor=0;
		do {
			System.out.print("Elija un color: ");
			System.out.println("==========");
			System.out.println("1. Blanca.");
			System.out.println("2. Negra.");
			
			opcionColor=Entrada.entero();
		} while (opcionColor!=1 && opcionColor!=2);
		
		switch (opcionColor) {
		case 1:
			color=Color.BLANCO;
			break;
		case 2:
			color=Color.NEGRO;
			break;
		}
		
		return color;
		
	}
	public static void mostrarMenuDirecciones()
	{	
			System.out.println("MENU DE DIRECCION:");
			System.out.println("===========================");
			System.out.println("1.NORTE.");
			System.out.println("2.NOROESTE.");
			System.out.println("3.NORESTE.");
			System.out.println("4.OESTE.");
			System.out.println("1.SUROESTE.");
			System.out.println("2.SUR.");
			System.out.println("3.SURESTE.");
			System.out.println("4.ESTE.");
		
		}
	
}
