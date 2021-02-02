import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { CodeforinterviewComponent } from './body/body.component';
import { AllUsersComponent } from './all-users/all-users.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { FooterComponent } from './footer/footer.component';
import { ProviderComponent} from './loginprovider/loginprovider.component'
import { AllProviderComponent } from './all-provider/all-provider.component';
import { BookComponent } from './book-service/book-service.component';
import { Search1Component } from './body/search1/search1.component';
import {ServiceComponent } from './servicess/servicess.component'
import { AdminComponent} from './login/admin/admin.component'
import { NewServiceComponent } from './servicebook/newservice/newservice.component';
import { servicebookComponent } from './servicebook/servicebook.component';

const routes: Routes = [
  {
    path : "", redirectTo: "body" , pathMatch : "full"
  },
  {
    path : "body", component : CodeforinterviewComponent
  },
  {
    path : "register" , component : RegisterComponent
  },
  {
    path : "login" , component : LoginComponent
  },
  {
    path : "search" , component : SearchComponent
  },
  {
    path : "about" , component : AboutComponent
  },
  {
    path : "admin" , component : AdminComponent
  },
  {
    path : "servicebook" , component : servicebookComponent
  },


  {
    path : "newservice" , component : NewServiceComponent
  },

  {
    path : "footer" , component : FooterComponent
  },
  {
    path : "loginprovider" , component : ProviderComponent
  },
  {
    path : "all-provider", component : AllProviderComponent
  },
  {
    path : "servicess", component : ServiceComponent
  },
  {
    path : "booking-service", component : BookComponent
  },
  {
    path : "search1", component : Search1Component
  },

  {
    path : "all-users", component : AllUsersComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
