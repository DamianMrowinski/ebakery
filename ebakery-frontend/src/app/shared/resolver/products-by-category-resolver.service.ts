import { Injectable } from '@angular/core';
import { ProductService } from '../service/product.service';
import { ActivatedRouteSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { Product } from '../model/product';
import { PAGES } from '../../app.constants';

@Injectable({
  providedIn: 'root',
})
export class ProductsByCategoryResolverService {

  constructor(private productService: ProductService) {
  }

  resolve(route: ActivatedRouteSnapshot): Observable<Product[]> | Promise<Product[]> | Product[] {
    const categoryId = route.paramMap.get(PAGES.PARAMETERS.CATEGORY_ID);
    return this.productService.getProductList$(+categoryId);
  }

}
