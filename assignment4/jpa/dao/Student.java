package dao;

import javax.persistence.Entity;
import javax.persistence.Column; 
import javax.persistence.Id;
import javax.persistence.Table; 
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

//import java.sql.PreparedStatement;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@Column(name = "stdid")
	private String stdID;
	
	private String username; 
	private String street; 
	private String city; 
	private String state; 
	
	@Column (name = "zip")
	private String zipCode; 
	private String telephone; 
	private String email; 
	private String url; 
	
	@Column (name = "sdate")
	private String surveyDate; 
	private String likedAbtCampus;  	//Liked About Campus - Checkboxes 
	//There may be multiple options - need to split that. 

	@Column (name = "intinuni")
	private String intinUni; 			//Interested Options - Radio Buttons
	private String highSchlGradMonth; 
	private String highSchlGradYear; 
	private String recos; 				//Recommend this school to other students
	private String comments; 			//Student comments
	private String data; 				//List of integers 
	
	//Empty constructor
	public Student() {
		super();
	}
	
	public String getStdId() {
		return stdID;
	}
	
	public void setStdId(String stdID) {
		this.stdID = stdID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getSurveyDate() {
		return surveyDate; 
	}
	
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate; 
	}
	
	public String getLikedAbtCampus() {
		return likedAbtCampus;
	}

	public void setLikedAbtCampus(String likedAbtCampus) {
		this.likedAbtCampus = likedAbtCampus;
	}

	public String getIntinUni() {
		return intinUni;
	}
	
	public void setIntinUni(String intinUni) {
		this.intinUni = intinUni;
	}

	public String getHighSchlGradMonth() {
		return highSchlGradMonth;
	}

	public void setHighSchlGradMonth(String highSchlGradMonth) {
		this.highSchlGradMonth = highSchlGradMonth;
	}

	public String getHighSchlGradYear() {
		return highSchlGradYear;
	}

	public void setHighSchlGradYear(String highSchlGradYear) {
		this.highSchlGradYear = highSchlGradYear;
	}

	public String getRecos() {
		return recos;
	}

	public void setRecos(String recos) {
		this.recos = recos;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Student Information: "
				+ "Survey Date: " + surveyDate
				+ "\nStudent ID: " + stdID 
				+ "\\nnUsername: " + username 
				+ "\nStreet: " + street
				+ "\nCity: " + city
				+ "\nState: " + state
				+ "\nZip Code: " + zipCode
				+ "\nTelephone: " + telephone
				+ "\nEmail Address: " + email 
				+ "\nURL: " + url 
				+ "\nLiked About Campus: " + likedAbtCampus
				+ "\nInterested in University: " + intinUni 
				+ "\nHigh School Grad Month: " + highSchlGradMonth
				+ "\nHigh School Grad Year: " + highSchlGradYear
				+ "\nRecommend Mason: " + recos
				+ "\nComments: " + comments
				+ "\nData Input: " + data; 
	
	}
}
