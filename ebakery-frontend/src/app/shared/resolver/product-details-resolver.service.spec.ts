import { TestBed } from '@angular/core/testing';

import { ProductDetailsResolverService } from './product-details-resolver.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('ProductDetailsResolverService', () => {
  let service: ProductDetailsResolverService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    service = TestBed.inject(ProductDetailsResolverService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
