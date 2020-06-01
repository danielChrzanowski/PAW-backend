package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.Login;
import pawBackend.model.Password;
import pawBackend.repositories.LoginRepository;
import pawBackend.repositories.PasswordRepository;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public Login checkLogin(String login) {
        return loginRepository.findByLogin(login);
    }

}
