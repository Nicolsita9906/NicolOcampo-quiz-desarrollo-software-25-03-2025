package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import funcionalidad.Marca;
import com.example.demo.*;

@Repository
public class MotoRepository {
	final Map <Marca, List<Moto>> db = new HashMap<>();
	public MotoRepository() {
	 for (Marca marca : Marca.values()) {
         db.put(marca, new ArrayList<>()); 
	 	}
	}
	//obtener todas las motos
	public Map <Marca, List<Moto>> obtenerMotos (){
		return db;
	}
	//crear motos
	public Moto crearMoto (Moto moto) {
		 db.get(moto.getMarca()).add(moto);
		 return moto;
	 }
	//buscar por placa
	 public Moto buscarPorId(String placa) {
		for (List<Moto> listaMotos : db.values()) {
		 for (Moto moto : listaMotos) {
			 if (placa.equals(moto.getId())) { 
			   return moto; // Producto encontrado
		  }
	    }
	  }
       return null; // No encontrado
	}
	 
	 //mostrar motos por cilindraje
	 public List<List<Moto>> buscarPorCilindraje (int cilindraje) {
		 return db.values().stream()
				    .filter(u -> ((Moto) u).getCilindraje() == cilindraje)
	                .collect(Collectors.toList());
	 }
	 
	 //actualizar moto
	 public Moto actualizar(Moto moto) {
		    for (List<Moto> listaMotos : db.values()) {
		        for (int i = 0; i < listaMotos.size(); i++) {
		            if (listaMotos.get(i).getId().equals(moto.getId())) {
		                listaMotos.set(i, moto); 
		                return moto;
		            }
		        }
		    }
		    return null; // No encontrada
		}

	 
	 //eliminar usuario
	 public void eliminarMoto (String id) {
		 db.remove(id);
	 }
}
