package com.demo.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	int id;
	String name;
	List<Integer> mobileNumbers;
	Map<String, String> courses;
	Set<String> emailId;
	

	public Map<String, String> getCourses() {
		return courses;
	}
	
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Set<String> getEmailId() {
		return emailId;
	}

	public void setEmailId(Set<String> emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + ", courses=" + courses
				+ ", emailId=" + emailId + "]";
	}

	
	
	
	
	

}
