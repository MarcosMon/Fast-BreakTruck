package org.lasencinas.BreakFast;

import java.util.ArrayList;

public class Desayuno {
	
	ArrayList<Item> item = new ArrayList<Item>();
	

	public void mostrarItems() {
		
		for (Item item : getItems()) {
			
			System.out.println("Item: " + item.nombre() + " empaquetado " + item.empaquetado().envoltorio() + " Precio " + item.pvp());
		}
	}

	public Float getCoste() {
		
		Float total = 0f;
		
		for (Item item : getItems()) {
			
			total += item.pvp();
		}
		
		return total;
	}
	
	public ArrayList<Item> getItems() {
		
		
		return this.item;
	}
	
	public void addItems(Item item ) {
		
		this.item.add(item);
		
	}
	
	

}
