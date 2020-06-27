package com.patient.patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
	private List<Patient> patient = new ArrayList<>( Arrays.asList(
			
			new Patient("Pratik",19,"26 June 2020",123,"Fever"),
			new Patient("Medha",19,"26 June 2020",123,"Fever"),
			new Patient("Janice",19,"26 June 2020",123,"Fever"),
			new Patient("Pratik",19,"26 June 2020",123,"Fever"),
			new Patient("Medha",19,"26 June 2020",123,"Fever"),
			new Patient("Janice",19,"26 June 2020",123,"Feverrrr")
			
			));
	
	public List<Patient> getAllPatients(){
		return patient;
	}
	
	public Patient getPatient(String name) {
		return patient.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void addPatient(Patient Patient) {
		patient.add(Patient);
		
	}

	public void updatePatient(String name, Patient Patient) {
		for (int i=0; i<patient.size();i++) {
			Patient t = patient .get(i);
			if (t.getName().equals(name)) {
				patient.set(i, Patient);
				return;
			}
		}
		
	}

	public void deletePatient(String name) {
		patient.removeIf(t -> t.getName().equals(name));
	}
	
	
}
