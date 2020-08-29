package pl.damianmrowinski.ebakerybackend.app.service.product;

import org.springframework.transaction.annotation.Transactional;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductDetailsDto;

public interface ProductDetailsService {

    @Transactional(readOnly = true)
    ProductDetailsDto findByProductId(Long productId);

}
