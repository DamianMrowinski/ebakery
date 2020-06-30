import { Injectable } from '@angular/core';
import { ItemInCart } from '../model/item-in-cart';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ShoppingCartService {

  itemsInCart: ItemInCart[] = [];

  totalPrice: Subject<number> = new Subject<number>();
  totalAmount: Subject<number> = new Subject<number>();

  constructor() {
  }

  addToCart(item: ItemInCart) {
    let alreadyExistsItemInCart = false;
    let existingItemInCart: ItemInCart;
    if (this.itemsInCart.length > 0) {
      existingItemInCart = this.itemsInCart.find(
        (tempItem) => tempItem.id === item.id
      );
      alreadyExistsItemInCart = existingItemInCart !== undefined;
    }
    if (alreadyExistsItemInCart) {
      existingItemInCart.amount++;
    } else {
      this.itemsInCart.push(item);
    }
    this.computeTotals();
  }

  decreaseAmount(item: ItemInCart) {
    item.amount--;
    if (item.amount === 0) {
      this.remove(item);
    } else {
      this.computeTotals();
    }
  }

  computeTotals() {
    let totalPrice = 0;
    let totalAmount = 0;

    for (const item of this.itemsInCart) {
      totalPrice += item.amount * item.price;
      totalAmount += item.amount;
    }
    this.totalPrice.next(totalPrice);
    this.totalAmount.next(totalAmount);
  }

  remove(item: ItemInCart) {
    const index = this.itemsInCart.findIndex(
      (tempItem) => tempItem.id === item.id
    );
    if (index > -1) {
      this.itemsInCart.splice(index, 1);
      this.computeTotals();
    }
  }
}
