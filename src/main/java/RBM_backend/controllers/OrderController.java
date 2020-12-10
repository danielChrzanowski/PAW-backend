package RBM_backend.controllers;

import RBM_backend.model.Order;
import RBM_backend.services.OrderService;
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

    @GetMapping("/getTodayOrders")
    public List<Order> getTodayOrders() {
        return orderService.getTodayOrders();
    }

    @GetMapping("/getClientOrders/{id}")
    public List<Order> getClientOrders(@PathVariable int id) {
        return orderService.getClientOrders(id);
    }

}
