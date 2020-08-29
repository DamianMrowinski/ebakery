import {Component} from '@angular/core';
import {FormBuilder} from '@angular/forms';
import {Router} from '@angular/router';
import {ShoppingCartService} from '../../shared/service/shopping-cart.service';
import {OrderService} from '../../shared/service/order.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.page.html',
  styleUrls: ['./checkout.page.scss'],
})
export class CheckoutPage {

  checkoutFormGroup = this.formBuilder.group({
    firstName: [],
    lastName: [],
    mail: [],
    country: [],
    city: [],
    street: [],
    zipCode: []
  });

  constructor(private formBuilder: FormBuilder,
              private router: Router,
              private shoppingCartService: ShoppingCartService,
              private orderService: OrderService) {
  }

  saveOrder(): void {
    this.orderService.saveOrder$(this.checkoutFormGroup.value).subscribe();
    this.router.navigate(['order-submitted']);
  }
}
