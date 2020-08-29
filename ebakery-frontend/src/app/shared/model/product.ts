export class Product {
  categoryId: number;
  details: string;
  id: string;
  image: string;
  price: number;
  name: string;

  constructor(categoryId: number,
              details: string,
              id: string,
              image: string,
              price: number,
              name: string) {
    this.categoryId = categoryId;
    this.details = details;
    this.id = id;
    this.image = image;
    this.price = price;
    this.name = name;
  }
}
