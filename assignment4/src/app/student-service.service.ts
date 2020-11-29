import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Student{
  constructor(
    public stdid:string,
    public username:string,
    public street:string,
    public city:string,
    public state:string,
    public zip:string,
    public telephone:string,
    public email:string,
    public url:string,
    public intinuni:string,
    public likedabtcampus:string,
    public stddate:string,
    public highschlgradmonth:string,
    public highschlgradyear:string,
    public recos:string,
    public comments:string,
    public data:string
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {
  private usersUrl: string;
  private studentList:Array<String>=[];
  private std:Array<Student>=[];
  private stdDetail:Student;

  constructor(private http:HttpClient) { }

  getStdDetail(stdid: string){
    return this.http.get<Student>('http://localhost:8080/students'+'/'+stdid)
  }
 
  getStudents()
  {
    return this.http.get<Student[]>('http://localhost:8080/students');
  }

  setStudent(student: any){
     return this.http.post('http://localhost:8080/students', student);
  }
}
