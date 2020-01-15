package com.platzi.javatest.movies.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.platzi.javatest.movies.data.MovieRepository;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;

public class MovieServiceShould {
	
	private MovieRepository movieRepository;
	private MovieService movieService;
	
	@Before
	public void setup() throws Exception {
		movieRepository = Mockito.mock(MovieRepository.class);
		Mockito.when(movieRepository.findAll()).thenReturn(
				Arrays.asList(
						new Movie(1, "Dark Knight", 152, Genre.ACTION),
						new Movie(2, "Memento", 113, Genre.THRILLER),
						new Movie(3, "There's Somenthing About Mary", 119, Genre.COMEDY),
						new Movie(4, "Super 8", 112, Genre.THRILLER),
						new Movie(5, "Scream", 111, Genre.HORROR),
						new Movie(6, "Home Alone", 103, Genre.COMEDY),  
						new Movie(7, "Matrix", 136, Genre.ACTION)
				)
		);
		
		movieService = new MovieService(movieRepository);
	}

	@Test
	public void return_movies_by_genre() {		
		Collection<Movie> movies = movieService.findByMoviesByGenre(Genre.COMEDY);
		
		assertThat(getMoviesIds(movies), is(Arrays.asList(3,6)));
	}
	
	@Test
	public void return_movies_by_length() {
		Collection<Movie> movies = movieService.findByMoviesByLength(119);		
		
		assertThat(getMoviesIds(movies), is(Arrays.asList(2,3,4,5,6)));
	}

	private List<Integer> getMoviesIds(Collection<Movie> movies) {
		return movies.stream().map(Movie::getId).collect(Collectors.toList());
	}
	
	

}
