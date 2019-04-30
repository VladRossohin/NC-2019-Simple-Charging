import {Component, OnInit} from '@angular/core';
import {Service} from "../models/service";
import {ServiceService} from "../../../services/service.service";
import {Subscription} from "rxjs/internal/Subscription";
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {

  private subscribtions: Subscription[] = [];
  services: Service[];
  testService: Service;
  testService1: Service;

  ready: boolean = false;

  constructor(private serviceService: ServiceService, private activateRoute: ActivatedRoute, private router: Router) {

  }

  ngOnInit() {

      const id = this.activateRoute.snapshot.params['id'];


        this.subscribtions.push(this.serviceService.getAllServices().subscribe((data: any) => {
          this.services = data[0].content;
          this.ready = true;
        }
      ))
  }

  ngOnDestroy(): void {
    this.ready = false;

  }

/*

    this.serviceService.getServiceById(1).subscribe(value => {
      this.testService = value;
    });

    this.serviceService.getServiceById(2).subscribe(value => {
      this.testService1 = value;
    });
  }
*/

}
