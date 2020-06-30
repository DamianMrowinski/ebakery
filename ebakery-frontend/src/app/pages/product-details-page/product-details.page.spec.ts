import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductDetailsPage } from './product-details.page';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterModule } from '@angular/router';

describe('ProductDetailsPage', () => {
  let component: ProductDetailsPage;
  let fixture: ComponentFixture<ProductDetailsPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, RouterModule.forRoot([])],
      declarations: [ProductDetailsPage],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductDetailsPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
