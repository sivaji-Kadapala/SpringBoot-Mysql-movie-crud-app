package comy.crud.mock.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String language;
	private String director;
	private String Genre;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int id, String name, String language, String director, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.director = director;
		Genre = genre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", director=" + director + ", Genre="
				+ Genre + "]";
	}
	
	
	

	
	
	
}
