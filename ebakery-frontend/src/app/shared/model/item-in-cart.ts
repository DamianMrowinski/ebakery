import { Product } from './product';

export class ItemInCart {
  id: string;
  name: string;
  image: string;
  price: number;
  amount: number;

  constructor(product: Product) {
    this.id = product.id;
    this.name = product.name;
    this.image = product.image;
    this.price = product.price;
    this.amount = 1;
  }
}
