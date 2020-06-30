package pl.damianmrowinski.ebakerybackend.app.service.category;

import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.category.converter.CategoryEntityToCategoryDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.Category;
import pl.damianmrowinski.ebakerybackend.domain.repository.CategoryRepository;
import pl.damianmrowinski.ebakerybackend.dto.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityToCategoryDtoConverter categoryDtoConverter;

    public CategoryServiceImpl(CategoryRepository categoryRepository,
                               CategoryEntityToCategoryDtoConverter categoryDtoConverter) {
        this.categoryRepository = categoryRepository;
        this.categoryDtoConverter = categoryDtoConverter;
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(categoryDtoConverter::convert)
                .collect(Collectors.toList());
    }

}
