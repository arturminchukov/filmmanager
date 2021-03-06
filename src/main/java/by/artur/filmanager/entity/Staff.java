package by.artur.filmanager.entity;

import javax.persistence.Column;


public abstract class Staff {
	
	@Column(name="name", length=25,nullable=false)
	protected String name;
	
	@Column(name="lastname", length=25,nullable=false)
	protected String lastname;
	
	@Column(name="age", nullable=true)
	protected int age;
	
	@Column(name="tel_no",length=12, nullable=true)
	protected String tel_no;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Staff other = (Staff) obj;
		if (age != other.age)
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

	@Override
	public abstract String toString();

	public Staff(String name, String lastname, int age, String tel_no) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.tel_no = tel_no;
	}

	public Staff() {
		super();
	}

	

	
}
