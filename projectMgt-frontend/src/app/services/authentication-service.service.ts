import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {User} from "../models/user";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationServiceService {
  private baseURL = 'http://localhost:9000/LOGIN-SERVICE';

  constructor(private httpClient: HttpClient) {}

  login(user: User): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}` + '/token/login', user);
  }

  findUserById(id: number): Observable<Object> {
    return this.httpClient.get(`${this.baseURL}` + '/users/' + `${id}`);
  }
}
