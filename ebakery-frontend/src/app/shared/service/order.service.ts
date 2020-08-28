import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Order} from '../model/order';
import {environment} from '../../../environments/environment';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private httpClient: HttpClient) {
  }

  saveOrder$(order: Order): Observable<Order> {
    return this.httpClient.post<Order>(`${environment.apiUrl}orders`, order);
  }

}
