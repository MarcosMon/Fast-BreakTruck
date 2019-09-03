package org.lasencinas.BreakFast;

public class FastBreakTruck {

	public static Desayuno prepararEyeHoles() {
		
		Desayuno desayuno = new Desayuno();
		
		desayuno.addItems(new Eyeholes());
		desayuno.addItems(new TurbulentJuice());

		return desayuno;
	}

	public static Desayuno prepararSmiggles() {
		
		Desayuno desayuno = new Desayuno();
		
		desayuno.addItems(new Smiggles());
		desayuno.addItems(new FleebJuice());
		
		return desayuno;
	}

	public static void incluirJuguete(Desayuno eyeDes) {
		
		eyeDes.addItems(new Plumbus());
	}

}
