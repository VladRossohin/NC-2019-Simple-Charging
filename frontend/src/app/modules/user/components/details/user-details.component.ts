import { Component, OnInit } from '@angular/core';
import {User} from "../../models/user";
import {HttpClient} from '@angular/common/http';
import {UserService} from "../../../../services/user.service";

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  users: User[];
  admin: User;

  constructor(private userService: UserService) {}

  ngOnInit() {

    this.userService.getAllUsers().subscribe((data)=>{
      this.users=data;
    })

    this.userService.getUserByLogin("admin").subscribe(value => {
      this.admin = value;
      console.log(this.admin.role);
    })

  }


}
