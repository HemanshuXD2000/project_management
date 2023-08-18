import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Project} from "../models/project";
import {Projectmongo} from "../models/projectmongo";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {
  private projectUrl: string;
  private projectManagerUrl: string;
  private projectDescServiceUrl : string;
  private projectByIdUrl: string;
  private completeProjectUrl: string;
  constructor(private http :HttpClient) {
    this.projectUrl = 'http://localhost:9000/ADMIN-VIEW-SERVICE/api/v1/getProjects';
    this.projectManagerUrl = 'http://localhost:9000/MANAGER-SERVICE/project/Project';
    this.projectDescServiceUrl = 'http://localhost:9000/MANAGER-SERVICE/projectDesc/saveProjectDesc';
    this.projectByIdUrl = 'http://localhost:9000/MANAGER-SERVICE/project/ProjectById';
    this.completeProjectUrl = 'http://localhost:9000/MANAGER-SERVICE/project/CompleteProject';
  }

  public getAllProjectDetails() :Observable<Project[]> {
    let value = this.http.get<Project[]>(this.projectUrl);
    console.log(value);
    return value;
  }

  public findCompletedAll() :Observable<Project[]> {
    let comp = "completed";
    const url = `${this.projectUrl}/${comp}`;

    let value = this.http.get<Project[]>(url);
    console.log(value);
    return value;
  }

  public getProjectById(id :number) :Observable<Project[]> {
    const url = `${this.projectUrl}/${id}`;
    console.log(url);
    return this.http.get<Project[]>(url);
  }

  private handleError(error :any): Promise<Array<any>> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }

  public findMongodata(id :number) :Observable<Projectmongo[]> {
    let mong = "mongodb";
    const url = `${this.projectUrl}/${mong}/${id}`;
    return this.http.get<Projectmongo[]>(url);
  }

  public getOngoingProjectByYear(yr:number):Observable<Project[]> {
    let pyr ="'http://localhost:9000/ADMIN-VIEW-SERVICE/api/v1/OngoingByYear";
    const url = `${pyr}/${yr}`;
    return this.http.get<Project[]>(url);
  }

  public getCompletedProjectByYear(yr:number):Observable<Project[]> {
    let pyr ="'http://localhost:9000/ADMIN-VIEW-SERVICE/api/v1/CompletedByYear";
    const url = `${pyr}/${yr}`;
    return this.http.get<Project[]>(url);
  }
  public getLatestProject():Observable<Project[]>{
    let latestUrl ="'http://localhost:9000/ADMIN-VIEW-SERVICE/api/v1/getLatest";
    return this.http.get<Project[]>(latestUrl);
  }

  public getProjectCount():Observable<number[]>{
    let CountUrl ="'http://localhost:9000/ADMIN-VIEW-SERVICE/api/v1/getByYear";
    return this.http.get<number[]>(CountUrl);
  }

  public saveProjectDesc(projectDescStake: Projectmongo) {

    return this.http.post<Projectmongo>(this.projectDescServiceUrl, projectDescStake);
  }

  public findAll(): Observable<Project[]> {
    return this.http.get<Project[]>(this.projectManagerUrl);
  }

  public save(project: Project) {
    return this.http.post<Project>(this.projectManagerUrl, project);
  }

  public findById(id: number = 1): Observable<Project> {
    return this.http.get<Project>(this.projectByIdUrl + '/' + id);
  }

  public setProjectComplete(project: Project) {
    return this.http.put<boolean>(this.completeProjectUrl, project);
  }
}
