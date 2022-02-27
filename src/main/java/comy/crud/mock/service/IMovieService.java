package comy.crud.mock.service;

import java.util.List;

import comy.crud.mock.models.Movie;

public interface IMovieService {

	Movie addMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie getMovieById(int id);

	Movie updateMovieById(int id, Movie movie);

	void deleteMovieById(int id);


}
