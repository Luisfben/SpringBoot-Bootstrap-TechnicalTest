package com.ciat.demoinstitutions.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_country;

	@Column
	private String name;

	public Long getId_country() {
		return id_country;
	}

	public void setId_country(Long id_country) {
		this.id_country = id_country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
