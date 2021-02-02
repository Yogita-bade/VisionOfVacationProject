import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private http : HttpClient) { }

  public dobook(user){
    return this.http.post("http://localhost:7070/serviceprovider/save",user, {responseType : "text" as "json"});
  }

  public getUsers(){
    return this.http.get("http://localhost:7070/all-users");
  }

  public getUserByUsername(username){
    return this.http.get("http://localhost:7070/search/"+username);
  }

  public deleteUser(username){
    return this.http.get("http://localhost:7070/delete/"+username);
  }
}
