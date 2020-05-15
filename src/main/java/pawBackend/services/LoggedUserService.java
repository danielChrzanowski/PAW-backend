package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.LoggedUser;
import pawBackend.repositories.LoggedUserRepository;

@Service
public class LoggedUserService {
    @Autowired
    private LoggedUserRepository loggedUserRepository;

    public LoggedUser getUserByIdNoPassword(int id) {
        return loggedUserRepository.findByIdNoPassword(id);
    }
}
