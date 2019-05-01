import {Component, OnInit} from '@angular/core';
import {ServiceService} from "../../../../services/service.service";
import {Subscription} from "rxjs/internal/Subscription";
import {ActivatedRoute, Router} from '@angular/router';
import {Service} from '../../models/service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {

  private subscribtions: Subscription[] = [];
  services: Service[];

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


}
