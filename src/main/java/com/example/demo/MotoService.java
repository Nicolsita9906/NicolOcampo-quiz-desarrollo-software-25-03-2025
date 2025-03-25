package com.example.demo;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.*;

import funcionalidad.Marca;

@Service 
public class MotoService {

	private MotoRepository servicio;
	
	public MotoService (MotoRepository servicio) {
		this.servicio = servicio;
		
		
	}
	
	public void datosMuertos () {
		crearMoto (new Moto (Marca.KAWASAKI, "PL456L", 150, 500.6, "VERDE" ));
		crearMoto (new Moto (Marca.HONDA, "DL456LL", 250, 500.6, "NEGRA" ));
		crearMoto (new Moto (Marca.KAWASAKI, "KJR567MJ", 350, 500.6, "VERDE" ));
		crearMoto (new Moto (Marca.VICTORY, "HG456L", 150, 500.6, "AZUL" ));
		crearMoto (new Moto (Marca.YAMAHA, "PL233L", 150, 500.6, "NEGRA" ));
		
	}
	
	public Map <Marca, List<Moto>> obtenerMotos (){
		return servicio.obtenerMotos();
	}
	public Moto crearMoto (Moto moto) {
		return servicio.crearMoto(moto);
	}
	public Moto buscarPorId(String placa) {
		return servicio.buscarPorId(placa);
	}
	public List<List<Moto>> buscarPorCilindraje (int cilindraje) {
		return servicio.buscarPorCilindraje(cilindraje);
	}
	 public Moto actualizar(Moto moto) {
		 return servicio.actualizar(moto);
	 }
	 public void eliminarMoto (String id) {
		 servicio.eliminarMoto(id);
	 }
	
	
}
