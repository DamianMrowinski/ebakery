package pl.damianmrowinski.ebakerybackend.app.service.product;

import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.product.converter.ProductEntityToProductListDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.Product;
import pl.damianmrowinski.ebakerybackend.domain.repository.ProductRepository;
import pl.damianmrowinski.ebakerybackend.dto.ProductListDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductListServiceImpl implements ProductListService {

    private final ProductEntityToProductListDtoConverter productEntityToProductListDtoConverter;
    private final ProductRepository productRepository;

    public ProductListServiceImpl(ProductEntityToProductListDtoConverter productEntityToProductListDtoConverter, ProductRepository productRepository) {
        this.productEntityToProductListDtoConverter = productEntityToProductListDtoConverter;
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductListDto> findByCategoryId(Long categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId);
        return products.stream()
                .map(productEntityToProductListDtoConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductListDto> findByNameContaining(String name) {
        List<Product> products = productRepository.findByNameContaining(name);
        return products.stream()
                .map(productEntityToProductListDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
