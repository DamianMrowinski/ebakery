package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.Product;
import pl.damianmrowinski.ebakerybackend.dto.ProductListDto;

@Component
public class ProductEntityToProductListDtoConverterImpl implements ProductEntityToProductListDtoConverter {

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
