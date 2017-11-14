package by.artur.filmanager.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int id_user;
	
	@Column(name="email", length=30, nullable=false, unique=true)
	private String email;
	
	@Column(name="password", length=25, nullable=false)
	private String password;
	
	@ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id_role")
	//@Column(name="role", nullable=false)
	private Roles role;
	
	/*@ManyToOne
    @JoinColumn(name = "del_st", referencedColumnName = "id_status")*/
	@Column(name="del_status",nullable=false)
	private int del_status;
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Client client;*/
	
	
	/*public void addClient(Client client) {
		client.setUser(this);
		this.client=client;;
	}*/

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getDel_status() {
		return del_status;
	}

	public void setDel_status(int del_status) {
		this.del_status = del_status;
	}





	@Override
	public String toString() {
		return "Users [id_user=" + id_user + ", email=" + email + ", password=" + password + ", role= del_status=" + del_status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + del_status;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id_user;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		//result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Users other = (Users) obj;
		if (del_status != other.del_status)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id_user != other.id_user)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	public Users(int id_user, String email, String password, Roles role, int del_status) {
		super();
		this.id_user = id_user;
		this.email = email;
		this.password = password;
		this.role = role;
		this.del_status = del_status;
	}

	public Users() {
		super();
	}
	
	
}
