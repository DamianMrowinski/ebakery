package pl.damianmrowinski.ebakerybackend.domain.entity.category;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

    public Category(
            String name,
            Set<Product> products
    ) {
        this.name = name;
        this.products = products;
    }
}
