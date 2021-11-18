package com.dscatalog.dscatalog.resources;
//resource implementa o controlador rest
//sao os recursos que serao disponibilizados para as aplicacoes utilizarem
//seram os controladores rest, respondera requisicoes
//nessa classe teram endpoints (para listar, buscar, deletar as categorias)
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscatalog.dscatalog.dto.CategoryDTO;
import com.dscatalog.dscatalog.services.CategoryService;
import com.dscatalog.dscatalog.services.exceptions.EntityNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {
		
		List<CategoryDTO> list = service.findAll();
		
		/*
		 *Mock das listas 
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Livros"));
		list.add(new Category(2L, "Eletronicos"));*/
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
		CategoryDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
		
	}
	

}
