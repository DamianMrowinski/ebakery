import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot, } from '@angular/router';
import { Product } from '../model/product';
import { Observable } from 'rxjs';
import { PAGES } from '../../app.constants';
import { ProductService } from '../service/product.service';

@Injectable({
  providedIn: 'root',
})
export class ProductDetailsResolverService implements Resolve<Product> {

  constructor(private productService: ProductService) {
  }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Product> | Promise<Product> | Product {
    const id = route.paramMap.get(PAGES.PARAMETERS.PRODUCT_ID);
    return this.productService.getProduct$(+id);
  }
}
