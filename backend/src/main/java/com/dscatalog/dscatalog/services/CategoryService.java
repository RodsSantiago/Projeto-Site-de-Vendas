package com.dscatalog.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

//injecao de dependencia automatizada - objeto da camada de servico 
//vai acessar o repositorio e chamar no banco de dado as categorias

import org.springframework.stereotype.Service;

import com.dscatalog.dscatalog.dto.CategoryDTO;
import com.dscatalog.dscatalog.entities.Category;
import com.dscatalog.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		
		// A funcao map transforma cada elemento original em alguma outra coisa, aplicando uma funcao a cada elemento da sua lista
		// o resultado sera uma stream entao para isso usar o .collect para transformar de volta para lista
		List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		return listDto;
		
		/*
		 * foreach de como converter
		List<CategoryDTO> listDto = new ArrayList<>();
		for (Category category : list) {
			listDto.add(new CategoryDTO(category));
		}
		
		return listDto;*/
		
	}

}
