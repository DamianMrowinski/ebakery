import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../model/product';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private httpClient: HttpClient) {
  }

  getProduct$(productId: number): Observable<Product> {
    const productUrl = `${environment.apiUrl}products/${productId}`;
    return this.httpClient.get<Product>(productUrl);
  }

  getProductList$(categoryId: number): Observable<Product[]> {
    const url = `${environment.apiUrl}products/findByCategoryId?categoryId=${categoryId}`;
    return this.httpClient.get<Product[]>(url);
  }

  searchProducts$(keyword: string): Observable<Product[]> {
    const url = `${environment.apiUrl}products/findByNameContaining?name=${keyword}`;
    return this.httpClient.get<Product[]>(url);
  }
}
