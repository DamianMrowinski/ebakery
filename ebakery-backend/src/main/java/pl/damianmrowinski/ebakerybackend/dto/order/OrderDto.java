package pl.damianmrowinski.ebakerybackend.dto.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderDto {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String mail;
    private final String country;
    private final String city;
    private final String street;
    private final String zipCode;

}
