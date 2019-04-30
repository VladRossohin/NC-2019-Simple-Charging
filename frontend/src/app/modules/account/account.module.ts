import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountComponent } from './components/account.component';
import { HttpClient } from  '@angular/common/http';
import {UserService} from "../../services/user.service";

@NgModule({
  declarations: [AccountComponent],
  imports: [
    CommonModule,
    HttpClient
  ],
  providers: [UserService]
})
export class AccountModule { }
