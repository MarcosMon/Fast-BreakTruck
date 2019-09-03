package org.lasencinas.BreakFast;

public class Plumbus implements Item {

	String nombre = "Plumbus";
	Float pvp = 100f;
	
	
	public String nombre() {
		
		return this.nombre;
	}

	public Packing empaquetado() {
		
		Caja caja = new Caja();
		
		return caja;
	}

	public Float pvp() {
		
		return this.pvp;
	}

}
