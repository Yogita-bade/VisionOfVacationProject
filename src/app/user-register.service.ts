import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  constructor(private http : HttpClient) { }

  public doRegistration(user){
    return this.http.post("http://localhost:7070/save-user",user, {responseType : "text" as "json"});
  }

  public getUsers(){
    return this.http.get("http://localhost:7070/all-users");
  }

  public getUserByUsername(username){
    return this.http.get("http://localhost:7070/search/"+username);
  }

  public updateuser(username){
    return this.http.get("http://localhost:7070/update/"+username);
  }

  public deleteUser(username){
    return this.http.get("http://localhost:7070/delete/"+username);
  }
}
