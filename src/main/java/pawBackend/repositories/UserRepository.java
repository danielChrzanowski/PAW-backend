package pawBackend.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pawBackend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `uzytkownik` SET `password` = ?2 WHERE `uzytkownik`.`uzytkownik_id` = ?1", nativeQuery = true)
    void changePassword(int id, String newPassword);
}
