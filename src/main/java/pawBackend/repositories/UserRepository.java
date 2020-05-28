package pawBackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawBackend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);

}
