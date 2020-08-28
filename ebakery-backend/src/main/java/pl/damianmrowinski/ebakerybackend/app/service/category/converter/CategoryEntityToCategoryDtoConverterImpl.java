package pl.damianmrowinski.ebakerybackend.app.service.category.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.category.Category;
import pl.damianmrowinski.ebakerybackend.dto.category.CategoryDto;

@Component
class CategoryEntityToCategoryDtoConverterImpl implements CategoryEntityToCategoryDtoConverter {

    @Override
    public CategoryDto convert(Category category) {
        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }

}
