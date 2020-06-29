package com.patient.patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//The array consisting of a initial patients
@Service
public class PatientService {
	private List<Patient> patient = new ArrayList<>( Arrays.asList(
			
			new Patient("Pratik",19,"20 June 2020",99,"Fever"),
			new Patient("Medha",18,"23 June 2020",102,"Cough"),
			new Patient("Janice",19,"24 June 2020",100,"Headache"),
			new Patient("Priya",18,"26 June 2020",101,"Vomit"),
			new Patient("Amit",20,"26 June 2020",103,"Fever"),
			new Patient("Prem",22,"29 June 2020",97,"Stomach Ache")
			
			));
	//This returns data of all the patients
	public List<Patient> getAllPatients(){
		return patient;
	}
	//This returns the data of a certain patient given by the user 
	public Patient getPatient(String name) {
		return patient.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	
	//This adds the data of a patient
	public void addPatient(Patient Patient) {
		patient.add(Patient);
		
	}
	
	//This updates the data of a certain patient
	public void updatePatient(String name, Patient Patient) {
		for (int i=0; i<patient.size();i++) {
			Patient t = patient.get(i);
			if (t.getName().equals(name)) {
				patient.set(i, Patient);
				return;
			}
		}
	
	}
	
	//This deletes data of the patient 
	public void deletePatient(String name) {
		patient.removeIf(t -> t.getName().equals(name));
	}
	
	
}
