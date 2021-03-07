import { Component, OnInit } from '@angular/core';
import { Router} from "@angular/router";

@Component({
  selector: 'app-adminlogicsuccess',
  templateUrl: './adminlogicsuccess.component.html',
  styleUrls: ['./adminlogicsuccess.component.css']
})
export class AdminlogicsuccessComponent implements OnInit {

  constructor(private router:Router) { }

  redirect()
  {
    localStorage.setItem("role","");
    localStorage.setItem("user_id","");
    this.router.navigate(['/login']);
  }

  ngOnInit(): void {
  }
}
