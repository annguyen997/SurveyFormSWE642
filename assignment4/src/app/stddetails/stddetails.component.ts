/* AUTHOR: Nupur Shah
    Student details components
*/
import { Component, OnInit } from '@angular/core';
import { StudentServiceService, Student } from '../student-service.service';
import { StudentComponent } from '../student/student.component';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-stddetails',
  templateUrl: './stddetails.component.html',
  styleUrls: ['./stddetails.component.css']
})
export class StddetailsComponent implements OnInit {

  stdDet:Student;
  stdid:string;
  studentDetails:string[];
  constructor(private myService:StudentServiceService,private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.stdid = this.route.snapshot.paramMap.get('id');
    console.log("id selected is "+this.stdid);
    this.myService.getStdDetail(this.stdid).subscribe(
      response=>{
        return this.handleSuccessfulResponse(response);
      }, 
    );
    console.log(this.stdDet);
  }

  handleSuccessfulResponse(response : any)
  {
      this.studentDetails=response;
      console.log("student details from database using id retrieving is "+this.studentDetails);
  }

}
