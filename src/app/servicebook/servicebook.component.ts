import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../user-register.service';

@Component({
  selector: 'app-servicebook',
  templateUrl: './servicebook.component.html',
  styleUrls: ['./servicebook.component.css']
})
export class servicebookComponent implements OnInit {


  user : any;

  constructor(private service : UserRegisterService) { }

  ngOnInit() {
  }



}
