package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
	//declaracion de atributos
	private int fila;
	private char columna;
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		if (fila < 1 || fila > 8) 
			throw new IllegalArgumentException("ERROR: fila no valida.");
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		if (columna < 'a' || columna > 'h')
			throw new IllegalArgumentException("ERROR: columna no valida.");
		this.columna = columna;
	}

}
