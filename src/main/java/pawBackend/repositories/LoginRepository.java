package pawBackend.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pawBackend.model.Login;
import pawBackend.model.Password;
import pawBackend.model.User;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
    Login findByLogin(String login);

}
