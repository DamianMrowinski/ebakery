package pl.damianmrowinski.ebakerybackend.app.service.category.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.category.Category;
import pl.damianmrowinski.ebakerybackend.dto.category.CategoryDto;

public interface CategoryEntityToCategoryDtoConverter {

    CategoryDto convert(Category category);

}
