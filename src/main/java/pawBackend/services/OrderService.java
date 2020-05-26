package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.Order;
import pawBackend.model.User;
import pawBackend.repositories.OrderRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getTodayOrders() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(formatter.format(date));
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

        losowy = random.nextInt(20-11+1)+11;


        orderRepository.changeState(losowy, state);
    }

}
