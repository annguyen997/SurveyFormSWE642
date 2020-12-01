package org.gmu.swe642.HW4.domain;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "STDID")
    private String stdid; // student ID

    @Column (name = "USERNAME")
    private String username;

    @Column (name = "STREET")
    private String street;

    @Column (name = "CITY")
    private String city;

    @Column (name = "STATE")
    private String state;

    @Column (name = "ZIP")
    private String zipCode;

    @Column (name = "TELEPHONE")
    private String telephone;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "URL")
    private String url;

    @Column (name = "sdate")
    private Date surveyDate;

    @Column (name = "LIKEDABTCAMPUS")
    private String likedAbtCampus;  	//Liked About Campus - Checkboxes
    //There may be multiple options - need to split that.

    @Column (name = "INTINUNI")
    private String intinUni; 			//Interested Options - Radio Buttons

    @Column (name = "HIGHSCHLGRADMONTH")
    private String highSchlGradMonth;

    @Column (name = "HIGHSCHLGRADYEAR")
    private String highSchlGradYear;

    @Column (name = "RECOS")
    private String recos; 				//Recommend this school to other students

    @Column (name = "COMMENTS")
    private String comments; 			//Student comments

    @Column (name = "DATA")
    private String data; 				//List of integers

    //Empty constructor
    public Student() {
        super();
    }

    public String getStdId() {
        return stdid;
    }

    public void setStdId(String stdid) {
        this.stdid = stdid;
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

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
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
        return "Student{" +
                "stdid='" + stdid + '\'' +
                ", username='" + username + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", surveyDate='" + surveyDate + '\'' +
                ", likedAbtCampus='" + likedAbtCampus + '\'' +
                ", intinUni='" + intinUni + '\'' +
                ", highSchlGradMonth='" + highSchlGradMonth + '\'' +
                ", highSchlGradYear='" + highSchlGradYear + '\'' +
                ", recos='" + recos + '\'' +
                ", comments='" + comments + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

}
