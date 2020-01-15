package com.platzi.javatest.movies.data;

import java.util.Collection;

import com.platzi.javatest.movies.model.Movie;

public interface MovieRepository {
	
	Movie findById(long id);
	Collection<Movie> findAll();
	void saveOrUpdate(Movie movie);

}
