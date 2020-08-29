package pl.damianmrowinski.ebakerybackend.app.service.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.category.converter.CategoryEntityToCategoryDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.category.Category;
import pl.damianmrowinski.ebakerybackend.domain.repository.category.CategoryRepository;
import pl.damianmrowinski.ebakerybackend.dto.category.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityToCategoryDtoConverter categoryDtoConverter;

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(categoryDtoConverter::convert)
                .collect(Collectors.toList());
    }

}
