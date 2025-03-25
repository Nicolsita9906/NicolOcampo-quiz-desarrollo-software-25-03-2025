package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import funcionalidad.Marca;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/motos")
public class MotoController {

    private final MotoService control;

    @Autowired
    public MotoController(MotoService control) {
        this.control = control;
    }

    // Obtener todas las motos
    @GetMapping
    public Map<Marca, List<Moto>> obtenerMotos() {
        return control.obtenerMotos();
    }

    // Crear una nueva moto
    @PostMapping
    public Moto crearMoto(@RequestBody Moto moto) {
        return control.crearMoto(moto);
    }

    // Buscar una moto por ID (placa)
    @GetMapping("/{placa}")
    public Moto buscarPorId(@PathVariable String placa) {
        return control.buscarPorId(placa);
    }

    // Buscar motos por cilindraje
    @GetMapping("/buscarPorCilindraje")
    public List<List<Moto>> buscarPorCilindraje(@RequestParam int cilindraje) {
        return control.buscarPorCilindraje(cilindraje);
    }

    // Actualizar una moto
    @PutMapping
    public Moto actualizar(@RequestBody Moto moto) {
        return control.actualizar(moto);
    }

    // Eliminar una moto por ID
    @DeleteMapping("/{id}")
    public void eliminarMoto(@PathVariable String id) {
        control.eliminarMoto(id);
    }
}

