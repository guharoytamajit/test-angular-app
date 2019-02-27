import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TasksComponent } from './tasks/tasks.component';
import { TasksAddComponent } from './tasks/tasks-add/tasks-add.component';
import { TasksListComponent } from './tasks/tasks-list/tasks-list.component';
import {TaskService} from './tasks/task.service'
import {HttpClientModule} from '@angular/common/http'
import {FormsModule} from '@angular/forms';
import { CustomerOrderComponent } from './customer-order/customer-order.component';
import { CustomerOrderListComponent } from './customer-order-list/customer-order-list.component';

@NgModule({
  declarations: [
    AppComponent,
    TasksComponent,
    TasksAddComponent,
    TasksListComponent,
    CustomerOrderComponent,
    CustomerOrderListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
