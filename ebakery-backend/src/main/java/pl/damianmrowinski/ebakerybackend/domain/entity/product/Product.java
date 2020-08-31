package pl.damianmrowinski.ebakerybackend.domain.entity.product;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pl.damianmrowinski.ebakerybackend.domain.entity.category.Category;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String details;

    private Long amount;

    private BigDecimal price;

    private boolean active;

    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    public Product(
            String name,
            String details,
            Long amount,
            BigDecimal price,
            boolean active,
            String image,
            Category category
    ) {
        this.name = name;
        this.details = details;
        this.amount = amount;
        this.price = price;
        this.active = active;
        this.image = image;
        this.category = category;
    }
}
