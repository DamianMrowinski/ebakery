import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductListPage } from './pages/product-list-page/product-list.page';
import { ProductDetailsPage } from './pages/product-details-page/product-details.page';
import { ShoppingCartDetailsPage } from './pages/shopping-cart-details-page/shopping-cart-details.page';
import { CheckoutPage } from './pages/checkout-page/checkout.page';
import { PAGES, TEXTS } from './app.constants';
import { WelcomePage } from './pages/welcome-page/welcome.page';
import { OrderSubmittedPage } from './pages/order-submitted-page/order-submitted.page';
import { ProductDetailsResolverService } from './shared/resolver/product-details-resolver.service';
import { ProductsByCategoryResolverService } from './shared/resolver/products-by-category-resolver.service';
import { ProductsByKeywordResolverService } from './shared/resolver/products-by-keyword-resolver.service';

const EVERY_PATHS = '**';
const PATH_MATCH_FULL = 'full';

const routes: Routes = [
  {
    path: TEXTS.EMPTY_STRING,
    redirectTo: PAGES.WELCOME,
    pathMatch: PATH_MATCH_FULL,
  },
  {
    path: PAGES.WELCOME,
    component: WelcomePage,
  },
  {
    path: `${PAGES.CATEGORY}/:${PAGES.PARAMETERS.CATEGORY_ID}/:${PAGES.PRODUCT_NAME}`,
    component: ProductListPage,
    resolve: {
      products: ProductsByCategoryResolverService,
    },
  },
  {
    path: `${PAGES.SEARCH}/:${PAGES.PARAMETERS.KEYWORD}`,
    component: ProductListPage,
    resolve: {
      products: ProductsByKeywordResolverService,
    },
  },
  {
    path: `${PAGES.PRODUCTS}/:${PAGES.PARAMETERS.PRODUCT_ID}`,
    component: ProductDetailsPage,
    resolve: {
      product: ProductDetailsResolverService,
    },
  },
  {
    path: PAGES.CART,
    component: ShoppingCartDetailsPage,
  },
  {
    path: PAGES.CHECKOUT,
    component: CheckoutPage,
  },
  {
    path: PAGES.ORDER_SUBMITTED,
    component: OrderSubmittedPage,
  },
  {
    path: EVERY_PATHS,
    redirectTo: PAGES.PRODUCTS,
    pathMatch: PATH_MATCH_FULL,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {
}
