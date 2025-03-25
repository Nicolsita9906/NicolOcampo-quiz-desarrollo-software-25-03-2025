package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import funcionalidad.Marca;

@Repository
public class MotoRepository {
	final Map <Marca, List<Moto>> db = new HashMap<>();
}
