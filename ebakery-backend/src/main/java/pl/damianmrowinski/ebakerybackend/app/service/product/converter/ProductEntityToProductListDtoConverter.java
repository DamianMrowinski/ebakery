package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.Product;
import pl.damianmrowinski.ebakerybackend.dto.ProductListDto;

public interface ProductEntityToProductListDtoConverter {

    ProductListDto convert(Product productEntity);

}
