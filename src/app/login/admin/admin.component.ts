import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

//import { Category } from '../../category';
//import { ServiceService } from '../../shared-service/service.service';
//import { SubcategoryService } from '../../shared-service/subcategory.service';
//import { CategoryService } from '../../shared-service/category.service';
//import { SubCategory } from '../../sub-category';
//import { Services } from '../../../app/service';
//import { ProviderService } from '../../shared-service/provider.service';;

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {


  private catid:Number;
  private subcatid:Number;
  private status: boolean = false;
  private pstatus: boolean = false;
  searchString: string;

  private flag:string;


  constructor(){}


  ngOnInit() {

  }

  
}
