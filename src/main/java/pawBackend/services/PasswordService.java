package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.Password;
import pawBackend.repositories.PasswordRepository;

@Service
public class PasswordService {
    @Autowired
    PasswordRepository passwordRepository;

    public Password getPasswordById(int id) {
        return passwordRepository.findById(id);
    }
}
