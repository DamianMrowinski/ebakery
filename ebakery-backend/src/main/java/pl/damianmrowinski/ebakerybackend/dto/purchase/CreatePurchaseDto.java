package pl.damianmrowinski.ebakerybackend.dto.purchase;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreatePurchaseDto {

    private final String firstName;
    private final String lastName;
    private final String mail;
    private final String country;
    private final String city;
    private final String street;
    private final String zipCode;

}
