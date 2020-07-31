package pl.damianmrowinski.ebakerybackend.domain.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "order")
@Getter
public class Order {

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

    @CreationTimestamp
    private Date createdDate;

}
