package pl.damianmrowinski.ebakerybackend.app.service.purchase.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;
import pl.damianmrowinski.ebakerybackend.dto.purchase.PurchaseDto;

@Component
class PurchaseEntityToPurchaseDtoConverterImpl implements PurchaseEntityToPurchaseDtoConverter {

    @Override
    public PurchaseDto convert(Purchase purchase) {
        return new PurchaseDto(
                purchase.getId(),
                purchase.getFirstName(),
                purchase.getLastName(),
                purchase.getMail(),
                purchase.getCountry(),
                purchase.getCity(),
                purchase.getStreet(),
                purchase.getZipCode()
        );
    }
}
