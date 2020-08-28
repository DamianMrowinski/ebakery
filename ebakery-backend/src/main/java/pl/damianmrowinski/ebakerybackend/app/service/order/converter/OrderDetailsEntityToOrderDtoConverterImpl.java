package pl.damianmrowinski.ebakerybackend.app.service.order.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;
import pl.damianmrowinski.ebakerybackend.dto.order.OrderDto;

@Component
class OrderDetailsEntityToOrderDtoConverterImpl implements OrderDetailsEntityToOrderDtoConverter {

    @Override
    public OrderDto convert(OrderDetails orderDetails) {
        return new OrderDto(
                orderDetails.getId(),
                orderDetails.getFirstName(),
                orderDetails.getLastName(),
                orderDetails.getMail(),
                orderDetails.getCountry(),
                orderDetails.getCity(),
                orderDetails.getStreet(),
                orderDetails.getZipCode()
        );
    }
}
