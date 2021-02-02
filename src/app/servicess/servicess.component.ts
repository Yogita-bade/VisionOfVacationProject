import { Component, OnInit } from '@angular/core';
import { Service } from '../service';
import {BookingService} from '../service.service'
import { User } from '../user';

@Component({
  selector: 'app-servicess',
  templateUrl: './servicess.component.html',
  styleUrls: ['./servicess.component.css']
})
export class ServiceComponent implements OnInit {

  user : Service  = new Service("","","","","","","",0,0);
  message : any;

  constructor(private service : BookingService) { }

  ngOnInit() {
  }

  public bookNow(){
    let reponse = this.service.doBooking(this.user);
    reponse.subscribe(data => {
      this.message = data;
    });
  }

}
