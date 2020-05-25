package pawBackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawBackend.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query(value = "select * from zamowienie where uzytkownik_id = ?1", nativeQuery = true)
    List<Order> getClientOrders(int id);
}
