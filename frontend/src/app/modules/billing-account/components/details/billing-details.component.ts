import { Component, OnInit } from '@angular/core';
import {BillingAccount} from "../../models/billing-account";
import {BaService} from "../../../../services/ba.service";

@Component({
  selector: 'app-billing-details',
  templateUrl: './billing-details.component.html',
  styleUrls: ['./billing-details.component.css']
})
export class BillingDetailsComponent implements OnInit {

  testBA: BillingAccount;
  clientBA: BillingAccount;
  ready: boolean = false;

  constructor(private baService: BaService) { }

  ngOnInit() {

    this.baService.getBillingAccountById(1).subscribe(value => {
      this.testBA = value;
    })

    this.baService.getBillingAccountById(2).subscribe(value => {
      this.clientBA = value;
      this.ready = true;
    })
  }

}
