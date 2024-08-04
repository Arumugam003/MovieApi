package com.volley.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.volley.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
  
	
	
}
