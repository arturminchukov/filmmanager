package by.artur.filmanager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Selling")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_sell")
	private int id_sell;
	
	@ManyToOne
	@JoinColumn(name="id_film",referencedColumnName="id_film")
	private Film id_film;
	
	@ManyToOne
	@JoinColumn(name="id_client",referencedColumnName="id_client")
	private Client id_client;
	
	@Column(name="app_date")
	private Date app_date;
	
	@Column(name="process_date")
	private Date process_date;
	
	@ManyToOne
	@JoinColumn(name="id_status",referencedColumnName="id_status")
	private SellStatus id_status;
	
	public int getId_sell() {
		return id_sell;
	}

	public void setId_sell(int id_sell) {
		this.id_sell = id_sell;
	}

	public Film getId_film() {
		return id_film;
	}

	public void setId_film(Film id_film) {
		this.id_film = id_film;
	}

	public Client getId_client() {
		return id_client;
	}

	public void setId_client(Client id_client) {
		this.id_client = id_client;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public Date getProcess_date() {
		return process_date;
	}

	public void setProcess_date(Date process_date) {
		this.process_date = process_date;
	}

	public SellStatus getId_status() {
		return id_status;
	}

	public void setId_status(SellStatus id_status) {
		this.id_status = id_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((app_date == null) ? 0 : app_date.hashCode());
		result = prime * result + ((id_client == null) ? 0 : id_client.hashCode());
		result = prime * result + ((id_film == null) ? 0 : id_film.hashCode());
		result = prime * result + id_sell;
		result = prime * result + ((id_status == null) ? 0 : id_status.hashCode());
		result = prime * result + ((process_date == null) ? 0 : process_date.hashCode());
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
		Orders other = (Orders) obj;
		if (app_date == null) {
			if (other.app_date != null)
				return false;
		} else if (!app_date.equals(other.app_date))
			return false;
		if (id_client == null) {
			if (other.id_client != null)
				return false;
		} else if (!id_client.equals(other.id_client))
			return false;
		if (id_film == null) {
			if (other.id_film != null)
				return false;
		} else if (!id_film.equals(other.id_film))
			return false;
		if (id_sell != other.id_sell)
			return false;
		if (id_status == null) {
			if (other.id_status != null)
				return false;
		} else if (!id_status.equals(other.id_status))
			return false;
		if (process_date == null) {
			if (other.process_date != null)
				return false;
		} else if (!process_date.equals(other.process_date))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orders [id_sell=" + id_sell + ", id_film=" + id_film.getName() + ", id_client=" + id_client.getCompany()+" "+id_client.getName() + ", app_date="
				+ app_date + ", process_date=" + process_date + ", id_status=" + id_status.getName() + "]";
	}

	public Orders(int id_sell, Film id_film, Client id_client, Date app_date, Date process_date, SellStatus id_status) {
		super();
		this.id_sell = id_sell;
		this.id_film = id_film;
		this.id_client = id_client;
		this.app_date = app_date;
		this.process_date = process_date;
		this.id_status = id_status;
	}

	public Orders() {
		super();
	}

	public Orders(int id_sell, Film id_film, Client id_client, Date app_date, SellStatus id_status) {
		super();
		this.id_sell = id_sell;
		this.id_film = id_film;
		this.id_client = id_client;
		this.app_date = app_date;
		this.id_status = id_status;
	}

	public Orders(Film id_film, Client id_client, Date app_date, SellStatus id_status) {
		super();
		this.id_film = id_film;
		this.id_client = id_client;
		this.app_date = app_date;
		this.id_status = id_status;
	}

	
	
}
