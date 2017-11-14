package by.artur.filmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Producer extends Staff{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producer")
	private int id_producer;
	
	
	protected int getId_producer() {
		return id_producer;
	}

	protected void setId_producer(int id_producer) {
		this.id_producer = id_producer;
	}


	@Override
	public String toString() {
		return "Producer [id_producer=" + id_producer + ", name=" + name + ", lastname=" + lastname + ", age=" + age
				+ ", tel_no=" + tel_no + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id_producer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producer other = (Producer) obj;
		if (id_producer != other.id_producer)
			return false;
		return true;
	}

	public Producer(String name, String lastname, int age, String tel_no,int id_producer) {
		super(name, lastname, age, tel_no);
		this.id_producer=id_producer;
	}

	
}
