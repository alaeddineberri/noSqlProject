
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentDataService {

  constructor(private http: HttpClient) { }

  getData(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/noSqlProject/students');
  }
  addStudent(studentData: any): Observable<any> {
    return this.http.post<any>('http://localhost:8080/noSqlProject/students', studentData);
  }
}
