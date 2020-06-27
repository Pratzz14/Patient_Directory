package com.patient.patient;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
	List<Patient> patient = Arrays.asList(
			
			new Patient("Pratik",19,"26 June 2020",123,"Fever"),
			new Patient("Medha",19,"26 June 2020",123,"Fever"),
			new Patient("Janice",19,"26 June 2020",123,"Fever"),
			new Patient("Pratik",19,"26 June 2020",123,"Fever"),
			new Patient("Medha",19,"26 June 2020",123,"Fever"),
			new Patient("Janice",19,"26 June 2020",123,"Feverrrr")
			
			);
	
	public List<Patient> getAllPatients(){
		return patient;
	}
	
	public Patient getPatient(String name) {
		return patient.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
}
