import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ServiceComponent } from './components/table/service.component';
import { HttpClientModule } from '@angular/common/http'
import {ServiceService} from "../../services/service.service";
import {RouterModule} from '@angular/router';
import { ServiceDetailsComponent } from './components/service-details/service-details.component';

@NgModule({
  declarations: [ServiceComponent, ServiceDetailsComponent],
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
