package com.movie.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movie.demo.entity.Catalog;
import com.movie.demo.entity.MovieInfo;
import com.movie.demo.entity.Rating;
import com.movie.demo.repository.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	CatalogRepository catRep;
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Catalog> getAllCatalog(){
		
		
//		Arrays.asList(clsName.getMethods()).stream().forEach(t-> System.out.println(t));
		
		return catRep.findAll();
	}
	
	public void saveCatalog(Catalog cat) {
		catRep.save(cat);
	}

	public Catalog getCatalogById(int id) {
		MovieInfo mov =restTemplate.getForObject("http://movie-info-service/movie/"+id, MovieInfo.class);
		Rating rat = restTemplate.getForObject("http://rating-data-service/rating/"+id, Rating.class);
		System.out.println(">>>>>>>>>>"+mov);
		Catalog cat = catRep.findById(id);
		cat.setDesc(mov.getName());
		cat.setRating(rat.getRating());
		
		return cat;
		
	}
}
