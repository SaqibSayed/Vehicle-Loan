import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ApplyLoanModel } from './applyloan-model';
import {AppSettings} from "../AppSettings";
import {Router} from "@angular/router";

@Component({
  selector: 'app-apply-loan',
  templateUrl: './apply-loan.component.html',
  styleUrls: ['./apply-loan.component.css']
})

export class ApplyLoanComponent implements OnInit {

  applyLoanM = new ApplyLoanModel();

  constructor( private http: HttpClient ,private router: Router) {}

  ngOnInit(): void {
    this.applyLoanM.user_id = localStorage.getItem("user_id");
  }

  personal_details:boolean=false;
  employment_details:boolean=true;
  vehicle_details:boolean=false;
  loan_details:boolean=false;
  identity_details:boolean=false;
  myDefaultValue: number = 1;

  saveEmploymentDetails(){
    this.personal_details=false;
    this.employment_details=false;
    this.vehicle_details=true;
    this.loan_details=false;
    this.identity_details=false;
  }

  saveVehicleDetails(){
    this.personal_details=false;
    this.employment_details=false;
    this.vehicle_details=false;
    this.loan_details=true;
    this.identity_details=false;
  }

  saveLoanDetails(){
    this.personal_details=false;
    this.employment_details=false;
    this.vehicle_details=false;
    this.loan_details=true;
    this.applyLoan()
  }

  applyLoan(){
    console.log(this.applyLoanM);
    this.http.post<any>(AppSettings.API_ENDPOINT+"user/apply-loan", this.applyLoanM).subscribe(data => {
      console.log(JSON.stringify(data));
      window.alert("sucess");
      this.router.navigate(['loanappsuccess']);
    })
  }
}
