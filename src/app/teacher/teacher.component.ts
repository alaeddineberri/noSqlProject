import { Component, OnInit } from '@angular/core';
import { StudentDataService } from '../services/student-data.service';
import { CoursDataService } from '../services/cours-data.service';
import { TeacherDataService } from '../services/teacher-data.service';

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.css']
})
export class TeacherComponent implements OnInit {

  students: any;
  courses:any;
  teachers:any;


  constructor(private studentService: StudentDataService,private coursDataService :CoursDataService,private teacherDataService: TeacherDataService  ) { }

  ngOnInit(): void {
    this.fetchTeachers();
  }

  fetchTeachers() {
    this.teacherDataService.getData().subscribe((res) => {
      this.teachers = res;
    });
  }

}
