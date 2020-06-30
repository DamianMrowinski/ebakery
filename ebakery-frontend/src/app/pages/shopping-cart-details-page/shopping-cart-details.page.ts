import { Component, OnInit } from '@angular/core';
import { ItemInCart } from '../../shared/model/item-in-cart';
import { ShoppingCartService } from '../../shared/service/shopping-cart.service';

@Component({
  selector: 'app-cart-summary',
  templateUrl: './shopping-cart-details.page.html',
  styleUrls: ['./shopping-cart-details.page.scss'],
})
export class ShoppingCartDetailsPage implements OnInit {

  itemsInCart: ItemInCart[] = [];
  price = 0;
  amount = 0;

  constructor(private cartService: ShoppingCartService) {
  }

  ngOnInit(): void {
    this.listCartSummary();
  }

  listCartSummary() {
    this.itemsInCart = this.cartService.itemsInCart;
    this.cartService.totalPrice.subscribe((data) => (this.price = data));
    this.cartService.totalAmount.subscribe((data) => (this.amount = data));
    this.cartService.computeTotals();
  }

  increaseAmount(item: ItemInCart) {
    this.cartService.addToCart(item);
  }

  decreaseAmount(item: ItemInCart) {
    this.cartService.decreaseAmount(item);
  }

  removeItem(item: ItemInCart) {
    this.cartService.remove(item);
  }
}
