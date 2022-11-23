package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Color color;
	private Posicion posicion;
	Posicion posicionReinaBlanca=new Posicion(1, 'd');
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null)
			throw new NullPointerException("ERROR: El color no puede ser null.");
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) 
			throw new NullPointerException("ERROR: La posicion no puede ser null.");
		this.posicion = posicion;
	}
	public Reina (){
		 setColor (Color.BLANCO) ;
		 setPosicion(posicionReinaBlanca);
		
	}
	public Reina (Color color) {
		setColor (color);
		if (color == Color.BLANCO);
		{
			setPosicion (new Posicion(posicionReinaBlanca));
		}
		
		if  (color == Color.NEGRO); {
			setPosicion (new Posicion( 8, 'd'));
			}
			
	}
	public void mover (Direccion direccion, int pasos)
	{
		
	}
	
	
}
