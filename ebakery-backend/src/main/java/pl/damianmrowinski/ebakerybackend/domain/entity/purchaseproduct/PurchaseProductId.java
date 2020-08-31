package pl.damianmrowinski.ebakerybackend.domain.entity.purchaseproduct;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class PurchaseProductId implements Serializable {

    @Column(name = "purchase_id")
    private Long purchaseId;

    @Column(name = "product_id")
    private Long productId;

    protected PurchaseProductId() {
    }

    public PurchaseProductId(
            Long purchaseId,
            Long productId) {
        this.purchaseId = purchaseId;
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseProductId that = (PurchaseProductId) o;
        return purchaseId.equals(that.purchaseId) &&
                productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseId, productId);
    }
}

