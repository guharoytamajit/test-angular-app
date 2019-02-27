import { Injectable,EventEmitter } from '@angular/core';
import {Customer} from './customer'

@Injectable({
  providedIn: 'root'
})
export class CustomerOrderService {
  onCustomerAdded=new EventEmitter<Customer>();
  constructor() { }
}
