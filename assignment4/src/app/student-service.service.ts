import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Student{
  constructor(
    public stdid:string,
    public stdname:string,
    public stdadd:string,
    public stdcity:string,
    public stdstate:string,
    public stdzip:string,
    public stddate:string,
    public stdtel:string,
    public stdemail:string,
    public stdurl:string,
    public stdmonth:string,
    public stdyear:string,
    public stdradio:string,
    public stdlike:string,
    public stddata:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {
  //private usersUrl: string;
  private studentList:Array<String>=[];
  private std:Array<Student>=[];
  //private stdDetail:Student;

  constructor(private http:HttpClient) { }

  /* getStdDetail(stdid: string){
    return this.http.get<Student>('http://localhost:8080/students'+'/'+stdid)
  } */
 
  getStudents()
  {
    return this.http.get<Student[]>('http://localhost:8080/students');
  }

  /* setStudent(student: any){
     return this.http.post('http://localhost:8080/students', student);
  } */
}
