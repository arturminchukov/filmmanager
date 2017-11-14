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
	
	
	
}
