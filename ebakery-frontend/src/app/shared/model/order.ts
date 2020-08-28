export class Order {

  firstName: string;
  lastName: string;
  mail: string;
  country: string;
  city: string;
  street: string;
  zipCode: string;

  constructor(firstName: string,
              lastName: string,
              mail: string,
              country: string,
              city: string,
              street: string,
              zipCode: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mail = mail;
    this.country = country;
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
  }
}
