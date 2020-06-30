package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.Product;
import pl.damianmrowinski.ebakerybackend.dto.ProductDetailsDto;

@Component
public class ProductEntityToProductDetailsDtoConverterImpl implements ProductEntityToProductDetailsDtoConverter {

    @Override
    public ProductDetailsDto convert(Product product) {
        return new ProductDetailsDto(
                product.getId(),
                product.getDetails(),
                product.getImage(),
                product.getName(),
                product.getPrice()
        );
    }
}
