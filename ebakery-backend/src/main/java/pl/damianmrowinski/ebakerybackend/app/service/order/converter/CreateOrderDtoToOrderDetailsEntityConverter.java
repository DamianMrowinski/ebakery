package pl.damianmrowinski.ebakerybackend.app.service.order.converter;

import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;
import pl.damianmrowinski.ebakerybackend.dto.order.CreateOrderDto;

public interface CreateOrderDtoToOrderDetailsEntityConverter {

    OrderDetails convert(CreateOrderDto createOrderDto);

}
