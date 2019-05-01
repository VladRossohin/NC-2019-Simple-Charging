import { Component, OnInit } from '@angular/core';
import {User} from "../../../user/models/user";
import {Subscription} from 'rxjs';
import {UserService} from "../../../../services/user.service";
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {AlertService} from "../../../../services/alert.service";
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;
  submitted: boolean = false;
  loading: boolean = false;
  public user: User;
  private subscriptions: Subscription[];


  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private alertService: AlertService,
    private userService: UserService
  ) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      login: ['', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.]+$')]],
      firstName: ['', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]],
      lastName: ['', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]],
      email: ['', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]],
      role: ['SUBSCRIBER', Validators.required],
      password: ['', [Validators.required, Validators.minLength(4)]]
    });
  }

  get f() { return this.registerForm.controls; }

  onSubmit() {
    this.submitted = true;

    //stop if invalid
    if(this.registerForm.invalid) {
      return;
    }

    this.loading = true;
    this.userService.saveUser(this.registerForm.value)
      .pipe()
      .subscribe(
        data => {
          this.alertService.success('Registration succesful', true);
          setTimeout(() => {
            this.router.navigate(['/login']);
          }, 1000);
        },
        error => {
          this.alertService.error(error);
          this.loading = false;
        }
      )

  }

}
