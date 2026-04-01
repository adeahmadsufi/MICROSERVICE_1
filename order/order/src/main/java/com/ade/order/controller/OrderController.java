package com.ade.order.controller;

import com.ade.order.model.Order;
import com.ade.order.service.OrderService;
import com.ade.order.vo.ResponseTemplate;

@RestController
@RequestMapping("api/order")

public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(path = "{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping(path = "/produk/{id}")
    public ResponseTemplate getOrderWithProduk(@PathVariable("id") Long orderId) {
        return orderService.getOrderWithProduk(orderId);
    }

    @GetMapping(path = "{id}")
    public void updateOrder(@PathVariable("id") Long id, 
        @RequestParam(required = false) int jumlah,
        @RequestParam(required = false) String tanggal,
        @RequestParam(required = false) String status) {
        orderService.updateOrder(id, jumlah, tanggal, status);
    }
}
