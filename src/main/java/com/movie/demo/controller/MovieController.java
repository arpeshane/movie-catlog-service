package com.movie.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.demo.entity.Catalog;
import com.movie.demo.service.CatalogService;

@RestController
public class MovieController {

	@Autowired
	CatalogService catSer;
	
	@GetMapping("catalog")
	public List<Catalog> getMovieCatalog() {
		return catSer.getAllCatalog();
	}
	@PostMapping("saveCatalog")
	public void saveCatalog(@RequestBody Catalog catlog) {
		catSer.saveCatalog(catlog);
	}
	@GetMapping("catalog/{id}")
	public Catalog getMovieCatalogById(@PathVariable("id") int id) {
		return catSer.getCatalogById(id);
	}
}
