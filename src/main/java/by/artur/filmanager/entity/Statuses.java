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
import javax.persistence.Table;

@Entity
@Table(name="statuses")
public class Statuses {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_status")
	private int id_status;
	
	@Column(name="name",length=30,nullable=false)
	private String name;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "del_status")
	private Set<Users> users = new HashSet<>();
	
	public void addUsers(Users user) {
		user.setDel_status(this);
		this.users.add(user);
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

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_status;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Statuses other = (Statuses) obj;
		if (id_status != other.id_status)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Statuses [id_status=" + id_status + ", name=" + name + /*", users=" + users +*/ "]";
	}

	public Statuses(int id_status, String name, Set<Users> users) {
		super();
		this.id_status = id_status;
		this.name = name;
		this.users = users;
	}

	public Statuses() {
		super();
	}

	public Statuses(int id_status, String name) {
		super();
		this.id_status = id_status;
		this.name = name;
	}
	
	
}
