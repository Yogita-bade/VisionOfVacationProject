import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { UserLoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user : Login  = new Login("","");
  message : any;

  constructor(private service : UserLoginService) { }

  ngOnInit() {
  }

  public loginNow(){
    let reponse = this.service.dologin(this.user);
    reponse.subscribe(data => {
      this.message = data;
    });
  }
}
