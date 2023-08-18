import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Skills} from "../models/skills";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class SkillService {
  private skillURL :string;
  private results :Observable<Skills[]>

  constructor(private http :HttpClient) {
    this.skillURL = "http://localhost:9000/MANAGER-SERVICE/skill/getAllSkills";
  }

  public findAll() :Observable<Skills[]>
  {
    return this.http.get<Skills[]>(this.skillURL);
  }
}
