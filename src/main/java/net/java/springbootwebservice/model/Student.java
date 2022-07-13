package net.java.springbootwebservice.model;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//converting a POJO class into JPA entity
@Entity
@Table(name = "Student")
public class Student{
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String first_name;
	private String last_name;
	private String street_address;
	private String city;
	private String state;
	private String zip;
	private String telephone_number;
	private String email;
	private Date date;
	
	//students, location, campus, atmosphere, dorm
	//rooms, and sports
	private ArrayList<String> like_most;
	
	//friends, television, Internet, and other
	private String interest;
	
	//Very Likely, Likely, Unlikely
	private String rating;
	
	//constructor
	public Student() {
		
	}
	
	//parametrized constructor
	public Student(String first_name, String last_name, String street_address, String city, String state, String zip,
			String telephone_number, String email, Date date, ArrayList<String> like_most, String interest,
			String rating) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.street_address = street_address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.telephone_number = telephone_number;
		this.email = email;
		this.date = date;
		this.like_most = like_most;
		this.interest = interest;
		this.rating = rating;
	}
	
	//getter and setter methods
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<String> getLike_most() {
		return like_most;
	}

	public void setLike_most(ArrayList<String> like_most) {
		this.like_most = like_most;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
