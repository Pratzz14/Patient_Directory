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
	
	//To get data of all the patients in JSON format
	@RequestMapping("/Patients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	//To get data of a certain patient
	@RequestMapping("/Patients/{name}")
	public Patient getPatient(@PathVariable String name) {
		return patientService.getPatient(name);
	}
	
	//To add a data of a certain person
	@RequestMapping(method=RequestMethod.POST,value="/Patients")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	//To update data of a certain patient
	@RequestMapping(method=RequestMethod.PUT,value="/Patients/{name}")
	public void updatePatient(@RequestBody Patient patient,@PathVariable String name) {
		patientService.updatePatient(name,patient);
	}
	
	//To delete a data of a patient
	@RequestMapping(method=RequestMethod.DELETE,value="/Patients/{name}")
	public void deletePatient(@PathVariable String name) {
		patientService.deletePatient(name);
	}	
	
	
	// Using to display JSON data in html web page.
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
