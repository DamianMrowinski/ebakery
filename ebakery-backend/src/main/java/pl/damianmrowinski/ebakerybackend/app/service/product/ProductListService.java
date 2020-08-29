package pl.damianmrowinski.ebakerybackend.app.service.product;

import org.springframework.transaction.annotation.Transactional;
import pl.damianmrowinski.ebakerybackend.dto.product.ProductListDto;

import java.util.List;

public interface ProductListService {

    @Transactional(readOnly = true)
    List<ProductListDto> findByCategoryId(Long categoryId);

    @Transactional(readOnly = true)
    List<ProductListDto> findByNameContaining(String name);

}
