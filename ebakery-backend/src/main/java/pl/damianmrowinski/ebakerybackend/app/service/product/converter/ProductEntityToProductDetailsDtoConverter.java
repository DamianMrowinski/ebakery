package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductDetailsDto;

public interface ProductEntityToProductDetailsDtoConverter {

    ProductDetailsDto convert(Product product);

}
