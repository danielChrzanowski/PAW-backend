package RBM_backend.tables.repositories;

import RBM_backend.tables.models.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
   // @Query(value = "select * from zamowienie_danie where zamowienie_id=?1", nativeQuery = true)
   // List<OrderDish> getOrderDishes(int id);

    //@Query(value = "select * from zamowienie z inner join z.zamowienie_id order by zamowienie_id desc", nativeQuery = true)
    List<Order> findAll();

    //pokaz tylko dzisiejsze - do zmiany na to
    // @Query(value = "select * from zamowienie where data like ?1", nativeQuery = true)
    @Query(value = "select * from zamowienie order by zamowienie_id desc", nativeQuery = true)
    List<Order> getTodayOrders(String date);

    @Query(value = "select * from zamowienie where uzytkownik_id = ?1 order by zamowienie_id desc limit 10", nativeQuery = true)
    List<Order> getClientOrders(int id);

    //do usuniecia
    @Transactional
    @Modifying
    @Query(value = "UPDATE `zamowienie` SET `stan` = ?2 WHERE `zamowienie`.`zamowienie_id` = ?1", nativeQuery = true)
    void changeState(int id, String newPassword);
}
