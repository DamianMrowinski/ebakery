package pl.damianmrowinski.ebakerybackend.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.damianmrowinski.ebakerybackend.app.service.order.OrderService;
import pl.damianmrowinski.ebakerybackend.dto.order.CreateOrderDto;
import pl.damianmrowinski.ebakerybackend.dto.order.OrderDto;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderDto saveOrder(@RequestBody CreateOrderDto createOrderDto) {
        return orderService.save(createOrderDto);
    }

}
