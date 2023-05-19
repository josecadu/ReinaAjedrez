package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;
	
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null)
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		this.color = color;
	}
	public Posicion getPosicion() {
		return new Posicion(posicion);
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) 
			throw new NullPointerException("ERROR: La posicion no puede ser null.");
		this.posicion=new Posicion(posicion);
	}
	public Reina (){
		Posicion posicionReinaBlanca=new Posicion(1, 'd');
		 setColor (Color.BLANCO) ;
		 setPosicion(posicionReinaBlanca);
		
	}
	public Reina (Color color) {
		Posicion posicionReinaBlanca=new Posicion(1, 'd');
		setColor (color);
		if (color == Color.BLANCO)
		{
			setPosicion (new Posicion(posicionReinaBlanca));
		}
		
		else   {
			setPosicion (new Posicion( 8, 'd'));
			}
			
	}
	
	public void mover (Direccion direccion, int pasos) throws OperationNotSupportedException 
	{
		if (direccion.equals(null))
		{
			throw new NullPointerException("ERROR: la direccion no puede ser nula.");
	} 
		else if (pasos < 1 || pasos > 7 )
		{

	throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
	
}
		switch (direccion) {
		case NORTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() +pasos , posicion.getColumna()));
				} catch (IllegalArgumentException p ) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case ESTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() , (char)(posicion.getColumna() +pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case NORESTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() +pasos ,(char)(posicion.getColumna() +pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case NOROESTE:
		
				try {
					setPosicion(new Posicion(posicion.getFila() +pasos ,(char)(posicion.getColumna() -pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case OESTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() ,(char)(posicion.getColumna() -pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
		
			break;
		case SUR:
			
				try {
					setPosicion(new Posicion(posicion.getFila() -pasos , posicion.getColumna()));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case SURESTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() -pasos , (char)(posicion.getColumna() +pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		case SUROESTE:
			
				try {
					setPosicion(new Posicion(posicion.getFila() -pasos ,(char)(posicion.getColumna() -pasos )));
				} catch (IllegalArgumentException p) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}
			
			break;
		default:
				throw new NullPointerException("ERROR: La dirección no puede ser nula.");
			
		}
	}
	@Override
	public String toString() {
		return "Reina color " + color + ", posicion " + posicion ;
	}
	
	
}
