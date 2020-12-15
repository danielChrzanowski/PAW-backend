package RBM_backend.tables.repositories;

import RBM_backend.tables.models.Dish;
import RBM_backend.tables.models.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DishRepository extends CrudRepository<Dish, Integer> {
        //@Query(value = "select * from zamowienie z inner join z.zamowienie_id order by zamowienie_id desc", nativeQuery = true)
   // List<Dish> findAll();

}
