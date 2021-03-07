import { Component, OnInit } from '@angular/core';
import { Router} from "@angular/router";
import {AppSettings} from "../AppSettings";
import {HttpClient} from "@angular/common/http";

class GetUserResponse {
  public f_name:string;
  public m_name:string;
  public l_name:string;
  public age:string;
  public email_id:string;
  public mobile_no:string;
}

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit {
  constructor(private router:Router,private http: HttpClient) { }

  public mydetails:GetUserResponse;

  ngOnInit(): void {
    this.http.get<GetUserResponse>(AppSettings.API_ENDPOINT + "user/get-details/" + localStorage.getItem("user_id")).subscribe(
      (response: GetUserResponse) => {
        this.mydetails = response
      });
  }

  update() {}
}
