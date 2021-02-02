import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserLoginService {

  constructor(private http : HttpClient) { }

  public dologin(user){
    return this.http.post("http://localhost:7070/login/save-user",user, {responseType : "text" as "json"});
  }


}
