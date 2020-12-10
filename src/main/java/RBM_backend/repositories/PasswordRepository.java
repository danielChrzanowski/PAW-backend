package RBM_backend.repositories;

import RBM_backend.model.Password;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PasswordRepository extends CrudRepository<Password, Integer> {
    // @Query("select password from uzytkownik where uzytkownik_id=?1")
    Password findById(int id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `uzytkownik` SET `password` = ?2 WHERE `uzytkownik`.`uzytkownik_id` = ?1", nativeQuery = true)
    void changePassword(int id, String newPassword);
}
