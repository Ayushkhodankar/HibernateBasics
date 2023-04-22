package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
private int id;
	@Column
	private String fullname;

	public User() {
		super();
		
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(String name) {
		super();
		this.fullname = name;
	}

	public String getName() {
		return fullname;
	}

	public void setName(String name) {
		this.fullname = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
