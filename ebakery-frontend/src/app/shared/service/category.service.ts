import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../model/category';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class CategoryService {
  constructor(private httpClient: HttpClient) {
  }

  getCategories$(): Observable<Category[]> {
    const url = `${environment.apiUrl}categories`;
    return this.httpClient.get<Category[]>(url);
  }
}
