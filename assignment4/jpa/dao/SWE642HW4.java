package dao;

import java.util.List;

public class SWE642HW4 {
	
	public static void main(String[] args) {
		String stdID, username, street, city, state, zipCode, telephone, email, url, surveyDate, 
		likedAbtCampus, intinUni, highSchlGradMonth, highSchlGradYear, recos, comments, data;
		
		ApplicationDAO application = new ApplicationDAO(); 
		
		stdID = "G00942911"; 
		username = "Jane Doe"; 
		street = "19420 Anywhere Avenue";
		city = "Fairfax"; 
		state = "Virginia"; 
		zipCode = "22030"; 
		telephone = "7031234910"; 
		email = "test@gmail.com"; 
		url = "http://www.google.com"; 
		surveyDate = "2020-10-01"; 
		likedAbtCampus = "test"; //This would need to get an array string of options
		intinUni = "Friends"; 
		highSchlGradMonth = "June"; 
		highSchlGradYear = "2019"; 
		recos = "Likely"; 
		comments = "Testing additional comments";
		data = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
		
		//Test adding information to database 
		application.setData(stdID, username, street, city, state, zipCode, telephone, email, url, 
				surveyDate, likedAbtCampus, intinUni, highSchlGradMonth, highSchlGradYear, 
				recos, comments, data);
		
		//Get data based on student ID
		Student studentTest = application.retrieveDataById("G00942911");
		System.out.println(studentTest); 
		
		//Get student ID list
		List<Student> studentIDList = application.listStudentIDs(); 
		for (Student studentItem : studentIDList) {
			System.out.println(studentItem); 
		}
		
	}

}
