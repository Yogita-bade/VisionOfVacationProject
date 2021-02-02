import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../../user-register.service';

@Component({
  selector: 'app-search1',
  templateUrl: './search1.component.html',
  styleUrls: ['./search1.component.css']
})
export class Search1Component implements OnInit {

  
  user : any;

  constructor(private service : UserRegisterService) { }

  ngOnInit() {
  }



}
