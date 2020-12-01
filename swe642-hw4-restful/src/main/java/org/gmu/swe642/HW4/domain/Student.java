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
    private String stdId; // student ID

    @Column (name = "USERNAME")
    private String username;

    @Column (name = "STREET")
    private String street;

    @Column (name = "CITY")
    private String city;

    @Column (name = "STATE")
    private String state;

    @Column (name = "ZIP")
    private String zip;

    @Column (name = "TELEPHONE")
    private String telephone;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "URL")
    private String url;

    @Column (name = "sdate")
    private Date sdate;

    @Column (name = "LIKEDABTCAMPUS")
    private String likedabtcampus;  	//Liked About Campus - Checkboxes
    //There may be multiple options - need to split that.

    @Column (name = "INTINUNI")
    private String intinuni; 			//Interested Options - Radio Buttons

    @Column (name = "HIGHSCHLGRADMONTH")
    private String highschlgradmonth;

    @Column (name = "HIGHSCHLGRADYEAR")
    private String highschlgradyear;

    @Column (name = "RECOS")
    private String recos; 				//Recommend this school to other students

    @Column (name = "COMMENTS")
    private String additionalcomments; 			//Student comments

    @Column (name = "DATA")
    private String data; 				//List of integers

    //Empty constructor
    public Student() {
        super();
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
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

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getAdditionalcomments() {
        return additionalcomments;
    }

    public void setAdditionalcomments(String additionalcomments) {
        this.additionalcomments = additionalcomments;
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



    public String getLikedabtcampus() {
        return likedabtcampus;
    }

    public void setLikedabtcampus(String likedabtcampus) {
        this.likedabtcampus = likedabtcampus;
    }

    public String getIntinuni() {
        return intinuni;
    }

    public void setIntinuni(String intinuni) {
        this.intinuni = intinuni;
    }

    public String getHighschlgradmonth() {
        return highschlgradmonth;
    }

    public void setHighschlgradmonth(String highschlgradmonth) {
        this.highschlgradmonth = highschlgradmonth;
    }

    public String getHighschlgradyear() {
        return highschlgradyear;
    }

    public void setHighschlgradyear(String highschlgradyear) {
        this.highschlgradyear = highschlgradyear;
    }

    public String getRecos() {
        return recos;
    }

    public void setRecos(String recos) {
        this.recos = recos;
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
                "stdId='" + stdId + '\'' +
                ", username='" + username + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", sdate=" + sdate +
                ", likedabtcampus='" + likedabtcampus + '\'' +
                ", intinuni='" + intinuni + '\'' +
                ", highschlgradmonth='" + highschlgradmonth + '\'' +
                ", highschlgradyear='" + highschlgradyear + '\'' +
                ", recos='" + recos + '\'' +
                ", additionalcomments='" + additionalcomments + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
