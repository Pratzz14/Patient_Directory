package com.patient.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method=RequestMethod.POST,value="/Patients")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Patients/{name}")
	public void updatePatient(@RequestBody Patient patient,@PathVariable String name) {
		patientService.updatePatient(name,patient);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Patients/{name}")
	public void deletePatient(@PathVariable String name) {
		patientService.deletePatient(name);
	}	
	
	
	// Using to display JSON data in html webpage.
	   @GetMapping("/Patients-html")
	    public ModelAndView htmlView(Model model)
	  {    
		  List<Patient> patient= patientService.getAllPatients();

	        ModelAndView mav = new ModelAndView();
	        mav.addObject("patient", patient);
	
	        mav.setViewName("patient.html");  
	        
	        return mav;
	  }

	   
	
	
	
}
