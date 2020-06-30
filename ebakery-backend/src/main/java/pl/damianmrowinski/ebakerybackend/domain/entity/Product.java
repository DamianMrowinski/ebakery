package pl.damianmrowinski.ebakerybackend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "details")
    private String details;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "active")
    private boolean active;

    @Column(name = "image")
    private String image;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}