package com.sinensia.cafetera;

public class Cafetera {

	private Integer capacidadMaxima;
	
	private Integer cantidadActual;

	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	public Cafetera(Integer capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}

	public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
		super();
		if(cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}else {
			this.cantidadActual = cantidadActual;
		}
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(Integer cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
		System.out.println("La taza de cafe se ha llenado.");
	}
	
	public void servirTaza(int cantidad) {
		System.out.println(String.format("Sirviendo %s de cafe.", (cantidad <= this.cantidadActual)? cantidad : this.cantidadActual));
	}
	
	public void vaciarCafetera() {
		System.out.println("Vaciando cafetera...");
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		int cafe = ((cantidad + this.cantidadActual) < this.capacidadMaxima)? cantidad : (this.capacidadMaxima - this.cantidadActual);
		this.cantidadActual += cafe;
		System.out.print("Agregando cafe... ");
		if (cafe == 0) {
			System.out.println("La taza está llena no se puede agregar más cafe.");
		}else {
			System.out.println(String.format("Agregado %s de café.", cafe));
		}
	}
	
	
}
