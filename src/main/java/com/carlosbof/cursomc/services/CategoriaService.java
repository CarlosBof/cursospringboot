package com.carlosbof.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosbof.cursomc.domain.Categoria;
import com.carlosbof.cursomc.exceptions.ObjectNotFoundException;
import com.carlosbof.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: (" + id + "), Tipo: " + Categoria.class.getName()));
	}
	
}
