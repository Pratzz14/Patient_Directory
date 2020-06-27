package com.patient.patient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/Patients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@RequestMapping("/Patients/{name}")
	public Patient getPatient(@PathVariable String name) {
		return patientService.getPatient(name);
	}
	
	
	
	   @GetMapping("/Patients-html")
	    public ModelAndView htmlView(Model model)
	  {    
		  List<Patient> patient= Arrays.asList(
					
					new Patient("Pratik",19,"26 June 2020",123,"Fever"),
					new Patient("Medha",19,"26 June 2020",123,"Fever"),
					new Patient("Janice",19,"26 June 2020",123,"Fever"),
					new Patient("Pratik",19,"26 June 2020",123,"Fever"),
					new Patient("Medha",19,"26 June 2020",123,"Fever"),
					new Patient("Janice",19,"26 June 2020",123,"Feverrrr")
					
					);

	        ModelAndView mav = new ModelAndView();
	        mav.addObject("patient", patient);
	
	        mav.setViewName("patient.html");  
	        
	        return mav;
	  }

	   
	
	
	
}
