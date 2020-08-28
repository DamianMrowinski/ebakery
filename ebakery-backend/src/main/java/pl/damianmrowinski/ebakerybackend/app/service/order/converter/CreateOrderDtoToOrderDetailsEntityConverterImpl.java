package pl.damianmrowinski.ebakerybackend.app.service.order.converter;

import org.springframework.stereotype.Component;
import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;
import pl.damianmrowinski.ebakerybackend.dto.order.CreateOrderDto;

@Component
public class CreateOrderDtoToOrderDetailsEntityConverterImpl implements CreateOrderDtoToOrderDetailsEntityConverter {

    @Override
    public OrderDetails convert(CreateOrderDto createOrderDto) {
        return new OrderDetails(
                createOrderDto.getFirstName(),
                createOrderDto.getLastName(),
                createOrderDto.getMail(),
                createOrderDto.getCountry(),
                createOrderDto.getCity(),
                createOrderDto.getStreet(),
                createOrderDto.getZipCode()
        );
    }

}
