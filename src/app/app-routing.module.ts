import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentComponent } from './student/student.component'; // Import your Student component
import { TeacherComponent } from './teacher/teacher.component'; // Import your Student component
import{CoursComponent} from './cours/cours.component'
const routes: Routes = [

  { path: 'student', component: StudentComponent }, // Define route for Student component
  { path: 'teacher', component:  TeacherComponent}, // Define route for Student component
  { path: 'course', component:  CoursComponent} // Define route for Student component

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
