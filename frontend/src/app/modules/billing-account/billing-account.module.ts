import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {BaService} from "../../services/ba.service";
import { HttpClientModule } from '@angular/common/http';
import {BillingAccountsComponent} from "./components/table/billing-accounts.component";
import {BillingDetailsComponent} from "./components/details/billing-details.component";

@NgModule({
  declarations: [
    BillingDetailsComponent,
    BillingAccountsComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule
  ],
  providers: [

  ],
  exports: [
    BillingAccountsComponent,
    BillingDetailsComponent
  ]
})
export class BillingAccountModule { }
