package RBM_backend.REST.repositories;

import RBM_backend.REST.models.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query(value = "select * from zamowienie order by zamowienie_id desc limit 100", nativeQuery = true)
    List<Order> findAll();

    @Query(value = "select * from zamowienie where uzytkownik_id = ?1 order by zamowienie_id desc limit 100", nativeQuery = true)
    List<Order> getClientOrders(int id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `zamowienie` SET `stan` = ?2 WHERE `zamowienie`.`zamowienie_id` = ?1", nativeQuery = true)
    void changeOrderState(int id, String newState);

}
