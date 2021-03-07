import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientJsonpModule, HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import {ConfigService} from './config/config.service';
import { ConfigComponent } from './config/config.component';
import { Ng5SliderModule } from 'ng5-slider';

import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { CheckeligiblitytrialComponent } from './checkeligiblitytrial/checkeligiblitytrial.component';

import { AdminlogicsuccessComponent } from './adminlogicsuccess/adminlogicsuccess.component';
import { ViewAllUsersComponent } from './view-all-users/view-all-users.component';
import { ViewClientsComponent } from './view-clients/view-clients.component';
import { ViewApplicationComponent } from './view-application/view-application.component';
import { ViewRejectedComponent } from './view-rejected/view-rejected.component';

import { LogicsuccessComponent} from "./logicsuccess/logicsuccess.component";
import { DashboardComponent} from "./dashboard/dashboard.component";
import { CheckeligiblityComponent } from './checkeligiblity/checkeligiblity.component';
import { ApplyLoanComponent } from './apply-loan/apply-loan.component';
import { CheckLoanStatusComponent } from './check-loan-status/check-loan-status.component';
import { NotAdminComponent } from './not-admin/not-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ConfigComponent,
    EmiCalculatorComponent,
    CheckeligiblityComponent,
    ApplyLoanComponent,
    AdminlogicsuccessComponent,
    ViewAllUsersComponent,
    ViewClientsComponent,
    ViewApplicationComponent,
    ViewRejectedComponent,
    HomeComponent,
    LogicsuccessComponent,
    NotAdminComponent,
    DashboardComponent,
    CheckeligiblitytrialComponent,
    CheckLoanStatusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    HttpClientJsonpModule,
    Ng5SliderModule,
    ReactiveFormsModule,
    CommonModule
  ],
  providers: [ConfigService],
  bootstrap: [AppComponent]
})
export class AppModule { }
