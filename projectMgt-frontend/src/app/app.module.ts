import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {LayoutModule} from "@angular/cdk/layout";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {MatMenuModule} from "@angular/material/menu";
import {MatSidenavModule} from "@angular/material/sidenav";
import {MatCardModule} from "@angular/material/card";
import {MatListModule} from "@angular/material/list";
import { ManagerComponent } from './layout/manager/manager.component';
import { CreateProjectComponent } from './components/create-project/create-project.component';
import { CardLayoutMComponent } from './components/card-layout-m/card-layout-m.component';
import { CardSmMComponent } from './components/cards/card-sm-m/card-sm-m.component';
import { CardHrChartMComponent } from './components/cards/card-hr-chart-m/card-hr-chart-m.component';
import { CardVrChartMComponent } from './components/cards/card-vr-chart-m/card-vr-chart-m.component';
import { TaskmComponent } from './components/taskm/taskm.component';
import { CreateTaskComponent } from './components/create-task/create-task.component';
import {NgCircleProgressModule} from "ng-circle-progress";
import {MAT_DIALOG_DEFAULT_OPTIONS, MatDialog, MatDialogModule} from "@angular/material/dialog";
import {ProjectService} from "./services/project.service";
import {SkillService} from "./services/skill.service";
import {EmployeeService} from "./services/employee.service";
import {ProjectmemberService} from "./services/projectmember.service";
import {TaskdatastorageService} from "./services/taskdatastorage.service";
import {SubTaskService} from "./services/sub-task.service";
import { CompletedialogComponentComponent } from './components/completedialog-component/completedialog-component.component';
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatDatepickerModule} from "@angular/material/datepicker";
import { WorkforceMComponent } from './components/workforce-m/workforce-m.component';
import {MatTabsModule} from "@angular/material/tabs";
import { ViewmembersComponent } from './components/viewmembers/viewmembers.component';
import {MatTableModule} from "@angular/material/table";
import { AddmembersComponent } from './components/addmembers/addmembers.component';
import {MatNativeDateModule, MatOptionModule} from "@angular/material/core";
import {MatSelectModule} from "@angular/material/select";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatInputModule} from "@angular/material/input";
import { SubtaskMComponent } from './components/subtask-m/subtask-m.component';
import { CreateSubTaskComponentComponent } from './components/create-sub-task-component/create-sub-task-component.component';
import { SidenavComponent } from './layout/sidenav/sidenav.component';
import { LoginComponent } from './layout/login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    ManagerComponent,
    CreateProjectComponent,
    CardLayoutMComponent,
    CardSmMComponent,
    CardHrChartMComponent,
    CardVrChartMComponent,
    TaskmComponent,
    CreateTaskComponent,
    CompletedialogComponentComponent,
    WorkforceMComponent,
    ViewmembersComponent,
    AddmembersComponent,
    SubtaskMComponent,
    CreateSubTaskComponentComponent,
    SidenavComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatMenuModule,
    MatSidenavModule,
    MatCardModule,
    MatListModule,
    MatDialogModule,
    MatTooltipModule,
      MatInputModule,
    NgCircleProgressModule.forRoot({
      radius: 100,
      outerStrokeWidth: 16,
      outerStrokeColor: "#78C000",
      animationDuration: 300,
      showInnerStroke: false,
      showSubtitle: false,
      maxPercent: 100,
      unitsFontSize: "50",
      titleFontSize: "50",
      responsive: true
    }),
    MatFormFieldModule,
    MatDatepickerModule,
    MatTabsModule,
    MatTableModule,
    MatOptionModule,
    MatSelectModule,
    MatPaginatorModule,
      MatDatepickerModule,
      MatNativeDateModule
  ],
  providers: [MatDialog,ProjectService,SkillService,EmployeeService,
    ProjectmemberService,TaskdatastorageService, MatDatepickerModule, SubtaskMComponent,
    SubTaskService, {provide: MAT_DIALOG_DEFAULT_OPTIONS, useValue:{hasBackdrop: false}}],
  bootstrap: [AppComponent],
  //entryComponents: [SubtaskMComponent]
})
export class AppModule { }
