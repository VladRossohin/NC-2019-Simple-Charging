import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ServiceComponent } from './components/service.component';
import { HttpClientModule } from '@angular/common/http'
import {ServiceService} from "../../services/service.service";
import {RouterModule} from '@angular/router';

@NgModule({
  declarations: [ServiceComponent],
  exports: [
    ServiceComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [ServiceService]
})
export class ServiceModule { }
