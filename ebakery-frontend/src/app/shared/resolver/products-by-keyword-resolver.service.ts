import { Injectable } from '@angular/core';
import { ProductService } from '../service/product.service';
import { ActivatedRouteSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { Product } from '../model/product';
import { PAGES } from '../../app.constants';

@Injectable({
  providedIn: 'root',
})
export class ProductsByKeywordResolverService {

  constructor(private productService: ProductService) {
  }

  resolve(route: ActivatedRouteSnapshot): Observable<Product[]> | Promise<Product[]> | Product[] {
    const keyword = route.paramMap.get(PAGES.PARAMETERS.KEYWORD);
    return this.productService.searchProducts$(keyword);
  }

}
