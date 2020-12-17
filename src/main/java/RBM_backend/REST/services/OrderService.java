package RBM_backend.REST.services;

import RBM_backend.REST.models.Order;
import RBM_backend.REST.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public List<Order> getClientOrders(int id) {
        return orderRepository.getClientOrders(id);
    }

    public void changeOrderState(Order order) {
        int id = order.getZamowienie_id();
        String newState = order.getStan();

        orderRepository.changeOrderState(id, newState);
    }

    public Order findById(int id) {
        return orderRepository.findById(id);
    }

    /*
    public void changeOrderState(int id, String newState) {
        orderRepository.changeOrderState(id, newState);
    }*/

    /*
    public List<Order> getTodayOrders() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return orderRepository.getTodayOrders(formatter.format(date));
    }
    */

}
