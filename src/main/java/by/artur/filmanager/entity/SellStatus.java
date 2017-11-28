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

@Entity(name="sell_status")
public class SellStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_status")
	private int id_status;
	
	@Column(name="name",nullable=false ,unique=true)
	private String name;
	

	@OneToMany(cascade=CascadeType.ALL,mappedBy="id_sell")
	private Set<Orders> orders=new HashSet<>();
	
	
	public void addOrder(Orders order) {
		order.setId_status(this);
		this.orders.add(order);
	}
	
	public int getId_status() {
		return id_status;
	}

	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		result = prime * result + id_status;
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
		SellStatus other = (SellStatus) obj;
		if (id_status != other.id_status)
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
		return "SellStatus [id_status=" + id_status + ", name=" + name + ", orders=" + orders + "]";
	}

	public SellStatus(int id_status, String name) {
		super();
		this.id_status = id_status;
		this.name = name;
	}

	public SellStatus() {
		super();
	}
	
	
}
