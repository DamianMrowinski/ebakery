import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderSubmittedPage } from './order-submitted.page';

describe('OrderSubmittedComponent', () => {
  let component: OrderSubmittedPage;
  let fixture: ComponentFixture<OrderSubmittedPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [OrderSubmittedPage],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderSubmittedPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
