import { Component, OnInit } from '@angular/core';
import { UserService } from '../UserService';

@Component({
  selector: 'app-check-loan-status',
  templateUrl: './check-loan-status.component.html',
  styleUrls: ['./check-loan-status.component.css']
})
export class CheckLoanStatusComponent implements OnInit {

  public user_id: string;
  public application_status:string;
  public Application = [];

  constructor(private service:UserService) { }

  ngOnInit(): void {
    this.user_id = localStorage.getItem("user_id");
    // this.application_status = "applied";
    this.service.viewloanstatus(this.user_id).subscribe(
      data => {
        this.Application = data
      }
    );
  }

}
