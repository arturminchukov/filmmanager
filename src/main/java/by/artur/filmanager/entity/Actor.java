package by.artur.filmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor extends Staff{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_actor")
	private int id_actor;
	
	protected int getId_actor() {
		return id_actor;
	}


	protected void setId_actor(int id_actor) {
		this.id_actor = id_actor;
	}


	@Override
	public String toString() {
		return "Actor [id_actor=" + id_actor + ", name=" + name + ", lastname=" + lastname + ", age=" + age
				+ ", tel_no=" + tel_no + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		if (id_actor != other.id_actor)
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id_actor;
		return result;
	}


	public Actor(String name, String lastname, int age, String tel_no, int id_actor) {
		super(name, lastname, age, tel_no);
		this.id_actor=id_actor;
	}


	

}
