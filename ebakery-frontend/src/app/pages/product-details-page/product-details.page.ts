import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../../shared/service/product.service';
import { Product } from '../../shared/model/product';
import { ShoppingCartService } from '../../shared/service/shopping-cart.service';
import { ItemInCart } from '../../shared/model/item-in-cart';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.page.html',
  styleUrls: ['./product-details.page.scss'],
})
export class ProductDetailsPage implements OnInit {

  product: Product;

  constructor(
    private productService: ProductService,
    private cartService: ShoppingCartService,
    private activatedRoute: ActivatedRoute,
  ) {
  }

  ngOnInit(): void {
    this.activatedRoute.data
      .subscribe((data: { product: Product }) => this.product = data.product);
  }

  addToCart(): void {
    const cartItem = new ItemInCart(this.product);
    this.cartService.addToCart(cartItem);
  }

}
