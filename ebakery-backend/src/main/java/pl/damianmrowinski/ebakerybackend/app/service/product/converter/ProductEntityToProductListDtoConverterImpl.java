package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductListDto;

@Component
class ProductEntityToProductListDtoConverterImpl implements ProductEntityToProductListDtoConverter {

    @Override
    public ProductListDto convert(Product product) {
        return new ProductListDto(
                product.getId(),
                product.getImage(),
                product.getName(),
                product.getPrice()
        );
    }

}
