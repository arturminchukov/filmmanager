package by.artur.filmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id_client;
	
	@Column(name="company", length=25,nullable=false)
	private String company;
	
	@Column(name="name",length=25, nullable=true)
	private String name;
	
	@Column(name="tel_no",length=12, nullable=true,unique=true)
	private String tel_no;
	
	@Column(name="address",length=50,nullable=true)
	private String address;

	@OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private Users user;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="id_sell")
	private Set<Orders> orders=new HashSet<>();
	
	public void addOrder(Orders order) {
		order.setId_client(this);
		this.orders.add(order);
	}
	
	
	public Set<Orders> getOrders() {
		return orders;
	}


	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}


	public void addUser(Users user) {
		user.setClient(this);
		this.user = user;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + id_client;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tel_no == null) ? 0 : tel_no.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Client other = (Client) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (id_client != other.id_client)
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", company=" + company + ", name=" + name + ", tel_no=" + tel_no
				+ ", address=" + address + ", user=" + user + "]";
	}

	public Client(String company, String name, String tel_no, String address, Users user) {
		super();
		this.company = company;
		this.name = name;
		this.tel_no = tel_no;
		this.address = address;
		addUser(user);
	}

	public Client() {
		super();
	}
	
	
	
}
