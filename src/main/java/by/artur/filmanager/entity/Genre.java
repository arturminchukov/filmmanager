package by.artur.filmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="id_genre")
	private int id_genre;
	
	@Column(name="name",length=25,nullable=true)
	private String name;
	
	@Column(name="description",nullable=true,unique=true)
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="id_genre")
	private Set<Film> films=new HashSet<>();
	
	
	public void addFilm(Film film) {
		film.setId_genre(this);
		this.films.add(film);
	}


	public int getId_genre() {
		return id_genre;
	}


	public void setId_genre(int id_genre) {
		this.id_genre = id_genre;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Film> getFilms() {
		return films;
	}


	public void setFilms(Set<Film> films) {
		this.films = films;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id_genre;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id_genre != other.id_genre)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Genre [id_genre=" + id_genre + ", name=" + name + ", description=" + description + "]";
	}


	public Genre(int id_genre, String name, String description) {
		super();
		this.id_genre = id_genre;
		this.name = name;
		this.description = description;
	}


	public Genre() {
		super();
	}
	
	
}
