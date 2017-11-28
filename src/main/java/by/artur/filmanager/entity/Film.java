package by.artur.filmanager.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Film {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="id_film")
	private int id_film;
	
	@Column(name="name", length=30,nullable=false)
	private String name;
	
	@Column(name="release_date",nullable=false)
	private Date release_date;
	
	@ManyToOne
	@JoinColumn(name = "id_genre", referencedColumnName = "id_genre")
	private Genre id_genre;
	
	@ManyToOne
	@JoinColumn(name = "id_producer", referencedColumnName = "id_producer")
	private Producer id_producer;
	
	@Column(name="price")
	private double price;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="id_sell")
	private Set<Orders> orders=new HashSet<>();
	
	public void addOrder(Orders order) {
		order.setId_film(this);
		this.orders.add(order);
	}

	public int getId_film() {
		return id_film;
	}

	public void setId_film(int id_film) {
		this.id_film = id_film;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public Genre getId_genre() {
		return id_genre;
	}

	public void setId_genre(Genre id_genre) {
		this.id_genre = id_genre;
	}

	public Producer getId_producer() {
		return id_producer;
	}

	public void setId_producer(Producer id_producer) {
		this.id_producer = id_producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_film;
		result = prime * result + ((id_genre == null) ? 0 : id_genre.hashCode());
		result = prime * result + ((id_producer == null) ? 0 : id_producer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((release_date == null) ? 0 : release_date.hashCode());
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
		Film other = (Film) obj;
		if (id_film != other.id_film)
			return false;
		if (id_genre == null) {
			if (other.id_genre != null)
				return false;
		} else if (!id_genre.equals(other.id_genre))
			return false;
		if (id_producer == null) {
			if (other.id_producer != null)
				return false;
		} else if (!id_producer.equals(other.id_producer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (release_date == null) {
			if (other.release_date != null)
				return false;
		} else if (!release_date.equals(other.release_date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Film [id_film=" + id_film + ", name=" + name + ", release_date=" + release_date + ", id_genre="
				+ id_genre.getName() + ", id_producer=" + id_producer.getName() + ", price=" + price + "]";
	}

	public Film() {
		super();
	}

	public Film(int id_film, String name, Date release_date, Genre id_genre, Producer id_producer, double price) {
		super();
		this.id_film = id_film;
		this.name = name;
		this.release_date = release_date;
		this.id_genre = id_genre;
		this.id_producer = id_producer;
		this.price = price;
	}

	public Film(String name, Date release_date, Genre id_genre, Producer id_producer, double price) {
		super();
		this.name = name;
		this.release_date = release_date;
		this.id_genre = id_genre;
		this.id_producer = id_producer;
		this.price = price;
	}
	
	
}
