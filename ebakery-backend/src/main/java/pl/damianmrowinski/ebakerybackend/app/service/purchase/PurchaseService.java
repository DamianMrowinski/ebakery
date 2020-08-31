package pl.damianmrowinski.ebakerybackend.app.service.purchase;

import org.springframework.transaction.annotation.Transactional;
import pl.damianmrowinski.ebakerybackend.dto.purchase.CreatePurchaseDto;
import pl.damianmrowinski.ebakerybackend.dto.purchase.PurchaseDto;

public interface PurchaseService {

    @Transactional
    PurchaseDto save(CreatePurchaseDto createPurchaseDto);

}
