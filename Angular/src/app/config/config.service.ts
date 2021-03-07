import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable, ObservableInput} from 'rxjs';
import {catchError } from 'rxjs/operators';
import { HttpHeaders } from '@angular/common/http';
import {RegisterModel} from '../register/register-model';

@Injectable({
  providedIn: 'root'
})

export class ConfigService {
  static handleError: (err: any, caught: Observable<unknown>) => ObservableInput<any>;
  constructor(private http: HttpClient) { }
  
}
