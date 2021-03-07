import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-checkeligiblitytrial',
  templateUrl: './checkeligiblitytrial.component.html',
  styleUrls: ['./checkeligiblitytrial.component.css']
})
export class CheckeligiblitytrialComponent{
  elig: boolean=false;
  stat:string;
  onroadprice:number;
  monthlysavings:number;
  existingemi:number;
  loantenure:number;
  newemi:number = this.onroadprice/this.loantenure;

  checkeligiblitytrial(){
    if (((this.onroadprice/this.loantenure)+this.existingemi)<=this.monthlysavings)
    {
      if(this.elig==false)
      {
        this.stat="USER IS ELIGIBLE!";
        alert(this.stat);
      }
    }
    else
    {
      this.stat="SORRY, YOU AREN'T ELIGIBLE!";
      alert(this.stat);
    }
  }
}
