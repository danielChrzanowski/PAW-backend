package RBM_backend.REST.services;

import RBM_backend.REST.models.Login;
import RBM_backend.REST.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public Login checkLogin(String login) {
        return loginRepository.findByLogin(login);
    }
}