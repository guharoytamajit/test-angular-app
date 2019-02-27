import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import {HttpClient} from '@angular/common/http'
import {CustomerOrderService} from '../customer-order.service'

@Component({
  selector: 'app-customer-order',
  templateUrl: './customer-order.component.html',
  styleUrls: ['./customer-order.component.css']
})
export class CustomerOrderComponent implements OnInit {
customer:Customer;
  constructor(public http:HttpClient,private customerOrderService:CustomerOrderService) { }

  ngOnInit() {
    this.customer=new Customer();
  }
  submitOrder(){
    console.log(JSON.stringify(this.customer))
    // debugger;
    return this.http.post('http://localhost:8080/api/order/save',this.customer).subscribe((body)=>{
      console.log("saved: "+JSON.stringify(body));
      this.customerOrderService.onCustomerAdded.emit(this.customer);
      this.customer=new Customer();
    },(err)=>console.log(err));
  }

 
  
}
