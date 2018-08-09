package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.model.CartLine;
import com.spidermanteam.pizzeriaapp.model.Order;
import com.spidermanteam.pizzeriaapp.model.OrderProduct;
import com.spidermanteam.pizzeriaapp.service.base.CartLineService;
import com.spidermanteam.pizzeriaapp.service.base.OrderProductService;
import com.spidermanteam.pizzeriaapp.service.base.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;
    private OrderProductService orderProductService;
    private CartLineService cartLineService;

    @Autowired
    public OrderController(OrderService orderService, OrderProductService orderProductService, CartLineService cartLineService) {
        this.orderService = orderService;
        this.orderProductService = orderProductService;
        this.cartLineService = cartLineService;
    }


    @GetMapping("/api/orders/add")
    void addOrder(){
        List<CartLine> cartLines = cartLineService.listAllCartLines();
        List<OrderProduct> orderProductList = new ArrayList<>();
        double totalSum = 0;
        for (CartLine  cartline: cartLines
             ) {

            OrderProduct orderProduct = new OrderProduct(cartline.getProduct(),cartline.getQuantity(),cartline.getSubSum());
            orderProductService.addOrderProduct(orderProduct);
            orderProductList.add(orderProduct);
            totalSum+=cartline.getSubSum();

        }

        Order order = new Order(orderProductList, 0, totalSum);

        orderService.addOrder(order);
        cartLineService.deleteAllCartLines();

    }

    @GetMapping("/api/orders/listAll")
    List<Order> listAllOrders(){
        return orderService.listAllOrders();
    }
    @GetMapping("/api/orders/{id}")
    Order findById(@RequestParam("id") String id){
        int idNum = Integer.parseInt(id);
        return orderService.findById(idNum);
    }
}
