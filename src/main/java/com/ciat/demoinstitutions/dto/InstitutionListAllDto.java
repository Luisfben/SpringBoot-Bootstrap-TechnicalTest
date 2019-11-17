package com.ciat.demoinstitutions.dto;

public class InstitutionListAllDto {
	private Long id_institution;
	private String headquarter;
	private String acronym;
	private String name;
	private String location;

	public InstitutionListAllDto(Long id_institution, String headquarter, String acronym, String name, String location) {
		super();
		this.id_institution = id_institution;
		this.headquarter = headquarter;
		this.acronym = acronym;
		this.name = name;
		this.location = location;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getId_institution() {
		return id_institution;
	}

	public void setId_institution(Long id_institution) {
		this.id_institution = id_institution;
	}
	
}
