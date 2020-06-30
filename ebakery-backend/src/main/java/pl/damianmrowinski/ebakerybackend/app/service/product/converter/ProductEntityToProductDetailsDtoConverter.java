package pl.damianmrowinski.ebakerybackend.app.service.product.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.Product;
import pl.damianmrowinski.ebakerybackend.dto.ProductDetailsDto;

public interface ProductEntityToProductDetailsDtoConverter {

    ProductDetailsDto convert(Product product);

}
