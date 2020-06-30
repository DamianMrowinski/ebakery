import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingCartInfoComponent } from './shopping-cart-info.component';

describe('ShoppingCartInfoComponent', () => {
  let component: ShoppingCartInfoComponent;
  let fixture: ComponentFixture<ShoppingCartInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ShoppingCartInfoComponent],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingCartInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
