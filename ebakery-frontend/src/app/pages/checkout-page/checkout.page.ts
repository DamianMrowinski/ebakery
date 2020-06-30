import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { ShoppingCartService } from '../../shared/service/shopping-cart.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.page.html',
  styleUrls: ['./checkout.page.scss'],
})
export class CheckoutPage implements OnInit {

  checkoutFormGroup: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private router: Router,
              private shoppingCartService: ShoppingCartService,
  ) {
  }

  ngOnInit(): void {
    this.checkoutFormGroup = this.formBuilder.group({
      client: this.formBuilder.group({
        firstName: [],
        lastName: [],
        mail: [],
      }),
      address: this.formBuilder.group({
        country: [],
        city: [],
        street: [],
        zipCode: [],
      }),
    });
  }

  saveOrder(): void {
    console.log(this.checkoutFormGroup.get('client').value);
    console.log(this.checkoutFormGroup.get('address').value);
    let totalAmount = 0;
    this.shoppingCartService.itemsInCart
      .forEach(item => totalAmount += (item.price * item.amount));
    console.log(totalAmount);
     // TODO save order

    this.router.navigate(['order-submitted']);
  }
}
