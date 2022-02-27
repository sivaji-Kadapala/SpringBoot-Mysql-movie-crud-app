package comy.crud.mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import comy.crud.mock.models.Movie;
import comy.crud.mock.service.IMovieService;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@Autowired
	private IMovieService movieService;
	
	@PostMapping("/add")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
		
		return new ResponseEntity<Movie>(movieService.addMovie(movie), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/get")
	public Movie getMovieById(@RequestParam int id) {
		
		return movieService.getMovieById(id);
	}
	
	@PutMapping("/update")
	public Movie updateMovieById(@RequestParam int id, @RequestBody Movie movie) {
		return movieService.updateMovieById(id, movie);
	}
	
	@DeleteMapping("/delete")
	public void deleteMovieById(@RequestParam int id) {
		movieService.deleteMovieById(id);
	}
	
}
