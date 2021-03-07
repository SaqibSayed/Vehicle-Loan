import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { User } from "./user";
import { Observable } from 'rxjs';
import { Loan } from "./Loan";
import { UserList } from './UserList';
import { RejectedUserList } from './RejectedUserList';
import { ApprovedUserList } from './ApprovedUserList';
import { PendingUserList } from './PendingUserList';
import { AppliedLoanList } from './AppliedLoanList';
import {AppSettings} from "./AppSettings";

@Injectable({
  providedIn: 'root'
})

export class UserService {
  constructor(private http: HttpClient) {  }

    viewAll():Observable<UserList[]>{
        return this.http.get<UserList[]>(AppSettings.API_ENDPOINT+"user/getallusers")
    }

    viewRejected():Observable<RejectedUserList[]>{
        return this.http.get<RejectedUserList[]>(AppSettings.API_ENDPOINT+"admin/getallloans/rejected")
    }

    viewPending():Observable<PendingUserList[]>{
        return this.http.get<PendingUserList[]>(AppSettings.API_ENDPOINT+"admin/getallloans/applied")
    }

    viewApproved():Observable<ApprovedUserList[]>{
        return this.http.get<ApprovedUserList[]>(AppSettings.API_ENDPOINT+"admin/getallloans/approved")
    }

    approveLoan(loanId: Loan):Observable<any>{
        return this.http.get(AppSettings.API_ENDPOINT+"admin/set-loan-status/"+loanId+"/approved");
    }

    rejectLoan(loanId: Loan):Observable<any>{
      return this.http.get(AppSettings.API_ENDPOINT+"admin/set-loan-status/"+loanId+"/rejected");
    }

    // USER DASHBOARD

    viewloanstatus(user_id: string):Observable<AppliedLoanList[]>{
        return this.http.get<AppliedLoanList[]>('http://localhost:8080/spring_mvc_demo1/user/getallloans/'+user_id+'')
    }

    register(user:User):Observable<any>{
        return this.http.post("http://localhost:8080/user/save", user)
    }

    registerloan(loan:Loan):Observable<any>{
        return this.http.post("http://localhost:8080/user/apply-loan",loan)
    }

  }
