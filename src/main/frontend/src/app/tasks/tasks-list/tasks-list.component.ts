import { Component, OnInit } from '@angular/core';
import {Task} from '../task.model';
import {TaskService} from '../task.service';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  public tasks:Task[]=[];

  constructor(public taskService:TaskService) { }

  ngOnInit() {
    this.taskService.getTaskList().subscribe((taskList)=>{
    this.tasks=taskList;
    });
    // this.tasks.push(new Task(1,'task1','11/11/2018',true));
    // this.tasks.push(new Task(2,'task2','11/11/2018',false));
    // this.tasks.push(new Task(3,'task3','11/11/2018',true));
    // this.tasks.push(new Task(4,'task4','11/11/2018',true));
    this.taskService.onTaskAdded.subscribe((task:Task)=>{this.tasks.push(task);})
  }
  taskCompleted(event,task){
    task.completed=event.target.checked;
    this.taskService.saveTask(task).subscribe();
  }
  getDuedateLabel(task){
return task.completed?'label-success':'label-primary';
  }
saveTask(event){
  if(event.keyCode == 13)
this.taskService.saveTask(new Task(null,event.target.value,'11/11/2019',false)).subscribe((a)=>{this.reload()});
}
reload(){
  this.taskService.getTaskList().subscribe((taskList)=>{
    this.tasks=taskList;
});
}
}