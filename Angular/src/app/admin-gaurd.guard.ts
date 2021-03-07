import { Injectable } from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router} from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class AdminGaurdGuard implements CanActivate {
  constructor(private router: Router) {}

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

    if (localStorage.getItem("role") == "Admin"){
      console.log("I am admin");
      return true;
    }
    else if(localStorage.getItem("role") == "User"){
      console.log("I am User");
      return true;
    }
    else{
      console.log("I am Nothing");
      return false;
    }
  }

}
