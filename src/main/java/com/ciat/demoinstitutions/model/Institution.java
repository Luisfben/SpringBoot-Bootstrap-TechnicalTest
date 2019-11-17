package com.ciat.demoinstitutions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "institution")
public class Institution {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_institution;

	@Column
	private Long id_headquarter;

	@Column
	private Long id_type_institution;

	@Column
	private Long id_country;

	@Column
	private String acronym;

	@Column
	private String name;

	@Column
	private String city;

	@Column
	private String website;

	public Long getId_institution() {
		return id_institution;
	}

	public void setId_institution(Long id_institution) {
		this.id_institution = id_institution;
	}

	public Long getId_headquarter() {
		return id_headquarter;
	}

	public void setId_headquarter(Long id_headquarter) {
		this.id_headquarter = id_headquarter;
	}

	public Long getId_type_institution() {
		return id_type_institution;
	}

	public void setId_type_institution(Long id_type_institution) {
		this.id_type_institution = id_type_institution;
	}

	public Long getId_country() {
		return id_country;
	}

	public void setId_country(Long id_country) {
		this.id_country = id_country;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
