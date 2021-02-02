import { Component, OnInit } from '@angular/core';
import { BookingService } from 'src/app/booking-service.service';
import { NewService } from '../../newservice';
import {NewServiceRegister} from '../../newservice.service'


@Component({
  selector: 'app-newservice',
  templateUrl: './newservice.component.html',
  styleUrls: ['./newservice.component.css']
})
export class NewServiceComponent implements OnInit {

  user : NewService  = new NewService("","","","","","","",0,0,0,0);
  message : any;

  constructor(private service : NewServiceRegister) { }

  ngOnInit() {
  }

  public bookNow(){
    let reponse = this.service.doBooking(this.user);
    reponse.subscribe(data => {
      this.message = data;
    });
  }

}
