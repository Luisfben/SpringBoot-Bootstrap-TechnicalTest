package com.ciat.demoinstitutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciat.demoinstitutions.dto.InstitutionListAllDto;
import com.ciat.demoinstitutions.model.Country;
import com.ciat.demoinstitutions.model.Institution;
import com.ciat.demoinstitutions.model.TypeInstitution;
import com.ciat.demoinstitutions.repository.CountryRepository;
import com.ciat.demoinstitutions.repository.InstitutionRepository;
import com.ciat.demoinstitutions.repository.TypeInstitutionRepository;

@Controller
public class InstitutionsController {

	@Autowired
	private InstitutionRepository institutionRepository;

	@Autowired
	private TypeInstitutionRepository typeInstitutionRepository;

	@Autowired
	private CountryRepository countryRepository;

	@RequestMapping("/")
	public String index(Model model) {
		List<InstitutionListAllDto> institutionListAllDto = institutionRepository.InstitutionListAllDto();
		model.addAttribute("institutions", institutionListAllDto);

		return "index";
	}

	@RequestMapping(path = "/remove", method = RequestMethod.GET)
	public String remove(
			@RequestParam(value = "id_institution", required = true, defaultValue = "") String id_institution,
			Model model) {
		institutionRepository.deleteById(new Long(id_institution));

		return "redirect:/";
	}

	@RequestMapping("/addInstitution")
	public String addInstitution(Model model) {
		List<InstitutionListAllDto> institutionListHeadquarterDto = institutionRepository
				.InstitutionListHeadquarterDto();
		List<TypeInstitution> typeInstitutions = typeInstitutionRepository.findAll();
		List<Country> countrys = countryRepository.findAll();

		model.addAttribute("institutions", institutionListHeadquarterDto);
		model.addAttribute("typeinstitutions", typeInstitutions);
		model.addAttribute("countrys", countrys);

		return "addInstitution";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("form") Institution institution, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		if (institution.getId_headquarter() == null) {
			institution.setId_headquarter(new Long(0));
		}

		institutionRepository.save(institution);

		return "redirect:/";
	}
}
