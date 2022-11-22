package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

public class Posicion {
	//declaracion de atributos
	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
		
	}
	
	public Posicion (Posicion p) {
		setFila (p.getFila());
		setColumna (p.getColumna());
	}
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) 
			throw new IllegalArgumentException("ERROR: fila no valida.");
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h')
			throw new IllegalArgumentException("ERROR: columna no valida.");
		this.columna = columna;
	}

}
