import { Injectable,EventEmitter } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Task } from './task.model';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  onTaskAdded=new EventEmitter<Task>();

  constructor(public http:HttpClient) { }

  getTaskList(){
   return this.http.get<Task[]>('http://localhost:8080/api/task');
  }

  saveTask(task:Task){
    return this.http.post('http://localhost:8080/api/task/save',task);
  }
}
