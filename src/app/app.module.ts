import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { HttpClientModule } from '@angular/common/http';
import { CoursComponent } from './cours/cours.component';
import { TeacherComponent } from './teacher/teacher.component'; // Import HttpClientModule


@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    CoursComponent,
    TeacherComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule // Add HttpClientModule here

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
