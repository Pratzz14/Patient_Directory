package com.patient.patient;

public class Patient {

	  private String name;
	  private int age;
	  private String date;
	  private int temp;
	  private String symptoms;
	  

	public Patient() {

	}  

	public Patient(String name, int age, String date, int temp, String symptoms) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
		this.temp = temp;
		this.symptoms = symptoms;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	  
	  
}
