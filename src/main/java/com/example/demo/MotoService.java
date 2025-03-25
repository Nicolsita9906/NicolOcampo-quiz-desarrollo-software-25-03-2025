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
