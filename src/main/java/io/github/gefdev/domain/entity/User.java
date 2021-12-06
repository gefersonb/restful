package io.github.gefdev.domain.entity;

import java.util.Set;

import javax.persistence.*;

import io.github.gefdev.config.DatabaseConfig;



@Entity
@Table(schema=DatabaseConfig.SCHEMA_DATABASE, name = "USUARIO2")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String email;
	
	@ManyToMany
	@JoinTable(
			schema=DatabaseConfig.SCHEMA_DATABASE,
			  name = "USER_ROLE", 
			  joinColumns = @JoinColumn(name = "ID_USER"), 
			  inverseJoinColumns = @JoinColumn(name = "ID_ROLE"))
	private Set<Role> roles;
	
	public User() {
	}

	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	

}
