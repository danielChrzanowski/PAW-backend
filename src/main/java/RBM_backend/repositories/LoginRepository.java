package RBM_backend.repositories;

import RBM_backend.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
    Login findByLogin(String login);

}
