package RBM_backend.REST.services;

import RBM_backend.REST.models.Dish;
import RBM_backend.REST.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    @Autowired
    DishRepository dishRepository;

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public List<Dish> recommendDishes(int id) {
        return dishRepository.recommendDishes(id);
    }
}