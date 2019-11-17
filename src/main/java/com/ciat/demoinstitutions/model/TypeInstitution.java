package com.ciat.demoinstitutions.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.ciat.demoinstitutions.model.Institution;

@Entity
public class TypeInstitution {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_type_institution;

	@Column
	private String name;

	public Long getId_type_institution() {
		return id_type_institution;
	}

	public void setId_type_institution(Long id_type_institution) {
		this.id_type_institution = id_type_institution;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
