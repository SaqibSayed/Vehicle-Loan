import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminlogicsuccessComponent } from './adminlogicsuccess/adminlogicsuccess.component';
import { ApplyLoanComponent } from './apply-loan/apply-loan.component';
import { CheckeligiblityComponent } from './checkeligiblity/checkeligiblity.component';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ViewAllUsersComponent } from './view-all-users/view-all-users.component';
import { ViewApplicationComponent } from './view-application/view-application.component';
import { ViewClientsComponent } from './view-clients/view-clients.component';
import { ViewRejectedComponent } from './view-rejected/view-rejected.component';
import { LogicsuccessComponent } from './logicsuccess/logicsuccess.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminGaurdGuard } from "./admin-gaurd.guard";
import { CheckeligiblitytrialComponent } from './checkeligiblitytrial/checkeligiblitytrial.component';
import { CheckLoanStatusComponent } from './check-loan-status/check-loan-status.component';
import { LoanappsuccessComponent } from './loanappsuccess/loanappsuccess.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'login', component: LoginComponent, pathMatch: 'full' },
  { path: 'register', component: RegisterComponent },
  { path: 'home', component: HomeComponent },
  { path: 'checkeligiblitytrial', component: CheckeligiblitytrialComponent },
  { path: 'calculateEMI', component: EmiCalculatorComponent },
  
  { path: 'loginsuccess',  component: LogicsuccessComponent,canActivate: [AdminGaurdGuard] },
  { path: 'loginAdminSuccess', component: AdminlogicsuccessComponent ,canActivate: [AdminGaurdGuard]},

  { path: 'dashboard', component:DashboardComponent, canActivate: [AdminGaurdGuard] },
  { path: 'checkEligibility', component: CheckeligiblityComponent },
  { path: 'applyLoan', component: ApplyLoanComponent, canActivate: [AdminGaurdGuard] },
  { path: 'check-loan-status', component: CheckLoanStatusComponent, canActivate: [AdminGaurdGuard] },
  { path: 'loanappsuccess', component: LoanappsuccessComponent, canActivate: [AdminGaurdGuard] },
  
  { path: 'view-all-user', component: ViewAllUsersComponent, canActivate: [AdminGaurdGuard]},
  { path: 'view-application', component: ViewApplicationComponent, canActivate: [AdminGaurdGuard]},
  { path: 'view-clients', component: ViewClientsComponent, canActivate: [AdminGaurdGuard]},
  { path: 'view-rejected', component: ViewRejectedComponent, canActivate: [AdminGaurdGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }