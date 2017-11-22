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
public class Roles {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	private int id_role;
	
	@Column(name="name",length=30,nullable=false,unique=true)
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="role")
	private Set<Users> users = new HashSet<>();
	
	public void addUsers(Users user) {
		user.setRole(this);
		this.users.add(user);
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
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
		result = prime * result + id_role;
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
		Roles other = (Roles) obj;
		if (id_role != other.id_role)
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
		return "Role [id_role=" + id_role + ", name=" + name + /*", users="+users.toString() +*/"]";
	}

	public Roles(int id_role, String name, Set<Users> users) {
		super();
		this.id_role = id_role;
		this.name = name;
		this.users = users;
	}

	public Roles() {
		super();
	}

	public Roles(int id_role, String name) {
		super();
		this.id_role = id_role;
		this.name = name;
	}

	
	
}
