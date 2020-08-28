package pl.damianmrowinski.ebakerybackend.app.service.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.damianmrowinski.ebakerybackend.app.service.order.converter.CreateOrderDtoToOrderDetailsEntityConverter;
import pl.damianmrowinski.ebakerybackend.app.service.order.converter.OrderDetailsEntityToOrderDtoConverter;
import pl.damianmrowinski.ebakerybackend.domain.entity.order.OrderDetails;
import pl.damianmrowinski.ebakerybackend.domain.repository.order.OrderRepository;
import pl.damianmrowinski.ebakerybackend.dto.order.CreateOrderDto;
import pl.damianmrowinski.ebakerybackend.dto.order.OrderDto;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CreateOrderDtoToOrderDetailsEntityConverter dtoToEntityConverter;
    private final OrderDetailsEntityToOrderDtoConverter entityToDtoConverter;

    public OrderDto save(CreateOrderDto createOrderDto) {
        OrderDetails orderDetails = dtoToEntityConverter.convert(createOrderDto);
        orderRepository.save(orderDetails);
        return entityToDtoConverter.convert(orderDetails);
    }

}
