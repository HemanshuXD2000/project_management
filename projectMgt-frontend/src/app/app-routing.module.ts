import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ManagerComponent} from "./layout/manager/manager.component";
import {CardLayoutMComponent} from "./components/card-layout-m/card-layout-m.component";
import {TaskmComponent} from "./components/taskm/taskm.component";
import {WorkforceMComponent} from "./components/workforce-m/workforce-m.component";
import {SubtaskMComponent} from "./components/subtask-m/subtask-m.component";
import {LoginComponent} from "./layout/login/login.component";

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  { path: 'manager', component: ManagerComponent, children: [
      {
       path: 'card',
       component: CardLayoutMComponent
      },
          {
              path: 'taskM',
              component: TaskmComponent
          },
          {
              path: 'workforceM',
              component: WorkforceMComponent,
          },
          {
              path: 'subtaskM',
              component: SubtaskMComponent
          }
    ]}
];

//export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
