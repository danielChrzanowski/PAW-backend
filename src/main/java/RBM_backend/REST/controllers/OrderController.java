package RBM_backend.REST.controllers;

import RBM_backend.REST.models.Order;
import RBM_backend.REST.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/findAll")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/getClientOrders/{id}")
    public List<Order> getOrderDishes(@PathVariable int id) {
        return orderService.getClientOrders(id);
    }

    /*
    @GetMapping("/getTodayOrders")
    public List<Order> getTodayOrders() {
        return orderService.getTodayOrders();
    }
    */

}
