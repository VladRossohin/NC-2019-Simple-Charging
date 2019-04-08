import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import {HomeComponent} from "./modules/layout/components/home/home.component";
import {LayoutModule} from "./modules/layout/layout.module";
import {NgbModule} from '@ng-bootstrap/ng-bootstrap'
import {HeaderModule} from "./modules/header/header.module";
import {LoginComponent} from "./modules/layout/components/login/login.component";
import {RegisterComponent} from "./modules/layout/components/register/register.component";
import {NotFoundComponent} from "./modules/layout/components/not-found/not-found.component";
import {AccountComponent} from "./modules/layout/components/account/account.component";

const appRoutes: Routes = [

  {path: "", component: HomeComponent},
  {path: "home", component: HomeComponent},
  {path: "account", component: AccountComponent},
  {path: "login", component: LoginComponent},
  {path: "register", component: RegisterComponent},
  {path: "**", component: NotFoundComponent}

]

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    LayoutModule,
    RouterModule.forRoot(appRoutes),
    NgbModule.forRoot(),
    HeaderModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
