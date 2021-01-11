package RBM_backend.REST.repositories;

import RBM_backend.REST.models.Dish;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    List<Dish> findAll();

    @Query(value = "SELECT danie_id, nazwa, skladniki,\n" +
            "kategoria, cena, kalorie, zdjecie FROM rbm.danie\n" +
            " JOIN zamowienie_danie using(danie_id) \n" +
            " JOIN zamowienie using(zamowienie_id)\n" +
            "WHERE uzytkownik_id=?1 GROUP BY danie_id ORDER BY count(danie_id) DESC LIMIT 4", nativeQuery = true)
    List<Dish> recommendDishes(int id);
}
