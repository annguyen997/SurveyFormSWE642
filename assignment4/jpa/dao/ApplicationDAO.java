package dao;

import java.util.List;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence; 
import javax.persistence.Query;

public class ApplicationDAO {
	private static final String PERSISTENCE_UNIT_NAME = "javax.persistence-api-2.2.jar"; 
	private static EntityManagerFactory factory; 
	
	
	public Student retrieveDataById(String stdID){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME); 
		EntityManager SWE642HW4 = factory.createEntityManager(); 
		
		//Start transaction
		//em.getTransaction().begin(); 
		
		Student studentFound = SWE642HW4.find(Student.class, stdID); 
		SWE642HW4.close(); 
		
		return studentFound; 
	}
	
	public List<Student> listStudentIDs(){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME); 
		EntityManager SWE642HW4 = factory.createEntityManager(); 
		
		//Start transaction
		//em.getTransaction().begin(); 
		
		//Create query to get all student IDs in database 
		Query query = SWE642HW4.createQuery("SELECT s.stdid " + "FROM students s");
		
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) query.getResultList(); 
		
		SWE642HW4.close(); 
		
		return list; 
	}
	
	public void setData(String stdID, String username, String street, String city, 
							   String state, String zipCode, String telephone, String email,
							   String url, String surveyDate, String likedAbtCampus, String intinUni, 
							   String highSchlGradMonth, String highSchlGradYear, 
							   String recos, String comments, String data) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME); 
		EntityManager SWE642HW4 = factory.createEntityManager(); 
		
		//Create new Student
		SWE642HW4.getTransaction().begin(); 
		Student newStudent = new Student(); 
		
		//Set the data
		newStudent.setStdId(stdID);
		newStudent.setUsername(username); 
		newStudent.setStreet(street);
		newStudent.setCity(city);
		newStudent.setState(state);
		newStudent.setZipCode(zipCode);
		newStudent.setTelephone(telephone);
		newStudent.setEmail(email);
		newStudent.setUrl(url);
		newStudent.setSurveyDate(surveyDate);
		newStudent.setLikedAbtCampus(likedAbtCampus); //This would need to get an array string of options
		newStudent.setIntinUni(intinUni);
		newStudent.setHighSchlGradMonth(highSchlGradMonth);
		newStudent.setHighSchlGradYear(highSchlGradYear);
		newStudent.setRecos(recos);
		newStudent.setComments(comments);
		newStudent.setData(data);
		
		//Make changes, commit, and then close connection 
		SWE642HW4.persist(newStudent);
		SWE642HW4.getTransaction().commit();
		SWE642HW4.close(); 
		
	}

}
