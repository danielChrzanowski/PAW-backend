package RBM_backend.services;

import RBM_backend.model.Login;
import RBM_backend.repositories.LoginRepository;
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
