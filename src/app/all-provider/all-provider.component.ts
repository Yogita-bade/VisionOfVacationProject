import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../user-register.service';
import { TestObject } from 'protractor/built/driverProviders';

@Component({
  selector: 'app-all-provider',
  templateUrl: './all-provider.component.html',
  styleUrls: ['./all-provider.component.css']
})
export class AllProviderComponent implements OnInit {

  users : any;

  constructor(private service : UserRegisterService) { }

  ngOnInit() {
    let response = this.service.getUsers();
    response.subscribe(data => this.users = data);
  }

  public removeUser(username : string){
    let response = this.service.deleteUser(username);
    response.subscribe(data => this.users = data);
  }
  public updateUser(username : string){
    let response = this.service.updateuser(username);
    response.subscribe(data => this.users = data);
  }

}
