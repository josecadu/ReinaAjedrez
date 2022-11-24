package org.iesalandalus.programacion.reinaajedrez;

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
	
}
