package pl.damianmrowinski.ebakerybackend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.damianmrowinski.ebakerybackend.domain.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryId(Long id);

    List<Product> findByNameContaining(String name);

}
