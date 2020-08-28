package pl.damianmrowinski.ebakerybackend.dto.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class ProductListDto {

    private final Long id;
    private final String image;
    private final String name;
    private final BigDecimal price;

}
