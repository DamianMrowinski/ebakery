package pl.damianmrowinski.ebakerybackend.domain.entity.order;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderDetails {

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

    public OrderDetails(
            String firstName,
            String lastName,
            String mail,
            String country,
            String city,
            String street,
            String zipCode
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

}
