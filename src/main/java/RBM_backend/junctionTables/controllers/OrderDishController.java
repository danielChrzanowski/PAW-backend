package RBM_backend.junctionTables.controllers;

import RBM_backend.junctionTables.models.OrderDish;
import RBM_backend.junctionTables.services.OrderDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class OrderDishController {
    @Autowired
    OrderDishService orderDishService;

    @GetMapping("/getAllOrders")
    public List<OrderDish> getAllOrders(){return orderDishService.getAllOrders();}

    @GetMapping("/getOrder/{id}")
    public List<OrderDish> getOrder(@PathVariable int id){return orderDishService.getOrder(id);}


}
