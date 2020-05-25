package pawBackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawBackend.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query(value = "select * from zamowienie where data like ?1", nativeQuery = true)
    List<Order> getTodayOrders(String date);

    @Query(value = "select * from zamowienie where uzytkownik_id = ?1 order by zamowienie_id desc limit 10", nativeQuery = true)
    List<Order> getClientOrders(int id);
}
