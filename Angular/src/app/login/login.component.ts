import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { LoginModel } from './login-model';
import { Router } from '@angular/router';
import {AppSettings} from "../AppSettings";

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

class LoginResponse {
  public status   : string;
  public role: string;
  public user_id: string;
  public name: string;
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  login = new LoginModel();

  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit(): void {}
  count: any;

  verifyUser(emailId, pass): any{
    this.http.get<LoginResponse>(AppSettings.API_ENDPOINT+"user/verifyuser/"+emailId+"/"+pass).subscribe(
      response => {
        if(response.status == "1"){
          console.log("Success");

          if (response.role == "Admin")
            this.router.navigate(['/loginAdminSuccess']);
          else
            this.router.navigate(['/loginsuccess']);

          localStorage.setItem("role", response.role);
          localStorage.setItem("user_id" , response.user_id);
          localStorage.setItem("email", emailId);
          localStorage.setItem("name", response.name);

        }else {
          console.log("Not Validated")
          alert("User Name or Password Not Valid")
        }
      }
    );
  }
}
