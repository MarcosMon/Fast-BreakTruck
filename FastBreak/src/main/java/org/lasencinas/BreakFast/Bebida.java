package org.lasencinas.BreakFast;

public abstract class Bebida implements Item {
	
	
	Bebida(){}
	
	public Packing empaquetado() {
		
		Packing tubo = new Tubo();
		
		return tubo;
	}

	@Override
	public String toString() {
		
		return null;
	}
	
	

}
