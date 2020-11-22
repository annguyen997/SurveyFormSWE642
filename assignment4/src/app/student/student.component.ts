/* AUTHOR: Nupur Shah
    Student component */

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StudentServiceService, Student } from '../student-service.service';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: string[]=[];
  student = '';
  numeric: number=0;
  mean:number=0;
  sum : number=0;
  sd : number=0;
  value : string='';
  data : String[]=[];
  id : String = '';
  name : String ='';
  studentDetails:Student;
  scheduleForm: FormGroup;
  stdArray:Array<String>=[];
  showSimpleAcknowledgement:boolean = false;
  showWinnerAcknowledgement:boolean = false;
  showSuccess = true;

  constructor(private http:HttpClient,private myService:StudentServiceService, private fb: FormBuilder) { }

  ngOnInit(): void {
    this.scheduleForm = this.fb.group({
      username: ['', Validators.required],
      stdid: ['', Validators.required],
      street: ['', Validators.required],
      city: ['', Validators.required],
      state:  ['', Validators.required],
      zip: ['', Validators.required],
      telephone:  ['', Validators.required],
      mail:  ['', Validators.required],
      websiteaddress:  ['', Validators.required],
      sdate:['',Validators.required],
      highschlgradmonth:[],
      highschlgradyear:[],
      intrestinuni:[],
      additionalcomments: [],
      recos:[],
      data:[],

    });
    console.log("get students"+this.myService.getStudents());

    /*this.myService.getStudents().subscribe(
      response =>this.handleSuccessfulResponse(response),
     ); */
  }
  /* handleSuccessfulResponse(response)
  {
      this.students=response;
      console.log("student ids retrieving "+this.students);
  } */

  submit():void {
    this.showSuccess = false;
    this.value = this.scheduleForm.value.data;

    this.data = this.value.split(",")
    for(let i=0; i<this.data.length; i++){
      this.numeric= this.numeric + (+this.data[i]);      
    }

    this.mean = this.numeric/(this.data.length)
    console.log("mean is "+this.mean);

    for(let i=0;i<this.data.length;i++){
      this.numeric = +this.data[i] - this.mean;
      this.numeric = this.numeric * this.numeric;
      this.sum = this.sum + this.numeric;
    }
  
    this.sd = Math.sqrt(this.sum/(this.data.length))
    console.log("standard deviation "+this.sd);

    if(this.mean<90){
      this.showSuccess = false;
      this.showSimpleAcknowledgement = true;
    }
    else{
      this.showSuccess = false;
      this.showWinnerAcknowledgement = true;
    }

  console.log("radio"+this.scheduleForm.value.intrestinuni);
  console.log("likeliness"+this.scheduleForm.value.recos)

  /* this.studentDetails = {
    STDID : this.scheduleForm.value.stdid,
    USERNAME : this.scheduleForm.value.username,
    STREET : this.scheduleForm.value.street,
    CITY : this.scheduleForm.value.city,
    STATE : this.scheduleForm.value.state,
    ZIP : this.scheduleForm.value.zip,
    TELEPHONE : this.scheduleForm.value.telephone,
    EMAIL : this.scheduleForm.value.mail,
    URL : this.scheduleForm.value.websiteaddress,
    INTINUNI : this.scheduleForm.value.intrestinuni,
    stddate : this.scheduleForm.get("sdate").value,
    HIGHSCHLGRADMONTH : this.scheduleForm.value.highschlgradmonth,
    HIGHSCHLGRADYEAR : this.scheduleForm.value.highschlgradyear,
    RECOS : this.scheduleForm.value.recos,
    stddata : this.scheduleForm.get("raffle").value
  } 
  console.log(this.studentDetails);
  this.myService.setStudent(this.studentDetails);
  this.myService.setStudent(this.studentDetails).subscribe(
  response => alert("student added successfully")
  );
  */

  }
  onSubmit(): void {
  };

}
