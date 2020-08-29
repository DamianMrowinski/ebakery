package pl.damianmrowinski.ebakerybackend.domain.entity.category;

import lombok.Getter;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}
