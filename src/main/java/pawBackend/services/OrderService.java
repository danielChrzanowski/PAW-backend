package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.Order;
import pawBackend.repositories.OrderRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getTodayOrders() {
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(formatter.format(date));
        return orderRepository.getTodayOrders(formatter.format(date));
    }

    public List<Order> getClientOrders(int id) {
        return orderRepository.getClientOrders(id);
    }

}
