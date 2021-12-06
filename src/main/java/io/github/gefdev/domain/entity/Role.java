package io.github.gefdev.domain.entity;

import javax.persistence.*;

import io.github.gefdev.config.DatabaseConfig;


@Entity
@Table(schema=DatabaseConfig.SCHEMA_DATABASE, name = "ROLE2")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
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
	
	
	
}
