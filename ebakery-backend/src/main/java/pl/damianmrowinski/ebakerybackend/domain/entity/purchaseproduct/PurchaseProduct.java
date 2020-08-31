package pl.damianmrowinski.ebakerybackend.domain.entity.purchaseproduct;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.damianmrowinski.ebakerybackend.domain.entity.product.Product;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PurchaseProduct implements Serializable {

    @EmbeddedId
    private PurchaseProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("purchaseId")
    private Purchase purchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;

    private Integer amount;

    public PurchaseProduct(Purchase purchase,
                           Product product,
                           Integer amount) {
        this.purchase = purchase;
        this.product = product;
        this.amount = amount;
        this.id = new PurchaseProductId(purchase.getId(), product.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseProduct that = (PurchaseProduct) o;
        return id.equals(that.id) &&
                purchase.equals(that.purchase) &&
                product.equals(that.product) &&
                amount.equals(that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, purchase, product, amount);
    }
}
