import { Component, OnInit } from '@angular/core';
import { StudentDataService } from '../services/student-data.service';
import { CoursDataService } from '../services/cours-data.service';
import { TeacherDataService } from '../services/teacher-data.service';

@Component({
  selector: 'app-cours',
  templateUrl: './cours.component.html',
  styleUrls: ['./cours.component.css']
})
export class CoursComponent implements OnInit {

  students: any;
  courses:any;
  teachers:any;


  constructor(private studentService: StudentDataService,private coursDataService :CoursDataService,private teacherDataService: TeacherDataService  ) { }


  ngOnInit(): void {
    this.fetchCourses();
  }

  fetchCourses() {
    this.coursDataService.getData().subscribe((res) => {
      this.courses = res;
    });
  }
}
