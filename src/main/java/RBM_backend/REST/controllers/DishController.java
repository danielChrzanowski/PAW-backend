package RBM_backend.REST.controllers;

import RBM_backend.REST.models.Dish;
import RBM_backend.REST.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class DishController {
    @Autowired
    DishService dishService;

    @GetMapping("/findAllDishes")
    public List<Dish> findAll() {
        return dishService.findAll();
    }

    @GetMapping("/findDish/{id}")
    public Optional<Dish> findDish(@PathVariable int id) {
        return dishService.findDish(id);
    }
}
