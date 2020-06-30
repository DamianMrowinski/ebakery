import { TestBed } from '@angular/core/testing';

import { ProductsByCategoryResolverService } from './products-by-category-resolver.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('ProductsByCategoryResolverService', () => {

  let service: ProductsByCategoryResolverService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    service = TestBed.inject(ProductsByCategoryResolverService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
