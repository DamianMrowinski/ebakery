package pl.damianmrowinski.ebakerybackend.app.service.purchase.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;
import pl.damianmrowinski.ebakerybackend.dto.purchase.PurchaseDto;

public interface PurchaseEntityToPurchaseDtoConverter {

    PurchaseDto convert(Purchase purchase);

}
