package com.sinensia.cafetera;

public class Cafeteria {

	public static void main(String[] args) {
		
		Cafetera cafetera = new Cafetera();
		
		cafetera.agregarCafe(500);
		
		cafetera.servirTaza(100);
		
		cafetera.llenarCafetera();
		
		cafetera.agregarCafe(100);
		
		cafetera.vaciarCafetera();
		
	}
}
