package pl.damianmrowinski.ebakerybackend.app.service.product;

import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.product.converter.ProductEntityToProductDetailsDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.domain.repository.product.ProductRepository;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductDetailsDto;

@Service
class ProductDetailsServiceImpl implements ProductDetailsService {

    private final ProductRepository productRepository;
    private final ProductEntityToProductDetailsDtoConverter productEntityToProductDetailsDtoConverter;

    public ProductDetailsServiceImpl(ProductRepository productRepository,
                                     ProductEntityToProductDetailsDtoConverter productEntityToProductDetailsDtoConverter) {
        this.productRepository = productRepository;
        this.productEntityToProductDetailsDtoConverter = productEntityToProductDetailsDtoConverter;
    }

    @Override
    public ProductDetailsDto findByProductId(Long productId) {
        Product product = productRepository.getOne(productId);
        return productEntityToProductDetailsDtoConverter.convert(product);
    }
}
