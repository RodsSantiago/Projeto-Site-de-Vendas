package com.dscatalog.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//injecao de dependencia automatizada - objeto da camada de servico 
//vai acessar o repositorio e chamar no banco de dado as categorias

import org.springframework.stereotype.Service;

import com.dscatalog.dscatalog.entities.Category;
import com.dscatalog.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> finAll(){
		return repository.findAll();
		
	}

}
