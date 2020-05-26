package pawBackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawBackend.model.LoggedUser;
import pawBackend.model.Password;
import pawBackend.model.User;

@Repository
public interface PasswordRepository extends CrudRepository<Password, Integer> {
   // @Query("select password from uzytkownik where uzytkownik_id=?1")
    Password findById(int id);
}
