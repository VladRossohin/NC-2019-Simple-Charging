import { NgModule } from '@angular/core';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { HomeComponent } from './components/home/home.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { AccountComponent } from './components/account/account.component';
import {HeaderModule} from "../header/header.module";
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {RouterModule, Routes} from '@angular/router';
import {ServiceModule} from "../service/service.module";

/*
const appRoutes: Routes = [
  {path: "home", component: HomeComponent},
  {path: "login", component: LoginComponent},
  {path: "register", component: RegisterComponent},
  {path: "**", component: NotFoundComponent}
  ]*/



@NgModule({
  declarations: [NotFoundComponent, HomeComponent, RegisterComponent, LoginComponent, AccountComponent],
  imports: [
    HeaderModule,
    NgbModule,
    RouterModule,
    ServiceModule
  ],
  exports: [
    HomeComponent,
    NotFoundComponent,
    LoginComponent,
    RegisterComponent
  ]
})
export class LayoutModule { }
