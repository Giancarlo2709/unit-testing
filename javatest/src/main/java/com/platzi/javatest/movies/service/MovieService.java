package com.platzi.javatest.movies.service;

import java.util.Collection;
import java.util.stream.Collectors;

import com.platzi.javatest.movies.data.MovieRepository;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;

public class MovieService {
	
	private MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Collection<Movie> findByMoviesByGenre(Genre comedy) {
		return movieRepository.findAll().stream()
				.filter(movie-> Genre.COMEDY.equals(movie.getGenre())).collect(Collectors.toList());
	}

	public Collection<Movie> findByMoviesByLength(int length) {
		return movieRepository.findAll().stream()
				.filter(movie-> movie.getMinutes() <= length).collect(Collectors.toList());
	}
	
	      

}
