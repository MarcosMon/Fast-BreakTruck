package org.lasencinas.BreakFast;

public abstract class Cereales implements Item {
	
	Cereales(){}
	
	public Packing empaquetado() {
		
		Packing caja = new Caja();
		
		return caja;
	}
	
	@Override
	public String toString() {
		
		return null;
	}

}
