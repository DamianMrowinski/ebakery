package pl.damianmrowinski.ebakerybackend.app.service.order;

import org.springframework.transaction.annotation.Transactional;
import pl.damianmrowinski.ebakerybackend.dto.order.CreateOrderDto;
import pl.damianmrowinski.ebakerybackend.dto.order.OrderDto;

public interface OrderService {

    @Transactional
    OrderDto save(CreateOrderDto createOrderDto);

}
