import { Component, OnInit } from '@angular/core';
import {TaskService} from '../task.service';
import {Task} from '../task.model';

@Component({
  selector: 'app-tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

  newTaskName='';

  constructor(public taskService:TaskService) { }

  ngOnInit() {
  }
  saveTask(event){
 
      this.taskService.saveTask(new Task(null,event.target.value,'11/11/2019',false)).subscribe((a:Task)=>{
        this.newTaskName='';
        this.taskService.onTaskAdded.emit(a);
      });
     
  }
}
