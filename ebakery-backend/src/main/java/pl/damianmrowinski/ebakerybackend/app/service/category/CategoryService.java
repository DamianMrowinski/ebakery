package pl.damianmrowinski.ebakerybackend.app.service.category;

import org.springframework.transaction.annotation.Transactional;
import pl.damianmrowinski.ebakerybackend.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    @Transactional(readOnly = true)
    List<CategoryDto> findAll();

}
