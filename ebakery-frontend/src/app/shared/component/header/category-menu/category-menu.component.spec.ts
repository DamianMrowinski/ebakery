import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryMenuComponent } from './category-menu.component';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('CategoryMenuComponent', () => {
  let component: CategoryMenuComponent;
  let fixture: ComponentFixture<CategoryMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      declarations: [CategoryMenuComponent],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
