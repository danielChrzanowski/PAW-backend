package RBM_backend.junctionTables.repositories;

import RBM_backend.junctionTables.models.OrderDish;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDishRepository extends CrudRepository<OrderDish, Integer> {
    @Query(value = "select * from zamowienie_danie where zamowienie_id=?1", nativeQuery = true)
    List<OrderDish> findAllById(int id);

    @Query(value = "select * from zamowienie_danie order by zamowienie_id desc limit 5000", nativeQuery = true)
    List<OrderDish> getAllOrders();
}
