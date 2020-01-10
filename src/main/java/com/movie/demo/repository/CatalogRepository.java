package com.movie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.demo.entity.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Integer> {

	@Query("select c from Catalog c where id=:id")
	public Catalog findById(@Param("id") int id);
}



