import { Component, OnInit } from '@angular/core';
import { Product } from '../../shared/model/product';
import { ActivatedRoute } from '@angular/router';
import { ItemInCart } from '../../shared/model/item-in-cart';
import { ShoppingCartService } from '../../shared/service/shopping-cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product-list.page.html',
  styleUrls: ['./product-list.page.scss'],
})
export class ProductListPage implements OnInit {

  products: Product[];
  categoryId: number;
  currentCategory: string;

  constructor(
    private activatedRoute: ActivatedRoute,
    private cartService: ShoppingCartService,
  ) {
  }

  ngOnInit(): void {
    this.activatedRoute.data
      .subscribe((data: { products: Product[] }) => this.products = data.products);
  }

  addToCart(product: Product): void {
    const item = new ItemInCart(product);
    this.cartService.addToCart(item);
  }

}
