package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;


import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) {
		 
		int selecion;
		boolean fin=true;
		while (fin==true)
		{
			Consola.mostrarMenu();
			selecion=Consola.elegirOpcionMenu();
			try {
				ejecutarOpcion(selecion);
			} catch (OperationNotSupportedException  | NullPointerException e ) {
			System.out.println(e.getMessage());
			}
			if (selecion==4) {
				fin=false;}
			else {
			try {
				mostrarReina();
			}
			catch (NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
			}
			
		}
		
		
	}
	private static  void ejecutarOpcion( int opcion) throws OperationNotSupportedException
	{
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			break;
		case 2:
			crearReinaColor();
			break;
		case 3:
			try {
				mover();
			}
			catch (NullPointerException p)
			{
				System.out.println(p.getMessage());
			}
			break;
		case 4:
			Consola.despedirse();
			break;
		}
			
		
	}
	private static void crearReinaDefecto()
	{
		reina= new Reina();
	}
	private static void crearReinaColor()
	{
		reina= new Reina (Consola.elegirOpcion());
	}
	private static void mover() throws OperationNotSupportedException
	{
		if (reina.equals (null))
		{
			throw new  NullPointerException ("ERROR: la reina debe ser creada primero");
		
		}
		else
		{
		Direccion direccion =null;
		int pasos=Consola.elegirPasos();;
		Consola.mostrarMenuDirecciones();
		direccion = Consola.elegirDireccion();
		reina.mover(direccion,pasos);
		}
		
	}
	private static void mostrarReina() {
		if (reina ==null)
		{
			throw new NullPointerException("ERROR: la reina debe ser creada primero");
		
		}
			else 
			{
				System.out.println( reina.toString());
			}
	}
}
