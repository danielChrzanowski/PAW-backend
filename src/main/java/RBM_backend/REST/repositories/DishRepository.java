package RBM_backend.REST.repositories;

import RBM_backend.REST.models.Dish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    List<Dish> findAll();
}
