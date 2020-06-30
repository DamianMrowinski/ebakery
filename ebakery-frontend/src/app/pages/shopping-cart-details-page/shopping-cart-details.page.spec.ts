import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingCartDetailsPage } from './shopping-cart-details.page';

describe('ShoppingCartDetailsPage', () => {
  let component: ShoppingCartDetailsPage;
  let fixture: ComponentFixture<ShoppingCartDetailsPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ShoppingCartDetailsPage],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingCartDetailsPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
