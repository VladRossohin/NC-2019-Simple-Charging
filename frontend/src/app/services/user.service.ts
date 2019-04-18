import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../modules/user/models/user'

@Injectable()
export class UserService {

  constructor(private http: HttpClient) { }

  getAllUsers() {
    return this.http.get<User[]>('/api/user');
  }

  getUserByLogin(login: string) {
    return this.http.get<User>(`/api/user/login/${login}`);
  }



}
