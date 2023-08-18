package com.demo.collectioninjection;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Emp {
	
	 String name;
	 List<String> phones;
	 Set<String> addresses;
	 Map<String,String> courses;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + "]";
	}
	
	
	
	

}
