import { Component, OnInit } from '@angular/core';
import { Router} from "@angular/router";

@Component({
  selector: 'app-logicsuccess',
  templateUrl: './logicsuccess.component.html',
  styleUrls: ['./logicsuccess.component.css']
})
export class LogicsuccessComponent implements OnInit {
  constructor(private router:Router) { }

  userName:string;
  userId:string;

  public AppliedLoanList = [];

  ngOnInit(): void {}

  redirect(){
    localStorage.setItem("role","");
    localStorage.setItem("user_id","");
    this.router.navigate(['login']);
  }

  // viewLoanStatus(){
  //   this.router.navigate(['check-loan-status']);
  // }
}
