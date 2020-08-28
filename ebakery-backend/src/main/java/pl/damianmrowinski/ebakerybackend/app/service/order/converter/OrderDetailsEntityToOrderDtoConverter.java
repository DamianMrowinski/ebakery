package pl.damianmrowinski.ebakerybackend.app.service.order.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;
import pl.damianmrowinski.ebakerybackend.dto.order.OrderDto;

public interface OrderDetailsEntityToOrderDtoConverter {

    OrderDto convert(OrderDetails orderDetails);

}
