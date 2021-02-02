import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import {AdminComponent} from './login/admin/admin.component'
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CodeforinterviewComponent } from './body/body.component';
import { AllUsersComponent } from './all-users/all-users.component';
import { SearchComponent } from './search/search.component';
import { FooterComponent } from './footer/footer.component';
import { NewServiceComponent} from './servicebook/newservice/newservice.component'
import { LoginComponent} from './login/login.component'
import { AboutComponent } from './about/about.component';
import { ProviderComponent} from './loginprovider/loginprovider.component'
import { servicebookComponent} from './servicebook/servicebook.component'
import { AllProviderComponent} from './all-provider/all-provider.component'
import { BookComponent } from './book-service/book-service.component';
import { Search1Component } from './body/search1/search1.component';
import { ServiceComponent } from '../app/servicess/servicess.component'

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    CodeforinterviewComponent,
    AllUsersComponent,
    AdminComponent,
    servicebookComponent,
    NewServiceComponent,
    ProviderComponent,
    ServiceComponent,
    AllProviderComponent,
    BookComponent,
    SearchComponent,
    FooterComponent,
    LoginComponent,
    AboutComponent,
    Search1Component


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
