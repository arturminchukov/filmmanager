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
public class Producer{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producer")
	private int id_producer;
	
	
	@Column(name="name", length=25,nullable=false)
	private String name;
	

	@Column(name="lastname", length=25,nullable=false)
	private String lastname;
	
	@Column(name="age", nullable=true)
	private int age;
	
	@Column(name="tel_no",length=12, nullable=true)
	private String tel_no;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="id_producer")
	private Set<Film> films = new HashSet<>();
	
	public void addFilm(Film film) {
		film.setId_producer(this);
		this.films.add(film);
	}

	public int getId_producer() {
		return id_producer;
	}

	public void setId_producer(int id_producer) {
		this.id_producer = id_producer;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Producer [name=" + name + ", lastname=" + lastname + ", age=" + age + ", tel_no="
				+ tel_no + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id_producer;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tel_no == null) ? 0 : tel_no.hashCode());
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
		Producer other = (Producer) obj;
		if (age != other.age)
			return false;
		if (id_producer != other.id_producer)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tel_no == null) {
			if (other.tel_no != null)
				return false;
		} else if (!tel_no.equals(other.tel_no))
			return false;
		return true;
	}

	public Producer(String name, String lastname, int age, String tel_no) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.tel_no = tel_no;
	}

	public Producer() {
		super();
	}

	
	
}
