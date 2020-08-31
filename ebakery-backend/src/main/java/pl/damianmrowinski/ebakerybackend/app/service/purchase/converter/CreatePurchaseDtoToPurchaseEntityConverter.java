package pl.damianmrowinski.ebakerybackend.app.service.purchase.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;
import pl.damianmrowinski.ebakerybackend.dto.purchase.CreatePurchaseDto;

public interface CreatePurchaseDtoToPurchaseEntityConverter {

    Purchase convert(CreatePurchaseDto createPurchaseDto);

}
