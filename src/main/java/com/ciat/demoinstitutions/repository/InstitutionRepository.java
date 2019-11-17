package com.ciat.demoinstitutions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ciat.demoinstitutions.model.Institution;
import com.ciat.demoinstitutions.dto.InstitutionListAllDto;;


@Repository 
public interface InstitutionRepository extends JpaRepository<Institution, Long>{
	
	@Query("SELECT new com.ciat.demoinstitutions.dto.InstitutionListAllDto(i.id_institution, " + 
		"CASE WHEN i.id_headquarter = 0 THEN 'Yes' ELSE 'No' END as headquarter, " +
		"i.acronym, " +
		"i.name, " +
		"concat(i.city, ', ', c.name) as location) " +
		"FROM Institution i " +
		"INNER JOIN Country c " + 
		"ON i.id_country = c.id_country")
	List<InstitutionListAllDto> InstitutionListAllDto();

	@Query("SELECT new com.ciat.demoinstitutions.dto.InstitutionListAllDto(i.id_institution, " + 
			"CASE WHEN i.id_headquarter = 0 THEN 'Yes' ELSE 'No' END as headquarter, " +
			"i.acronym, " +
			"i.name, " +
			"concat(i.city, ', ', c.name) as location) " +
			"FROM Institution i " +
			"INNER JOIN Country c " + 
			"ON i.id_country = c.id_country " + 
			"WHERE i.id_headquarter = 0")
	List<InstitutionListAllDto> InstitutionListHeadquarterDto();

}
