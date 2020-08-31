package pl.damianmrowinski.ebakerybackend.app.service.purchase.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;
import pl.damianmrowinski.ebakerybackend.dto.purchase.CreatePurchaseDto;

@Component
public class CreatePurchaseDtoToPurchaseEntityConverterImpl implements CreatePurchaseDtoToPurchaseEntityConverter {

    @Override
    public Purchase convert(CreatePurchaseDto createPurchaseDto) {
        return new Purchase(
                createPurchaseDto.getFirstName(),
                createPurchaseDto.getLastName(),
                createPurchaseDto.getMail(),
                createPurchaseDto.getCountry(),
                createPurchaseDto.getCity(),
                createPurchaseDto.getStreet(),
                createPurchaseDto.getZipCode(),
                // TODO: temp code for testing purpose
                null
        );
    }

}
