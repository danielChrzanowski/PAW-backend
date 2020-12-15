package RBM_backend.REST.services;

import RBM_backend.REST.models.Order;
import RBM_backend.REST.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    //public List<OrderDish> getOrderDishes(int id){return orderRepository.getOrderDishes(id);}

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public List<Order> getTodayOrders() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return orderRepository.getTodayOrders(formatter.format(date));
    }

    public List<Order> getClientOrders(int id) {
        //do usuniecia
        changeOrderStateUser4();

        return orderRepository.getClientOrders(id);
    }

    //do usuniecia
    public void changeOrderStateUser4() {
        String state = "rozpoczęto";

        Random random = new Random();
        int losowy = random.nextInt(3);
        switch (losowy) {
            case 0:
                state = "rozpoczęto";
                break;
            case 1:
                state = "w trakcie";
                break;
            case 2:
                state = "zakończono";
                break;
        }

        losowy = random.nextInt(20 - 11 + 1) + 11;

        orderRepository.changeState(losowy, state);
    }

}
