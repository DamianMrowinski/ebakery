package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductListDto;

public interface ProductEntityToProductListDtoConverter {

    ProductListDto convert(Product productEntity);

}
