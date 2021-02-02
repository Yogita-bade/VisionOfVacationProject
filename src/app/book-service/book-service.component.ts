import { Component, OnInit } from '@angular/core';
import { BookService } from '../book-service';
import { BookingService } from '../booking-service.service';

import { UserLoginService } from '../login.service';

@Component({
  selector: 'app-book-service',
  templateUrl: './book-service.component.html',
  styleUrls: ['./book-service.component.css']
})
export class BookComponent implements OnInit {

  user : BookService  = new BookService("","","");
  message : any;

  constructor(private service : BookingService) { }

  ngOnInit() {
  }

  public bookNow(){
    let reponse = this.service.dobook(this.user);
    reponse.subscribe(data => {
      this.message = data;
    });
  }
}
