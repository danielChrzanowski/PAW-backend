package pawBackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawBackend.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
