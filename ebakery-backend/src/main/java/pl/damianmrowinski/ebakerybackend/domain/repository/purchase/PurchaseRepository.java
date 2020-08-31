package pl.damianmrowinski.ebakerybackend.domain.repository.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.damianmrowinski.ebakerybackend.domain.entity.purchase.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
