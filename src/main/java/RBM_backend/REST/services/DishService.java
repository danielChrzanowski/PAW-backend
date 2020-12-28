package RBM_backend.REST.services;

import RBM_backend.REST.models.Dish;
import RBM_backend.REST.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {
    @Autowired
    DishRepository dishRepository;

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public Optional<Dish> findDish(int id) {
        return dishRepository.findById(id);
    }
}