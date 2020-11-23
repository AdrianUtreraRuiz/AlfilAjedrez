package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	//Creamos los atributos de Color y posicion de enumerador Color y Clase posición respectivamente
	public Color color;
	public Posicion posicion;
	
	//Creamos los metodos get y set para dicha clase con sus excepciones
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No se puedo asignar un color nulo.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		this.posicion = posicion;
	}
	
}