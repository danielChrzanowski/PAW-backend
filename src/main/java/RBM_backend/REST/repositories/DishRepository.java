package RBM_backend.REST.repositories;

import RBM_backend.REST.models.Dish;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    List<Dish> findAll();

    @Query(value = "SELECT distinct danie_id, nazwa, skladniki,\n" +
            "kategoria, cena, kalorie, zdjecie FROM rbm.danie\n" +
            " join zamowienie_danie using(danie_id) \n" +
            " join zamowienie using(zamowienie_id)\n" +
            "where uzytkownik_id=?1 order by rand() limit 4;", nativeQuery = true)
    List<Dish> recommendDishes(int id);
}
