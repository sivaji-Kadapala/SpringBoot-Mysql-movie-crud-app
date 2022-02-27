package comy.crud.mock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comy.crud.mock.models.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {

}
