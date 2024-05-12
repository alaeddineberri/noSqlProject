import { Component, OnInit } from '@angular/core';
import { StudentDataService } from '../services/student-data.service';
import { CoursDataService } from '../services/cours-data.service';
import { TeacherDataService } from '../services/teacher-data.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: any;
  courses:any;
  teachers:any;


  constructor(private studentService: StudentDataService,private coursDataService :CoursDataService,private teacherDataService: TeacherDataService  ) { }

  ngOnInit(): void {
   this.fetchStudent()

  }
  fetchStudent(){
    this.studentService.getData().subscribe((res) => {
      this.students = res;
    });
  }

}
