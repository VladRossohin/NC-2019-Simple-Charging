import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserDetailsComponent } from './components/details/user-details.component';
import {UserService} from "../../services/user.service";
import { BrowserModule } from '@angular/platform-browser'
import {RouterModule} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';


@NgModule({
  declarations: [UserDetailsComponent],
  exports: [
    UserDetailsComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule,
    HttpClientModule
  ],
  providers:[UserService],

})
export class UserModule { }
