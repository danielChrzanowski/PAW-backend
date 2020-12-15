package RBM_backend.junctionTables.services;

import RBM_backend.junctionTables.models.OrderDish;
import RBM_backend.junctionTables.repositories.OrderDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class OrderDishService {
    @Autowired
    private OrderDishRepository orderDishRepository;

    public List<OrderDish> getAllOrders() {
        List<OrderDish> orders = new ArrayList<>();
        orders.addAll(orderDishRepository.getAllOrders());
        return orders;
    }

    public List<OrderDish> getOrder(int id) {
        List<OrderDish> orders = new ArrayList<>();
        orders.addAll(orderDishRepository.findAllById(id));
        return orders;
    }
}
