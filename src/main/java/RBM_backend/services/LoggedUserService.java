package RBM_backend.services;

import RBM_backend.model.LoggedUser;
import RBM_backend.repositories.LoggedUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggedUserService {
    @Autowired
    private LoggedUserRepository loggedUserRepository;

    public LoggedUser userByIdNoPassword(int id) {
        return loggedUserRepository.userByIdNoPassword(id);
    }
}
