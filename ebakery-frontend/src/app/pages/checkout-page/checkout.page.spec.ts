import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckoutPage } from './checkout.page';
import { ReactiveFormsModule } from '@angular/forms';

describe('CheckoutPage', () => {

  let component: CheckoutPage;
  let fixture: ComponentFixture<CheckoutPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        CheckoutPage
      ],
      imports: [
        ReactiveFormsModule
      ],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckoutPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
