package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	private int fila;
	private char columna;
 //Crear el constructor y asignar modificar los val
	public Posicion(int fila, char columna) {
			setFila(fila);
			setColumna(columna);
	}
	//Crear el constructor copia para asignar posicion de fila y columna
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		this.fila = posicion.getFila();
		this.columna = posicion.getColumna();
	}
	
	
	public int getFila() {
		return fila;
	}
	
	private void setFila(int fila) {
		if (fila <1 || fila >8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}		
		this.fila = fila;
	}
	
	public char getColumna() {
		return columna;
	}
	
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}
	//Creamos los métodos de hashCode y equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	//Creamos el toString para devolver un String de fila y columna
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}
	
}
