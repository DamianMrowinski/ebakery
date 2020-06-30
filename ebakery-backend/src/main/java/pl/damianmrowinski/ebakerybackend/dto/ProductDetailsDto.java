package pl.damianmrowinski.ebakerybackend.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class ProductDetailsDto {

    private final Long id;
    private final String details;
    private final String image;
    private final String name;
    private final BigDecimal price;

}
