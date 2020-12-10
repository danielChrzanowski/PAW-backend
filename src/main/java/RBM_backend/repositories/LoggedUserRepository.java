package RBM_backend.repositories;

import RBM_backend.model.LoggedUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggedUserRepository extends CrudRepository<LoggedUser, Integer> {
    @Query(value = "select u.uzytkownik_id, u.imie, u.nazwisko, u.email, u.czy_pracownik from uzytkownik u where u.uzytkownik_id like ?1", nativeQuery = true)
    LoggedUser userByIdNoPassword(int id);

}
