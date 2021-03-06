package pl.damianmrowinski.ebakerybackend.domain.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.damianmrowinski.ebakerybackend.domain.entity.category.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}