package comy.crud.mock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comy.crud.mock.models.Movie;
import comy.crud.mock.repository.IMovieRepository;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieRepository movieRepository;
	
	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(int id) {
		Optional<Movie> opt =  movieRepository.findById(id);
		return opt.get();
	}

	@Override
	public Movie updateMovieById(int id, Movie movie) {
		movie.setId(id);
		return movieRepository.save(movie);
	}

	@Override
	public void deleteMovieById(int id) {

		movieRepository.deleteById(id);
	}


}
