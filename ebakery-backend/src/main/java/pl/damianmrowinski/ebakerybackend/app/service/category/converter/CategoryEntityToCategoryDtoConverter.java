package pl.damianmrowinski.ebakerybackend.app.service.category.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.Category;
import pl.damianmrowinski.ebakerybackend.dto.CategoryDto;

public interface CategoryEntityToCategoryDtoConverter {

    CategoryDto convert(Category category);

}
