import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {RegisterModel} from './register-model';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  register = new RegisterModel();

  constructor( private http: HttpClient,private router: Router ) {}
  ngOnInit(): void {}

  saveuser(): void {
    this.http.post<RegisterModel>('http://localhost:8080/spring_mvc_demo1/user/save', this.register,  httpOptions)
      .subscribe(
        ( data: RegisterModel ) =>{},);
      this.router.navigate(['/login']);
  }

  // register = new RegisterModel();
  // registerForm: FormGroup;
  // submitted = false;
  // data: any;
  
  // constructor( private http: HttpClient, private formBuilder: FormBuilder ) {}

  // ngOnInit(): void {
  //   this.registerForm = this.formBuilder.group({
  //     f_name: ['', Validators.required],
  //     m_name: ['', Validators.required],
  //     l_name: ['', Validators.required],
  //     email_id: ['', [Validators.required,Validators.email]],
  //     password: ['', [Validators.required,Validators.minLength(6)]],
  //     age: ['', Validators.required],
  //     mobile_no: ['', Validators.required],
      
  //    });
  // }

  // get fval() {
  //   return this.registerForm.controls;
  // }
  
  // saveuser() {

  //   this.http.post('http://localhost:8080/spring_mvc_demo1/user/save', this.fval,  httpOptions)
  //     .subscribe(
  //       ( data: any ) =>{}); 
  // } 
}