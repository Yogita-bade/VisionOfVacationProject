import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NewServiceRegister {

  constructor(private http : HttpClient) { }

  public doBooking(user){
    return this.http.post("http://localhost:7070/serviceprovider/save",user, {responseType : "text" as "json"});
  }

  public getUsers(){
    return this.http.get("http://localhost:7070/servicesenrolled/all-users");
  }

  public getUserByUsername(username){
    return this.http.get("http://localhost:7070/servicesenrolled/search/"+username);
  }

  public updateuser(username){
    return this.http.get("http://localhost:7070/servicesenrolled/update/"+username);
  }

  public deleteUser(username){
    return this.http.get("http://localhost:7070/delete/"+username);
  }
}
