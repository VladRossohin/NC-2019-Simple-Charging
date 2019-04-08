import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ServiceComponent } from './components/service.component';

@NgModule({
  declarations: [ServiceComponent],
  exports: [
    ServiceComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ServiceModule { }
