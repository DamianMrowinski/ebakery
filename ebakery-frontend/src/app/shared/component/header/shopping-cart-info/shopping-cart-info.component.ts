import { Component, OnInit } from '@angular/core';
import { ShoppingCartService } from '../../../service/shopping-cart.service';

@Component({
  selector: 'app-cart-info',
  templateUrl: './shopping-cart-info.component.html',
  styleUrls: ['./shopping-cart-info.component.scss'],
})
export class ShoppingCartInfoComponent implements OnInit {
  totalPrice = 0.0;
  totalAmount = 0;

  constructor(private cartService: ShoppingCartService) {
  }

  ngOnInit(): void {
    this.updateStatusOfCart();
  }

  updateStatusOfCart() {
    this.cartService.totalPrice.subscribe((data) => (this.totalPrice = data));
    this.cartService.totalAmount.subscribe((data) => (this.totalAmount = data));
  }
}
