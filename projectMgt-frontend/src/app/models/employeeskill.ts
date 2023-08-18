import {Employee} from "./employee";
import {Skills} from "./skills";

export class Employeeskill {
  employeeId: Employee;
  skillId: Skills;

  constructor(employeeId?: Employee, skillId?: Skills) {
    this.employeeId = employeeId;
    this.skillId = skillId;
  }
}
