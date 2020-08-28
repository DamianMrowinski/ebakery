package pl.damianmrowinski.ebakerybackend.domain.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long> {
}
