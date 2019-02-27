import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import {CustomerOrderService} from '../customer-order.service'
import {HttpClient} from '@angular/common/http'

@Component({
  selector: 'app-customer-order-list',
  templateUrl: './customer-order-list.component.html',
  styleUrls: ['./customer-order-list.component.css']
})
export class CustomerOrderListComponent implements OnInit {
  customerOrderList:Customer[];

  constructor(private customerOrderService:CustomerOrderService,private http:HttpClient ) { }

  ngOnInit() {
    this.getOrderList().subscribe((orderList)=>{
      this.customerOrderList=orderList;
      });

      this.customerOrderService.onCustomerAdded.subscribe((cust:Customer)=>{this.customerOrderList.push(cust);})
  }
  getOrderList(){
    return this.http.get<Customer[]>('http://localhost:8080/api/order');
   }
}
