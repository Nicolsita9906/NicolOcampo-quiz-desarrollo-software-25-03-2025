package com.example.demo;
import java.util.UUID;
import funcionalidad.Marca;
public class Moto {
	String id;
	Marca marca;
	String placa;
	int cilindraje;
	double precio;
	String color;
	
	public Moto () {
		this.id = UUID.randomUUID().toString(); 
	}

	public Moto(Marca marca, String placa, int cilindraje, double precio, String color) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.precio = precio;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
