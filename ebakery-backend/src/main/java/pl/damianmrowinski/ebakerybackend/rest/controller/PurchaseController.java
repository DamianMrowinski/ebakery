package pl.damianmrowinski.ebakerybackend.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.damianmrowinski.ebakerybackend.app.service.purchase.PurchaseService;
import pl.damianmrowinski.ebakerybackend.dto.purchase.CreatePurchaseDto;
import pl.damianmrowinski.ebakerybackend.dto.purchase.PurchaseDto;

@RestController
@RequestMapping(path = "/orders")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping
    public PurchaseDto saveOrder(@RequestBody CreatePurchaseDto createPurchaseDto) {
        return purchaseService.save(createPurchaseDto);
    }

}
