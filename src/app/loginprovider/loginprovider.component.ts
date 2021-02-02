import { Component, OnInit } from '@angular/core';
import { ProviderService } from '../loginprovider.service'
import { Provider} from '../loginprovider'
@Component({
  selector: 'app-loginprovider',
  templateUrl: './loginprovider.component..html',
  styleUrls: ['./loginprovider.component..css']
})
export class ProviderComponent implements OnInit {

  user1 : Provider  = new Provider(0,"","","","","");
  message : any;

  constructor(private service : ProviderService) { }

  ngOnInit() {
  }

  public providerloginNow(){
    let reponse = this.service.dologin(this.user1);
    reponse.subscribe(data => {
      this.message = data;
    });
  }
}
