package pl.damianmrowinski.ebakerybackend.domain.entity.purchase;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchaseproduct.PurchaseProduct;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String mail;

    private String country;

    private String city;

    private String street;

    private String zipCode;

    @OneToMany(
            mappedBy = "purchase",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PurchaseProduct> purchaseProducts = new ArrayList<>();

    public Purchase(
            String firstName,
            String lastName,
            String mail,
            String country,
            String city,
            String street,
            String zipCode,
            List<PurchaseProduct> purchaseProducts
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.purchaseProducts = purchaseProducts;
    }

    public void setPurchaseProducts(List<PurchaseProduct> purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
    }
}
