import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListPage } from './pages/product-list-page/product-list.page';
import { HttpClientModule } from '@angular/common/http';
import { ProductService } from './shared/service/product.service';

import { CategoryMenuComponent } from './shared/component/header/category-menu/category-menu.component';
import { SearchBarComponent } from './shared/component/header/search-bar/search-bar.component';
import { ProductDetailsPage } from './pages/product-details-page/product-details.page';
import { ShoppingCartInfoComponent } from './shared/component/header/shopping-cart-info/shopping-cart-info.component';
import { ShoppingCartDetailsPage } from './pages/shopping-cart-details-page/shopping-cart-details.page';
import { CheckoutPage } from './pages/checkout-page/checkout.page';
import { ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NavbarComponent } from './shared/component/header/navbar/navbar.component';
import { FooterComponent } from './shared/component/footer/footer.component';
import { LoginComponent } from './shared/component/header/login/login.component';
import { WelcomePage } from './pages/welcome-page/welcome.page';
import { OrderSubmittedPage } from './pages/order-submitted-page/order-submitted.page';

const COMPONENTS = [
  AppComponent,
  CategoryMenuComponent,
  SearchBarComponent,
  ShoppingCartInfoComponent,
];

const PAGES = [
  ShoppingCartDetailsPage,
  CheckoutPage,
  ProductDetailsPage,
  ProductListPage,
];

@NgModule({
  declarations: [
    ...COMPONENTS,
    ...PAGES,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    WelcomePage,
    OrderSubmittedPage,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgbModule,
  ],
  providers: [ProductService, HttpClientModule],
  bootstrap: [AppComponent],
})
export class AppModule {
}
