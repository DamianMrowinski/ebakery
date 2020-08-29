package pl.damianmrowinski.ebakerybackend.app.service.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.product.converter.ProductEntityToProductListDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.domain.repository.product.ProductRepository;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductListDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class ProductListServiceImpl implements ProductListService {

    private final ProductEntityToProductListDtoConverter productEntityToProductListDtoConverter;
    private final ProductRepository productRepository;

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
