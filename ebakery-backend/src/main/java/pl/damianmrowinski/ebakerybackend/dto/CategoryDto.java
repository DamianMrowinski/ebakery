package pl.damianmrowinski.ebakerybackend.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CategoryDto {

    private final Long id;
    private final String categoryName;

}
