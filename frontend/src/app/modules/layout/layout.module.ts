import {NgModule} from '@angular/core';
import {NotFoundComponent} from './components/not-found/not-found.component';
import {HomeComponent} from './components/home/home.component';
import {RegisterComponent} from './components/register/register.component';
import {LoginComponent} from './components/login/login.component';
import {AccountComponent} from './components/account/account.component';
import {HeaderModule} from "../header/header.module";
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {RouterModule, Routes} from '@angular/router';
import {ServiceModule} from "../service/service.module";
import {UserModule} from "../user/user.module";
import {UserService} from "../../services/user.service";
import {ServiceService} from "../../services/service.service";
import {BaService} from "../../services/ba.service";
import {BillingDetailsComponent} from "../billing-account/components/details/billing-details.component";
import {BillingAccountModule} from "../billing-account/billing-account.module";
import {ServiceViewComponent} from './components/service-view/service-view.component';
import {SubscribeModule} from "../subscribe/subscribe.module";
import {SubscribeService} from "../../services/subscribe.service";
import {AlertService} from "../../services/alert.service";
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule }    from '@angular/forms';


/*
const appRoutes: Routes = [
  {path: "home", component: HomeComponent},
  {path: "login", component: LoginComponent},
  {path: "register", component: RegisterComponent},
  {path: "**", component: NotFoundComponent}
  ]*/


@NgModule({
  declarations: [NotFoundComponent, HomeComponent, RegisterComponent, LoginComponent, AccountComponent, ServiceViewComponent],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    HeaderModule,
    NgbModule,
    RouterModule,
    ServiceModule,
    UserModule,
    BillingAccountModule,
    SubscribeModule
  ],
  exports: [
    HomeComponent,
    NotFoundComponent,
    LoginComponent,
    RegisterComponent,
    AccountComponent,
    ServiceViewComponent
  ],
  providers: [
    UserService,
    ServiceService,
    BaService,
    SubscribeService,
    AlertService
  ]
})
export class LayoutModule {
}
