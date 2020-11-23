package org.iesalandalus.programacion.alfilajedrez;


public class Posicion {

	private int fila;
	private char columna;
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);		
	}
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila <1 || fila >8) {
			throw new IllegalArgumentException("Error: Fila no válida.");
		}		
		this.fila = fila;
	}
	public char getColunmna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			
			throw new IllegalArgumentException("Error: Columna no válida.");
		}
		this.columna = columna;
	}
	
}
