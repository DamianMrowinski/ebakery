package pl.damianmrowinski.ebakerybackend.app.service.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.purchase.converter.CreatePurchaseDtoToPurchaseEntityConverter;
import pl.damianmrowinski.ebakerybackend.app.service.purchase.converter.PurchaseEntityToPurchaseDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchaseproduct.PurchaseProduct;
import pl.damianmrowinski.ebakerybackend.domain.repository.product.ProductRepository;
import pl.damianmrowinski.ebakerybackend.domain.repository.purchase.PurchaseRepository;
import pl.damianmrowinski.ebakerybackend.dto.purchase.CreatePurchaseDto;
import pl.damianmrowinski.ebakerybackend.dto.purchase.PurchaseDto;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final CreatePurchaseDtoToPurchaseEntityConverter dtoToEntityConverter;
    private final PurchaseEntityToPurchaseDtoConverter entityToDtoConverter;

    private final ProductRepository productRepository;

    public PurchaseDto save(CreatePurchaseDto createPurchaseDto) {
        Purchase purchase = dtoToEntityConverter.convert(createPurchaseDto);
        purchaseRepository.save(purchase);

        //TODO: temp code for testing purpose
        Product product = productRepository.getOne(1L);
        PurchaseProduct purchaseProduct = new PurchaseProduct(purchase, product, 10);
        ArrayList<PurchaseProduct> purchasedProducts = new ArrayList<>();
        purchasedProducts.add(purchaseProduct);

        purchase.setPurchaseProducts(purchasedProducts);

        return entityToDtoConverter.convert(purchase);
    }

}
